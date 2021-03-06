/*
 * Copyright (C) 2005-2010 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.repo.webdav;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.alfresco.model.ContentModel;
import org.alfresco.repo.security.permissions.AccessDeniedException;
import org.alfresco.service.cmr.model.FileFolderService;
import org.alfresco.service.cmr.model.FileInfo;
import org.alfresco.service.cmr.model.FileNotFoundException;
import org.alfresco.service.cmr.repository.ContentReader;
import org.alfresco.service.cmr.repository.ContentService;
import org.alfresco.service.cmr.repository.ContentWriter;
import org.alfresco.service.cmr.repository.NodeRef;
import org.dom4j.DocumentHelper;
import org.dom4j.io.XMLWriter;
import org.xml.sax.Attributes;

/**
 * Implements the WebDAV MOVE method
 * 
 * @author Derek Hulley
 * @author David Ward
 */
public class MoveMethod extends HierarchicalMethod
{
    /**
     * Default constructor
     */
    public MoveMethod()
    {
    }
    
    protected boolean isMove()
    {
        return true;
    }

    /**
     * Exceute the request
     * 
     * @exception WebDAVServerException
     */
    protected final void executeImpl() throws WebDAVServerException, Exception
    {
        NodeRef rootNodeRef = getRootNodeRef();
        String servletPath = getServletPath();
        // Debug
        if (logger.isDebugEnabled())
        {
            logger.debug((isMove() ? "Move" : "Copy") + " from " + getPath() + " to " + getDestinationPath());
        }

        // the source must exist
        String sourcePath = getPath();
        FileInfo sourceInfo = null;
        try
        {
            sourceInfo = getDAVHelper().getNodeForPath(rootNodeRef, sourcePath, servletPath);
        }
        catch (FileNotFoundException e)
        {
            throw new WebDAVServerException(HttpServletResponse.SC_NOT_FOUND);
        }

        FileInfo sourceParentInfo = getDAVHelper().getParentNodeForPath(rootNodeRef, sourcePath, servletPath);

        // the destination parent must exist
        String destPath = getDestinationPath();
        FileInfo destParentInfo = null;
        try
        {
            if (destPath.endsWith(WebDAVHelper.PathSeperator))
            {
                destPath = destPath.substring(0, destPath.length() - 1);
            }
            destParentInfo = getDAVHelper().getParentNodeForPath(rootNodeRef, destPath, servletPath);
        }
        catch (FileNotFoundException e)
        {
            if (logger.isDebugEnabled())
            {
                logger.debug("Destination parent folder doesn't exist: " + destPath);
            }
            throw new WebDAVServerException(HttpServletResponse.SC_CONFLICT);
        }

        // check for the existence of the destination node
        FileInfo destInfo = null;
        boolean destExists = false;
        try
        {
            destInfo = getDAVHelper().getNodeForPath(rootNodeRef, destPath, servletPath);
            if (!destInfo.getNodeRef().equals(sourceInfo.getNodeRef()))
            {
                // ALF-7079 fix, if destInfo is a hidden shuffle target then pretend it's not there
                destExists = !isHidden(destInfo.getNodeRef());
                if (!hasOverWrite() && destExists)
                {
                    if (logger.isDebugEnabled())
                    {
                        logger.debug("Destination exists but overwrite is not allowed");
                    }
                    // it exists and we may not overwrite
                    throw new WebDAVServerException(HttpServletResponse.SC_PRECONDITION_FAILED);
                }
                checkNode(destInfo);
            }
        }
        catch (FileNotFoundException e)
        {
            // destination doesn't exist
        }

        NodeRef sourceNodeRef = sourceInfo.getNodeRef();
        NodeRef sourceParentNodeRef = sourceParentInfo.getNodeRef();
        NodeRef destParentNodeRef = destParentInfo.getNodeRef();
        
        String name = getDAVHelper().splitPath(destPath)[1];

        moveOrCopy(sourceNodeRef, sourceParentNodeRef, destParentNodeRef, name);

        // Set the response status
        if (!destExists)
        {
            m_response.setStatus(HttpServletResponse.SC_CREATED);
        }
        else
        {
            m_response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        }
    }       
       
    protected void parseRequestHeaders() throws WebDAVServerException
    {
        super.parseRequestHeaders();
        parseIfHeader();
    } 

    protected void moveOrCopy(
            NodeRef sourceNodeRef,
            NodeRef sourceParentNodeRef,
            NodeRef destParentNodeRef,
            String name) throws Exception
    {
        FileFolderService fileFolderService = getFileFolderService();
        NodeRef rootNodeRef = getRootNodeRef();

        String sourcePath = getPath();
        List<String> sourcePathElements = getDAVHelper().splitAllPaths(sourcePath);
        FileInfo sourceFileInfo = null;
        
        String destPath = getDestinationPath();
        List<String> destPathElements = getDAVHelper().splitAllPaths(destPath);
        FileInfo destFileInfo = null;
        
        boolean isMove = isMove();

        try
        {
            // get the node to move
            sourceFileInfo = fileFolderService.resolveNamePath(rootNodeRef, sourcePathElements);
            destFileInfo = fileFolderService.resolveNamePath(rootNodeRef, destPathElements);
        }
        catch (FileNotFoundException e)
        {
            if (sourceFileInfo == null)
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug("Source node not found: " + sourcePath);
                }
                // nothing to move
                throw new WebDAVServerException(HttpServletResponse.SC_NOT_FOUND);
            }
        }
        if (isMove)
        {
            checkNode(sourceFileInfo);
        }
        // ALF-7079 fix, if destination exists then its content is updated with source content and source is deleted if
        // this is a move
        if (destFileInfo != null)
        {
            copyContentOnly(sourceNodeRef, destFileInfo, fileFolderService);
            setHidden(destFileInfo.getNodeRef(), false);
            if (isMove)
            {
                fileFolderService.delete(sourceNodeRef);
            }
        }
        // If this is a copy then the source is just copied to destination.
        else if (!isMove)
        {
            fileFolderService.copy(sourceNodeRef, destParentNodeRef, name);
        }
        // If this is a move and the destination looks like the start of a shuffle operation, then the source is just
        // copied to destination and the source is hidden.
        else if (getDAVHelper().isRenameShuffle(destPath) && !getDAVHelper().isRenameShuffle(sourcePath))
        {
            destFileInfo = fileFolderService.create(destParentNodeRef, name, ContentModel.TYPE_CONTENT);
            copyContentOnly(sourceNodeRef, destFileInfo, fileFolderService);
            setHidden(sourceNodeRef, true);

            // As per the WebDAV spec, we make sure the node is unlocked once moved
            getDAVHelper().getLockService().unlock(sourceNodeRef);
        }
        else if (sourceParentNodeRef.equals(destParentNodeRef)) 
        { 
           // It is a simple rename operation
           try
           {
               fileFolderService.rename(sourceNodeRef, name);
               // As per the WebDAV spec, we make sure the node is unlocked once moved
               getDAVHelper().getLockService().unlock(sourceNodeRef);
           }
           catch (AccessDeniedException e)
           {
               XMLWriter xml = createXMLWriter();

               Attributes nullAttr = getDAVHelper().getNullAttributes();

               xml.startElement(WebDAV.DAV_NS, WebDAV.XML_ERROR, WebDAV.XML_NS_ERROR, nullAttr);
               // Output error
               xml.write(DocumentHelper.createElement(WebDAV.XML_NS_CANNOT_MODIFY_PROTECTED_PROPERTY));

               xml.endElement(WebDAV.DAV_NS, WebDAV.XML_ERROR, WebDAV.XML_NS_ERROR);
               m_response.setStatus(HttpServletResponse.SC_CONFLICT);
           }
        }
        else
        {
            // It is a simple move operation 
            fileFolderService.moveFrom(sourceNodeRef, sourceParentNodeRef, destParentNodeRef, name);  

            // As per the WebDAV spec, we make sure the node is unlocked once moved
            getDAVHelper().getLockService().unlock(sourceNodeRef);
        }
    }
    
    private void copyContentOnly(NodeRef sourceNodeRef, FileInfo destFileInfo, FileFolderService fileFolderService)
    {
    	ContentService contentService = getContentService();
        ContentReader reader = contentService.getReader(sourceNodeRef, ContentModel.PROP_CONTENT);
        ContentWriter contentWriter = contentService.getWriter(destFileInfo.getNodeRef(), ContentModel.PROP_CONTENT, true);
        contentWriter.putContent(reader);
    }
}

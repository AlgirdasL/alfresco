/*
 * Copyright (C) 2005-2012 Alfresco Software Limited.
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
import org.alfresco.service.cmr.model.FileFolderService;
import org.alfresco.service.cmr.model.FileInfo;
import org.alfresco.service.cmr.model.FileNotFoundException;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.site.SiteService;
import org.alfresco.service.cmr.webdav.WebDavService;
import org.alfresco.service.cmr.repository.NodeService;

/**
 * Implements the WebDAV DELETE method
 * 
 * @author gavinc
 */
public class DeleteMethod extends WebDAVMethod implements ActivityPostProducer
{
    private ActivityPoster activityPoster;
    
    /**
     * Default constructor
     */
    public DeleteMethod()
    {
    }

    /**
     * Parse the request headers
     * 
     * @exception WebDAVServerException
     */
    protected void parseRequestHeaders() throws WebDAVServerException
    {
        parseIfHeader();
    }

    /**
     * Parse the request body
     * 
     * @exception WebDAVServerException
     */
    protected void parseRequestBody() throws WebDAVServerException
    {
        // Nothing to do in this method
    }

    /**
     * Execute the request
     * 
     * @exception WebDAVServerException
     */
    protected void executeImpl() throws WebDAVServerException, Exception
    {
        if (logger.isDebugEnabled())
        {
            logger.debug("WebDAV DELETE: " + getPath());
        }
        
        FileFolderService fileFolderService = getFileFolderService();

        NodeRef rootNodeRef = getRootNodeRef();

        String path = getPath();
        List<String> pathElements = getDAVHelper().splitAllPaths(path);
        FileInfo fileInfo = null;
        try
        {
            // get the node to delete
            fileInfo = fileFolderService.resolveNamePath(rootNodeRef, pathElements);
        }
        catch (FileNotFoundException e)
        {
            if (logger.isDebugEnabled())
            {
                logger.debug("Node not found: " + getPath());
            }
            throw new WebDAVServerException(HttpServletResponse.SC_NOT_FOUND);
        }

        checkNode(fileInfo);

        NodeService nodeService = getNodeService();
        NodeRef nodeRef = fileInfo.getNodeRef();
        // MNT-181: working copies and versioned nodes are hidden rather than deleted
        if (nodeService.hasAspect(nodeRef, ContentModel.ASPECT_WORKING_COPY) || nodeService.hasAspect(nodeRef, ContentModel.ASPECT_VERSIONABLE))
        {
            setHidden(nodeRef, true);
            getDAVLockService().unlock(nodeRef);
        }
        // We just ensure already-hidden nodes are left unlocked
        else if (isHidden(nodeRef))
        {
            getDAVLockService().unlock(nodeRef);            
        }
        // A 'real' delete
        else
        {
            // As this content will be deleted, we need to extract some info before it's no longer available.
            String siteId = getSiteId();
            NodeRef deletedNodeRef = fileInfo.getNodeRef();
            FileInfo parentFile = getDAVHelper().getParentNodeForPath(getRootNodeRef(), path, getServletPath());
            // Delete it
            fileFolderService.delete(deletedNodeRef);
            // Don't post activity data for hidden files, resource forks etc.
            if (!getDAVHelper().isRenameShuffle(path))
            {
                 postActivity(parentFile, fileInfo, siteId);
            }
        }
    }

    
    /**
     * Create a deletion activity post.
     * 
     * @param parent The FileInfo for the deleted file's parent.
     * @param deletedFile The FileInfo for the deleted file.
     * @throws WebDAVServerException 
     */
    protected void postActivity(FileInfo parent, FileInfo deletedFile, String siteId) throws WebDAVServerException
    {
        WebDavService davService = getDAVHelper().getServiceRegistry().getWebDavService();
        if (!davService.activitiesEnabled())
        {
            // Don't post activities if this behaviour is disabled.
            return;
        }
        
        String tenantDomain = getTenantDomain();
        
        // Check there is enough information to publish site activity.
        if (!siteId.equals(WebDAVHelper.EMPTY_SITE_ID))
        {
            SiteService siteService = getServiceRegistry().getSiteService();
            NodeRef documentLibrary = siteService.getContainer(siteId, SiteService.DOCUMENT_LIBRARY);
            String parentPath = "/";
            try
            {
                parentPath = getDAVHelper().getPathFromNode(documentLibrary, parent.getNodeRef());
            }
            catch (FileNotFoundException error)
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug("No " + SiteService.DOCUMENT_LIBRARY + " container found.");
                }
            }
            
            activityPoster.postFileFolderDeleted(siteId, tenantDomain, parentPath, parent, deletedFile);
        }  
    }
    
    @Override
    public void setActivityPoster(ActivityPoster activityPoster)
    {
        this.activityPoster = activityPoster;
    }
}

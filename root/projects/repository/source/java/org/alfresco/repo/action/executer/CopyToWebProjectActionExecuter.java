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

package org.alfresco.repo.action.executer;

import java.util.List;

import org.alfresco.model.ContentModel;
import org.alfresco.repo.action.ParameterDefinitionImpl;
import org.alfresco.service.cmr.action.Action;
import org.alfresco.service.cmr.action.ParameterDefinition;
import org.alfresco.service.cmr.dictionary.DataTypeDefinition;
import org.alfresco.service.cmr.repository.CrossRepositoryCopyService;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.repository.NodeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Copy to Web Project action executor
 * <p>
 * Copies the actioned upon node to a specified folder in a specified Web
 * Project.
 * 
 * @author gavinc
 */
public class CopyToWebProjectActionExecuter extends ActionExecuterAbstractBase
{
   public static final String ERR_OVERWRITE = "Unable to overwrite copy because more than one have been found.";

   public static final String NAME = "copy-to-web-project";

   public static final String PARAM_DESTINATION_FOLDER = "destination-folder";

   public static final String PARAM_OVERWRITE_COPY = "overwrite-copy";
   
   private static final Log logger = LogFactory.getLog(CopyToWebProjectActionExecuter.class);

   /**
    * Cross repository copy service
    */
   private CrossRepositoryCopyService crCopyService;

   /**
    * The node service
    */
   private NodeService nodeService;

   /**
    * Sets the node service
    * 
    * @param nodeService the node service
    */
   public void setNodeService(NodeService nodeService)
   {
      this.nodeService = nodeService;
   }

   /**
    * Sets the cross repository copy service
    * 
    * @param crCopyService the cross repository copy service
    */
   public void setCrossRepositoryCopyService(CrossRepositoryCopyService crCopyService)
   {
      this.crCopyService = crCopyService;
   }

   /**
    * @see org.alfresco.repo.action.ParameterizedItemAbstractBase#addParameterDefinitions(java.util.List)
    */
   @Override
   protected void addParameterDefinitions(List<ParameterDefinition> paramList)
   {
      paramList.add(new ParameterDefinitionImpl(PARAM_DESTINATION_FOLDER,
               DataTypeDefinition.NODE_REF, true,
               getParamDisplayLabel(PARAM_DESTINATION_FOLDER)));
   }

   /**
    * @see org.alfresco.repo.action.executer.ActionExecuter#execute(org.alfresco.repo.ref.NodeRef,
    *      org.alfresco.repo.ref.NodeRef)
    */
   public void executeImpl(Action ruleAction, NodeRef actionedUponNodeRef)
   {
      if (this.nodeService.exists(actionedUponNodeRef) == true)
      {
         // get the destination, note this will be a NodeRef representing an AVM path
         NodeRef destinationParent = (NodeRef) ruleAction
                  .getParameterValue(PARAM_DESTINATION_FOLDER);
         
         // get the name of the source
         String name = (String)this.nodeService.getProperty(actionedUponNodeRef, ContentModel.PROP_NAME);
         
         if (logger.isDebugEnabled())
         {
            logger.debug("Copying " + actionedUponNodeRef.toString() + "(" + name + ") to " + 
                     destinationParent.toString());
         }
         
         // copy the node being actioned to the destination AVM path
         this.crCopyService.copy(actionedUponNodeRef, destinationParent, name);
      }
      else
      {
         if (logger.isWarnEnabled())
         {
            logger.warn("Not copying " + actionedUponNodeRef.toString() + " as it no longer exists!");
         }
      }
   }
}

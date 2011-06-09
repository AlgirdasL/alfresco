/*
 * Copyright (C) 2005-2010 Alfresco Software Limited.
 *
 * This file is part of the Alfresco Web Quick Start module.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.module.org_alfresco_module_wcmquickstart.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.transaction.UserTransaction;

import org.alfresco.model.ContentModel;
import org.alfresco.module.org_alfresco_module_wcmquickstart.WCMQuickStartTest;
import org.alfresco.service.cmr.ml.MultilingualContentService;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.namespace.QName;

/**
 * Tests for the way that the temporary multilingual aspect behaviour works
 * 
 * @author Nick Burch
 */
public class TemporaryMultilingualAspectTest extends WCMQuickStartTest implements WebSiteModel
{
    private MultilingualContentService multilingualContentService;
    
    @Override
    protected void setUp() throws Exception 
    {
        super.setUp();
        
        multilingualContentService = (MultilingualContentService)appContext.getBean("multilingualContentService");
    }
    
    public void testSiblingTranslationDocs() throws Exception
    {
        UserTransaction userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        // Create a French document
        NodeRef french = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("French"), TYPE_ARTICLE
        ).getChildRef();
        multilingualContentService.makeTranslation(french, Locale.FRENCH);
        
        // Now create the Spanish translation of it
        NodeRef spanish = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Spanish"), TYPE_ARTICLE
        ).getChildRef();
        
        Map<QName,Serializable> props = new HashMap<QName, Serializable>();
        props.put(PROP_TRANSLATION_OF, french);
        props.put(PROP_LANGUAGE, "Spanish");
        nodeService.addAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        assertEquals(true, nodeService.hasAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(false, nodeService.hasAspect(spanish, ContentModel.ASPECT_LOCALIZED));
        assertEquals(false, multilingualContentService.isTranslation(spanish));
        
        
        // Commit
        userTransaction.commit();
        
        
        // Check the behaviour fired properly
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        assertEquals(false, nodeService.hasAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(true, nodeService.hasAspect(spanish, ContentModel.ASPECT_LOCALIZED));
        assertEquals(true, multilingualContentService.isTranslation(spanish));
        
        
        
        // Now try to create one which doesn't have a language set
        // Because we don't have a translated parent, we can't do anything for it
        NodeRef german = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("German"), TYPE_ARTICLE
        ).getChildRef();
        
        props = new HashMap<QName, Serializable>();
        props.put(PROP_TRANSLATION_OF, french);
        nodeService.addAspect(german, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        assertEquals(false, nodeService.hasAspect(german, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(false, nodeService.hasAspect(german, ContentModel.ASPECT_LOCALIZED));
        assertEquals(false, multilingualContentService.isTranslation(german));
        
        userTransaction.commit();
    }
    
    public void testSiblingTranslationFolders() throws Exception
    {
        UserTransaction userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
     
        // Create a French folder, with some collections
        NodeRef french = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("French"), TYPE_SECTION
        ).getChildRef();
        multilingualContentService.makeTranslation(french, Locale.FRENCH);
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        // TODO Populate the collection 
        
        
        // Now create the Spanish one
        NodeRef spanish = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Spanish"), TYPE_SECTION
        ).getChildRef();
        
        Map<QName,Serializable> props = new HashMap<QName, Serializable>();
        props.put(PROP_TRANSLATION_OF, french);
        props.put(PROP_LANGUAGE, "Spanish");
        nodeService.addAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL, props);

        
        assertEquals(true, nodeService.hasAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(false, nodeService.hasAspect(spanish, ContentModel.ASPECT_LOCALIZED));
        assertEquals(false, multilingualContentService.isTranslation(spanish));
        
        
        // Commit
        userTransaction.commit();
        
        
        // Check the behaviour fired properly
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        assertEquals(false, nodeService.hasAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(true, nodeService.hasAspect(spanish, ContentModel.ASPECT_LOCALIZED));
        assertEquals(true, multilingualContentService.isTranslation(spanish));
        
        // Now check the Spanish collections
        // TODO
        
        userTransaction.commit();
    }
    
    public void testTranslationDocAllFoldersExist() throws Exception
    {
        // Create a French folder, with two sub folders
        UserTransaction userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
     
        NodeRef french = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("French"), TYPE_SECTION
        ).getChildRef();
        multilingualContentService.makeTranslation(french, Locale.FRENCH);
        
        NodeRef fr_F1 = nodeService.createNode(
                french, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Sub1"), TYPE_SECTION
        ).getChildRef();
        NodeRef fr_F2 = nodeService.createNode(
                fr_F1, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Sub2"), TYPE_SECTION
        ).getChildRef();
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();

        
        // Create a Spanish translation folder, and its two sub folders
        NodeRef spanish = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Spanish"), TYPE_SECTION
        ).getChildRef();
        
        Map<QName,Serializable> props = new HashMap<QName, Serializable>();
        props.put(PROP_TRANSLATION_OF, french);
        props.put(PROP_LANGUAGE, "Spanish");
        nodeService.addAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        NodeRef es_F1 = nodeService.createNode(
                spanish, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Sub1"), TYPE_SECTION
        ).getChildRef();
        NodeRef es_F2 = nodeService.createNode(
                es_F1, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Sub2"), TYPE_SECTION
        ).getChildRef();
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        
        // Now create a document inside the French subfolder
        NodeRef fr_Doc = nodeService.createNode(
                fr_F2, ContentModel.ASSOC_CONTAINS,
                QName.createQName("French"), TYPE_ARTICLE
        ).getChildRef();
        props = new HashMap<QName, Serializable>(); // No properties needed
        nodeService.addAspect(fr_Doc, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        // Finally create the Spanish translation document
        NodeRef es_Doc = nodeService.createNode(
                es_F2, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Spanish"), TYPE_ARTICLE
        ).getChildRef();
        
        props = new HashMap<QName, Serializable>(); // Only need to mark what translation of
        props.put(PROP_TRANSLATION_OF, fr_Doc);
        nodeService.addAspect(es_Doc, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        
        // Now check
        assertEquals(false, nodeService.hasAspect(french, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(true, nodeService.hasAspect(french, ContentModel.ASPECT_LOCALIZED));
        assertEquals(true, multilingualContentService.isTranslation(french));
        assertEquals("fr", nodeService.getProperty(french, ContentModel.PROP_LOCALE).toString());
        
        assertEquals(false, nodeService.hasAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(true, nodeService.hasAspect(spanish, ContentModel.ASPECT_LOCALIZED));
        assertEquals(true, multilingualContentService.isTranslation(spanish));
        assertEquals("spanish", nodeService.getProperty(spanish, ContentModel.PROP_LOCALE).toString());
        
        // The French document should have picked up French from its parent
        assertEquals(false, nodeService.hasAspect(fr_Doc, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(true, nodeService.hasAspect(fr_Doc, ContentModel.ASPECT_LOCALIZED));
        assertEquals(true, multilingualContentService.isTranslation(fr_Doc));
        assertEquals("fr", nodeService.getProperty(fr_Doc, ContentModel.PROP_LOCALE).toString());
        
        // The Spanish document should have picked up Spanish from its parent
        assertEquals(false, nodeService.hasAspect(es_Doc, ASPECT_TEMPORARY_MULTILINGUAL));
        assertEquals(true, nodeService.hasAspect(es_Doc, ContentModel.ASPECT_LOCALIZED));
        assertEquals(true, multilingualContentService.isTranslation(es_Doc));
        assertEquals("spanish", nodeService.getProperty(es_Doc, ContentModel.PROP_LOCALE).toString());
    }
    
    public void testTranslationDocFoldersToBeCreated() throws Exception
    {
        // Create a French folder, with two sub folders
        UserTransaction userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
     
        NodeRef french = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("French"), TYPE_SECTION
        ).getChildRef();
        multilingualContentService.makeTranslation(french, Locale.FRENCH);
        
        NodeRef fr_F1 = nodeService.createNode(
                french, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Sub1"), TYPE_SECTION
        ).getChildRef();
        NodeRef fr_F2 = nodeService.createNode(
                fr_F1, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Sub2"), TYPE_SECTION
        ).getChildRef();
        
        // TODO Collections
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();
        
        
        // Create a Spanish translation folder, but no sub folder
        NodeRef spanish = nodeService.createNode(
                editorialSiteRoot, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Spanish"), TYPE_SECTION
        ).getChildRef();
        
        Map<QName,Serializable> props = new HashMap<QName, Serializable>();
        props.put(PROP_TRANSLATION_OF, french);
        props.put(PROP_LANGUAGE, "Spanish");
        nodeService.addAspect(spanish, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();

        
        // Now create a document inside the French subfolder
        NodeRef fr_Doc = nodeService.createNode(
                fr_F2, ContentModel.ASSOC_CONTAINS,
                QName.createQName("French"), TYPE_ARTICLE
        ).getChildRef();
        props = new HashMap<QName, Serializable>(); // No properties needed
        nodeService.addAspect(fr_Doc, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        
        // Finally create the Spanish translation document
        NodeRef es_Doc = nodeService.createNode(
                spanish, ContentModel.ASSOC_CONTAINS,
                QName.createQName("Spanish"), TYPE_ARTICLE
        ).getChildRef();
        
        props = new HashMap<QName, Serializable>(); // Only need to mark what translation of
        props.put(PROP_TRANSLATION_OF, fr_Doc);
        props.put(PROP_INITIALLY_ORPHANED, true);
        nodeService.addAspect(es_Doc, ASPECT_TEMPORARY_MULTILINGUAL, props);
        
        userTransaction.commit();
        userTransaction = transactionService.getUserTransaction();
        userTransaction.begin();

        
        // TODO
        
        // Ensure the intermediate Spanish sub folders were created
        
        // Ensure the intermediate Spanish folders got their collections
        
        // Ensure the translation ended up in the right place
    }
}

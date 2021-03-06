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
package org.alfresco.repo.tenant;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.transaction.UserTransaction;

import net.sf.acegisecurity.providers.encoding.PasswordEncoder;

import org.alfresco.error.AlfrescoRuntimeException;
import org.alfresco.repo.admin.RepoModelDefinition;
import org.alfresco.repo.content.ContentStore;
import org.alfresco.repo.dictionary.DictionaryComponent;
import org.alfresco.repo.domain.tenant.TenantAdminDAO;
import org.alfresco.repo.domain.tenant.TenantEntity;
import org.alfresco.repo.domain.tenant.TenantUpdateEntity;
import org.alfresco.repo.importer.ImporterBootstrap;
import org.alfresco.repo.node.db.DbNodeServiceImpl;
import org.alfresco.repo.security.authentication.AuthenticationContext;
import org.alfresco.repo.security.authentication.AuthenticationException;
import org.alfresco.repo.security.authentication.AuthenticationUtil;
import org.alfresco.repo.security.authentication.AuthenticationUtil.RunAsWork;
import org.alfresco.repo.thumbnail.ThumbnailRegistry;
import org.alfresco.repo.usage.UserUsageTrackingComponent;
import org.alfresco.repo.workflow.WorkflowDeployer;
import org.alfresco.service.cmr.admin.RepoAdminService;
import org.alfresco.service.cmr.module.ModuleService;
import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.cmr.repository.StoreRef;
import org.alfresco.service.cmr.view.RepositoryExporterService;
import org.alfresco.service.cmr.workflow.WorkflowDefinition;
import org.alfresco.service.cmr.workflow.WorkflowService;
import org.alfresco.service.transaction.TransactionService;
import org.alfresco.util.PropertyCheck;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.extensions.surf.util.I18NUtil;
import org.springframework.extensions.surf.util.ParameterCheck;

/**
 * MT Admin Service Implementation.
 * 
 */
public class MultiTAdminServiceImpl implements TenantAdminService, ApplicationContextAware, InitializingBean
{
    // Logger
    private static Log logger = LogFactory.getLog(MultiTAdminServiceImpl.class);
    
    // Keep hold of the app context
    private ApplicationContext ctx;
    
    // Dependencies    
    private NodeService nodeService;
    private RepoAdminService repoAdminService;
    private AuthenticationContext authenticationContext;
    private MultiTServiceImpl tenantService;
    
    protected TransactionService transactionService;
    protected DictionaryComponent dictionaryComponent;
    protected TenantAdminDAO tenantAdminDAO;
    protected PasswordEncoder passwordEncoder;
    protected ContentStore tenantFileContentStore;
    
    private ThumbnailRegistry thumbnailRegistry;
    private WorkflowService workflowService;
    private RepositoryExporterService repositoryExporterService;
    private ModuleService moduleService;
    private List<WorkflowDeployer> workflowDeployers = new ArrayList<WorkflowDeployer>();
    
    private String baseAdminUsername = null; 

    /*
     * Tenant domain/ids are unique strings that are case-insensitive. Tenant ids must be valid filenames. 
     * They may also map onto domains and hence should allow valid FQDN.
     *
     *       The following PCRE-style
     *       regex defines a valid label within a FQDN:
     *
     *          ^[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]$
     *
     *       Less formally:
     *
     *          o  Case insensitive
     *          o  First/last character:  alphanumeric
     *          o  Interior characters:   alphanumeric plus hyphen
     *          o  Minimum length:        2  characters
     *          o  Maximum length:        63 characters
     *
     *       The FQDN (fully qualified domain name) has the following constraints:
     *
     *          o  Maximum 255 characters (***)
     *          o  Must contain at least one alpha
     *          
     *  Note: (***) Due to various internal restrictions (such as store identifier) we restrict tenant ids to 75 characters.
     */

    protected final static String REGEX_VALID_DNS_LABEL = "^[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]$";
    
    protected final static String REGEX_CONTAINS_ALPHA = "^(.*)[a-zA-Z](.*)$";
    
    protected final static int MAX_LEN = 75;
    	
    public void setNodeService(DbNodeServiceImpl dbNodeService)
    {
        this.nodeService = dbNodeService;
    }
    
    public void setDictionaryComponent(DictionaryComponent dictionaryComponent)
    {
        this.dictionaryComponent = dictionaryComponent;
    }
    
    public void setRepoAdminService(RepoAdminService repoAdminService)
    {
        this.repoAdminService = repoAdminService;
    }
    
    public void setAuthenticationContext(AuthenticationContext authenticationContext)
    {
        this.authenticationContext = authenticationContext;
    }
    
    public void setTransactionService(TransactionService transactionService)
    {
        this.transactionService = transactionService;
    }
  
    public void setTenantService(MultiTServiceImpl tenantService)
    {
        this.tenantService = tenantService;
    }
    
    public void setTenantAdminDAO(TenantAdminDAO tenantAdminDAO)
    {
        this.tenantAdminDAO = tenantAdminDAO;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder)
    {
        this.passwordEncoder = passwordEncoder;
    }

    public void setTenantFileContentStore(ContentStore tenantFileContentStore)
    {
        this.tenantFileContentStore = tenantFileContentStore;
    }

    public void setWorkflowService(WorkflowService workflowService)
    {
        this.workflowService = workflowService;
    }
    
    public void setRepositoryExporterService(RepositoryExporterService repositoryExporterService)
    {
        this.repositoryExporterService = repositoryExporterService;
    }
    
    /**
     * @deprecated see setWorkflowDeployers
     */
    public void setWorkflowDeployer(WorkflowDeployer workflowDeployer)
    {
        // NOOP
        logger.warn(WARN_MSG);
    }
    
    public void setModuleService(ModuleService moduleService)
    {
        this.moduleService = moduleService;
    }
    
    public void setThumbnailRegistry(ThumbnailRegistry thumbnailRegistry)
    {
        this.thumbnailRegistry = thumbnailRegistry;
    }
    
    public void setBaseAdminUsername(String baseAdminUsername)
    {
        this.baseAdminUsername = baseAdminUsername;
    }
    
    public static final String PROTOCOL_STORE_USER = "user";
    public static final String PROTOCOL_STORE_WORKSPACE = "workspace";
    public static final String PROTOCOL_STORE_SYSTEM = "system";
    public static final String PROTOCOL_STORE_ARCHIVE = "archive"; 
    public static final String STORE_BASE_ID_USER = "alfrescoUserStore";
    public static final String STORE_BASE_ID_SYSTEM = "system";
    public static final String STORE_BASE_ID_VERSION1 = "lightWeightVersionStore"; // deprecated
    public static final String STORE_BASE_ID_VERSION2 = "version2Store";
    public static final String STORE_BASE_ID_SPACES = "SpacesStore";
    
    public static final String TENANTS_ATTRIBUTE_PATH = "alfresco-tenants";
    public static final String TENANT_ATTRIBUTE_ENABLED = "enabled";
    public static final String TENANT_ATTRIBUTE_ROOT_CONTENT_STORE_DIR = "rootContentStoreDir";
    
    private List<TenantDeployer> tenantDeployers = new ArrayList<TenantDeployer>();
    
    private static final String WARN_MSG = "system.mt.warn.upgrade_mt_admin_context";
    
    public void afterPropertiesSet() throws Exception
    {
        // for upgrade/backwards compatibility with 3.0.x (mt-admin-context.xml)
        if (baseAdminUsername == null)
        {
            logger.warn(I18NUtil.getMessage(WARN_MSG));
        }
        
        PropertyCheck.mandatory(this, "NodeService", nodeService);
        PropertyCheck.mandatory(this, "DictionaryComponent", dictionaryComponent);
        PropertyCheck.mandatory(this, "RepoAdminService", repoAdminService);
        PropertyCheck.mandatory(this, "TransactionService", transactionService);
        PropertyCheck.mandatory(this, "TenantService", tenantService);
        PropertyCheck.mandatory(this, "TenantAdminDAO", tenantAdminDAO);
        PropertyCheck.mandatory(this, "PasswordEncoder", passwordEncoder);
        PropertyCheck.mandatory(this, "TenantFileContentStore", tenantFileContentStore);
        PropertyCheck.mandatory(this, "WorkflowService", workflowService);
        PropertyCheck.mandatory(this, "RepositoryExporterService", repositoryExporterService);
        PropertyCheck.mandatory(this, "moduleService", moduleService);
    }
    
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.ctx = applicationContext;
    }

    public void startTenants()
    {
        AuthenticationUtil.setMtEnabled(true);
        
        // initialise the tenant admin service and status of tenants (using attribute service)
        // note: this requires that the repository schema has already been initialised
        
        // register dictionary - to allow enable/disable tenant callbacks
        register(dictionaryComponent);
        
        if (tenantFileContentStore instanceof TenantDeployer)
        {
            // register file store - to allow enable/disable tenant callbacks
            // note: tenantFileContentStore must be registed before dictionaryRepositoryBootstrap
            register((TenantDeployer)tenantFileContentStore, 0);
        }
        
        UserTransaction userTransaction = transactionService.getUserTransaction();
        
        try
        {
            authenticationContext.setSystemUserAsCurrentUser();
            userTransaction.begin();
            
            // bootstrap Tenant Service internal cache
            List<Tenant> tenants = getAllTenants();
            
            int enabledCount = 0;
            int disabledCount = 0;
            
            for (Tenant tenant : tenants)
            {
                if ((! (tenantFileContentStore instanceof AbstractTenantRoutingContentStore)) && (! tenantFileContentStore.getRootLocation().equals(tenant.getRootContentStoreDir())))
                {
                    // eg. MT will not work with replicating-content-services-context.sample if tenants are not co-mingled
                    throw new AlfrescoRuntimeException("MT: cannot start tenants - TenantRoutingContentStore is not configured AND not all tenants use co-mingled content store");
                }
                
                if (tenant.isEnabled())
                {
                    // this will also call tenant deployers registered so far ...
                    enableTenant(tenant.getTenantDomain(), true);
                    enabledCount++;
                }
                else
                {
                    // explicitly disable, without calling disableTenant callback
                    disableTenant(tenant.getTenantDomain(), false);
                    disabledCount++;
                }
            }
            
            userTransaction.commit();
            
            if ((enabledCount+disabledCount) == 0)
            {
                AuthenticationUtil.setMtEnabled(false); // explicitly disable if there are no tenants
            }
            
            if (logger.isInfoEnabled() && ((enabledCount+disabledCount) > 0))
            {
                logger.info(String.format("Alfresco Multi-Tenant startup - %d enabled tenants, %d disabled tenants",
                                          enabledCount, disabledCount));
            }
            else if (logger.isDebugEnabled())
            {
                logger.debug(String.format("Alfresco Multi-Tenant startup - %d enabled tenants, %d disabled tenants",
                             enabledCount, disabledCount));
            }
        }
        catch(Throwable e)
        {
            // rollback the transaction
            try { if (userTransaction != null) {userTransaction.rollback();} } catch (Exception ex) {}
            throw new AlfrescoRuntimeException("Failed to bootstrap tenants", e);
        }
        finally
        {
            authenticationContext.clearCurrentSecurityContext();
        }
    }
    
    public void stopTenants()
    {
        tenantDeployers.clear();
        tenantDeployers = null;
        AuthenticationUtil.setMtEnabled(false);
    }

    /**
     * @see TenantAdminService.createTenant()
     */
    public void createTenant(final String tenantDomain, final char[] tenantAdminRawPassword)
    {  
        createTenant(tenantDomain, tenantAdminRawPassword, null);
    }
    
    /**
     * @see TenantAdminService.createTenant()
     */
    public void createTenant(String tenantDomainIn, final char[] tenantAdminRawPassword, String rootContentStoreDir)
    {
        ParameterCheck.mandatory("tenantAdminRawPassword", tenantAdminRawPassword);
        
        final String tenantDomain = getTenantDomain(tenantDomainIn);
        
        AuthenticationUtil.setMtEnabled(true); // in case this is the 1st tenant
        
        long start = System.currentTimeMillis();

        initTenant(tenantDomain, rootContentStoreDir);
        
        try
        {
            // note: runAs would cause auditable property "creator" to be "admin" instead of "System@xxx"
            AuthenticationUtil.pushAuthentication();
            AuthenticationUtil.setFullyAuthenticatedUser(getSystemUser(tenantDomain));
            
            dictionaryComponent.init();
            
            if (tenantFileContentStore instanceof TenantDeployer)
            {
                ((TenantDeployer)tenantFileContentStore).init();
            }
            
            // create tenant-specific stores
            ImporterBootstrap userImporterBootstrap = (ImporterBootstrap)ctx.getBean("userBootstrap-mt");
            bootstrapUserTenantStore(userImporterBootstrap, tenantDomain, tenantAdminRawPassword);
            
            ImporterBootstrap systemImporterBootstrap = (ImporterBootstrap)ctx.getBean("systemBootstrap-mt");
            bootstrapSystemTenantStore(systemImporterBootstrap, tenantDomain);
            
            // deprecated
            ImporterBootstrap versionImporterBootstrap = (ImporterBootstrap)ctx.getBean("versionBootstrap-mt");
            bootstrapVersionTenantStore(versionImporterBootstrap, tenantDomain);
            
            ImporterBootstrap version2ImporterBootstrap = (ImporterBootstrap)ctx.getBean("version2Bootstrap-mt");
            bootstrapVersionTenantStore(version2ImporterBootstrap, tenantDomain);
            
            ImporterBootstrap spacesArchiveImporterBootstrap = (ImporterBootstrap)ctx.getBean("spacesArchiveBootstrap-mt");
            bootstrapSpacesArchiveTenantStore(spacesArchiveImporterBootstrap, tenantDomain);
            
            ImporterBootstrap spacesImporterBootstrap = (ImporterBootstrap)ctx.getBean("spacesBootstrap-mt");
            bootstrapSpacesTenantStore(spacesImporterBootstrap, tenantDomain);
            
            thumbnailRegistry.initThumbnailDefinitions();
            
            // notify listeners that tenant has been created & hence enabled
            for (TenantDeployer tenantDeployer : tenantDeployers)
            {
                tenantDeployer.onEnableTenant();
            }
            
            // bootstrap workflows
            for (WorkflowDeployer workflowDeployer : workflowDeployers)
            {
                workflowDeployer.init();
            }
            
            // bootstrap modules (if any)
            moduleService.startModules();
        }
        finally
        {
            AuthenticationUtil.popAuthentication();
        }
        
        if (logger.isInfoEnabled())
        {
            logger.info("Tenant created: " + tenantDomain + " in "+(System.currentTimeMillis()-start)+ " ms");
        }
    }
    
    /**
     * Export tenant - equivalent to the tenant admin running a 'complete repo' export from the Web Client Admin
     */
    public void exportTenant(String tenantDomain, final File directoryDestination)
    {
    	final String lowerTenantDomain = getTenantDomain(tenantDomain);

        AuthenticationUtil.runAs(new RunAsWork<Object>()
                {
                    public Object doWork()
                    {           
                    	repositoryExporterService.export(directoryDestination, lowerTenantDomain);
                        return null;
                    }                               
                }, getSystemUser(tenantDomain));
        
        logger.info("Tenant exported: " + tenantDomain);
    }
    
    /**
     * Create tenant by restoring from a complete repository export. This is equivalent to a bootstrap import using restore-context.xml.
     */
    public void importTenant(final String tenantDomainIn, final File directorySource, String contentRoot)
    {
        final String tenantDomain = getTenantDomain(tenantDomainIn);
        
        AuthenticationUtil.setMtEnabled(true); // in case this is the 1st tenant
        
        initTenant(tenantDomain, contentRoot);
        
        try
        {
            // note: runAs would cause auditable property "creator" to be "admin" instead of "System@xxx"
            AuthenticationUtil.pushAuthentication();
            AuthenticationUtil.setFullyAuthenticatedUser(getSystemUser(tenantDomain));
            
            dictionaryComponent.init();
            
            if (tenantFileContentStore instanceof TenantDeployer)
            {
                ((TenantDeployer)tenantFileContentStore).init();
            }
            
            // import tenant-specific stores
            importBootstrapUserTenantStore(tenantDomain, directorySource);
            importBootstrapSystemTenantStore(tenantDomain, directorySource);
            importBootstrapVersionTenantStore(tenantDomain, directorySource);
            importBootstrapSpacesArchiveTenantStore(tenantDomain, directorySource);
            importBootstrapSpacesModelsTenantStore(tenantDomain, directorySource);
            importBootstrapSpacesTenantStore(tenantDomain, directorySource);
            
            thumbnailRegistry.initThumbnailDefinitions();
            
            // notify listeners that tenant has been created & hence enabled
            for (TenantDeployer tenantDeployer : tenantDeployers)
            {
                tenantDeployer.onEnableTenant();
            }
            
            // bootstrap workflows
            for (WorkflowDeployer workflowDeployer : workflowDeployers)
            {
                workflowDeployer.init();
            }
            
            // bootstrap modules (if any)
            moduleService.startModules();    
        }
        finally
        {
            AuthenticationUtil.popAuthentication();
        }

        logger.info("Tenant imported: " + tenantDomain);
    }
    
    public boolean existsTenant(String tenantDomain)
    {
        // Check that all the passed values are not null
        ParameterCheck.mandatory("tenantDomain", tenantDomain);
        
        tenantDomain = getTenantDomain(tenantDomain);

        return (getTenantAttributes(tenantDomain) != null);
    }
    
    private Tenant getTenantAttributes(String tenantDomain)
    {
        TenantEntity tenantEntity = tenantAdminDAO.getTenant(tenantDomain);
        if (tenantEntity == null)
        {
            return null;
        }
        else
        {
            Tenant tenant = new Tenant(tenantEntity.getTenantDomain(), tenantEntity.getEnabled(), tenantEntity.getContentRoot());
            return tenant;
        }
    }
    
    public void enableTenant(String tenantDomain)
    { 
    	tenantDomain = getTenantDomain(tenantDomain);

        if (! existsTenant(tenantDomain))
        {
            throw new AuthenticationException("Tenant does not exist: " + tenantDomain);
        }
        
        if (isEnabledTenant(tenantDomain))
        {
            logger.warn("Tenant already enabled: " + tenantDomain);
        }
        
        enableTenant(tenantDomain, true);
    }
    
    private void enableTenant(String tenantDomain, boolean notifyTenantDeployers)
    {    
        // Check that all the passed values are not null
        ParameterCheck.mandatory("tenantDomain", tenantDomain);
        
        TenantUpdateEntity tenantUpdateEntity = tenantAdminDAO.getTenantForUpdate(tenantDomain);
        tenantUpdateEntity.setEnabled(true);
        tenantAdminDAO.updateTenant(tenantUpdateEntity);
        
        if (notifyTenantDeployers)
        {
            // notify listeners that tenant has been enabled
            AuthenticationUtil.runAs(new RunAsWork<Object>()
                    {
                        public Object doWork()
                        {
                            for (TenantDeployer tenantDeployer : tenantDeployers)
                            {
                                tenantDeployer.onEnableTenant();
                            }
                            return null;
                        }
                    }, getSystemUser(tenantDomain));
        }
        
        logger.info("Tenant enabled: " + tenantDomain);
    }   
    
    public void disableTenant(String tenantDomain)
    { 
    	tenantDomain = getTenantDomain(tenantDomain);

        if (! existsTenant(tenantDomain))
        {
            throw new AuthenticationException("Tenant does not exist: " + tenantDomain);
        }
        
        if (! isEnabledTenant(tenantDomain))
        {
            logger.warn("Tenant already disabled: " + tenantDomain);
        }
        
        disableTenant(tenantDomain, true);
    }
    
    public void disableTenant(String tenantDomain, boolean notifyTenantDeployers)
    {
    	tenantDomain = getTenantDomain(tenantDomain);

        if (notifyTenantDeployers)
        {
            // notify listeners that tenant has been disabled
            AuthenticationUtil.runAs(new RunAsWork<Object>()
                    {
                        public Object doWork()
                        {
                            for (TenantDeployer tenantDeployer : tenantDeployers)
                            {
                                tenantDeployer.onDisableTenant();
                            }
                            return null;
                        }
                    }, getSystemUser(tenantDomain));
        }
        
        // update tenant attributes / tenant cache - need to disable after notifying listeners (else they cannot disable) 
        TenantUpdateEntity tenantUpdateEntity = tenantAdminDAO.getTenantForUpdate(tenantDomain);
        tenantUpdateEntity.setEnabled(false);
        tenantAdminDAO.updateTenant(tenantUpdateEntity);
        
        logger.info("Tenant disabled: " + tenantDomain);
    }
    
    public boolean isEnabledTenant(String tenantDomain)
    {       
        // Check that all the passed values are not null
        ParameterCheck.mandatory("tenantDomain", tenantDomain);

        tenantDomain = getTenantDomain(tenantDomain);

        Tenant tenant = getTenantAttributes(tenantDomain);
        if (tenant != null)
        {
            return tenant.isEnabled();
        }

        return false;
    }
    
    protected String getRootContentStoreDir(String tenantDomain)
    {       
        // Check that all the passed values are not null
        ParameterCheck.mandatory("tenantDomain", tenantDomain);
        
        Tenant tenant = getTenantAttributes(tenantDomain);
        if (tenant != null)
        {
            return tenant.getRootContentStoreDir();
        }
        
        return null;
    }
    
    public Tenant getTenant(String tenantDomain)
    {
    	tenantDomain = getTenantDomain(tenantDomain);
        if (! existsTenant(tenantDomain))
        {
            throw new AuthenticationException("Tenant does not exist: " + tenantDomain);
        }
        
        return new Tenant(tenantDomain, isEnabledTenant(tenantDomain), getRootContentStoreDir(tenantDomain));
    }
    
    /**
     * @see TenantAdminService.deleteTenant()
     */
    public void deleteTenant(String tenantDomain)
    {
    	tenantDomain = getTenantDomain(tenantDomain);

        if (! existsTenant(tenantDomain))
        {
            throw new AuthenticationException("Tenant does not exist: " + tenantDomain);
        }
        else
        {
            try 
            {
                AuthenticationUtil.runAs(new RunAsWork<Object>()
                {
                    public Object doWork()
                    {
                        List<WorkflowDefinition> workflowDefs = workflowService.getDefinitions();
                        if (workflowDefs != null)
                        {
                            for (WorkflowDefinition workflowDef : workflowDefs)
                            {
                                workflowService.undeployDefinition(workflowDef.getId());
                            }
                        }
                        
                        List<String> messageResourceBundles = repoAdminService.getMessageBundles();
                        if (messageResourceBundles != null)
                        {
                            for (String messageResourceBundle : messageResourceBundles)
                            {
                                repoAdminService.undeployMessageBundle(messageResourceBundle);
                            }
                        }   
                        
                        List<RepoModelDefinition> models = repoAdminService.getModels();
                        if (models != null)
                        {
                            for (RepoModelDefinition model : models)
                            {
                                repoAdminService.undeployModel(model.getRepoName());
                            }
                        }
                       
                        return null;
                    }
                }, getSystemUser(tenantDomain));
                
                final String tenantAdminUser = getTenantAdminUser(tenantDomain);
                
                // delete tenant-specific stores
                nodeService.deleteStore(tenantService.getName(tenantAdminUser, new StoreRef(PROTOCOL_STORE_WORKSPACE, STORE_BASE_ID_SPACES)));
                nodeService.deleteStore(tenantService.getName(tenantAdminUser, new StoreRef(PROTOCOL_STORE_ARCHIVE, STORE_BASE_ID_SPACES)));
                nodeService.deleteStore(tenantService.getName(tenantAdminUser, new StoreRef(PROTOCOL_STORE_WORKSPACE, STORE_BASE_ID_VERSION1)));
                nodeService.deleteStore(tenantService.getName(tenantAdminUser, new StoreRef(PROTOCOL_STORE_WORKSPACE, STORE_BASE_ID_VERSION2)));
                nodeService.deleteStore(tenantService.getName(tenantAdminUser, new StoreRef(PROTOCOL_STORE_SYSTEM, STORE_BASE_ID_SYSTEM)));
                nodeService.deleteStore(tenantService.getName(tenantAdminUser, new StoreRef(PROTOCOL_STORE_USER, STORE_BASE_ID_USER)));
                
                
                // notify listeners that tenant has been deleted & hence disabled
                AuthenticationUtil.runAs(new RunAsWork<Object>()
                {
                    public Object doWork()
                    {
                        for (TenantDeployer tenantDeployer : tenantDeployers)
                        {
                            tenantDeployer.onDisableTenant();
                        }
                        return null;
                    }
                }, getSystemUser(tenantDomain));
                
                // remove tenant
                tenantAdminDAO.deleteTenant(tenantDomain);
            } 
            catch (Throwable t)
            {
                throw new AlfrescoRuntimeException("Failed to delete tenant: " + tenantDomain, t);
            }
            
            if (logger.isInfoEnabled())
            {
                logger.info("Tenant deleted: " + tenantDomain);
            }
        }
    }
    
    /**
     * @see TenantAdminService.getAllTenants()
     */
    public List<Tenant> getAllTenants()
    {
        List<TenantEntity> tenantEntities = tenantAdminDAO.listTenants();
        List<Tenant> tenants = new ArrayList<Tenant>(tenantEntities.size());
        for (TenantEntity tenantEntity : tenantEntities)
        {
            tenants.add(new Tenant(tenantEntity.getTenantDomain(), tenantEntity.getEnabled(), tenantEntity.getContentRoot()));
        }
        return tenants;
    }

    private void importBootstrapSystemTenantStore(String tenantDomain, File directorySource)
    {
        // Import Bootstrap (restore) Tenant-Specific Version Store
        Properties bootstrapView = new Properties();
        bootstrapView.put("path", "/");
        bootstrapView.put("location", directorySource.getPath()+"/"+tenantDomain+"_system.acp");
        
        List<Properties> bootstrapViews = new ArrayList<Properties>(1);
        bootstrapViews.add(bootstrapView);
        
        ImporterBootstrap systemImporterBootstrap = (ImporterBootstrap)ctx.getBean("systemBootstrap");
        systemImporterBootstrap.setBootstrapViews(bootstrapViews);
        
        bootstrapSystemTenantStore(systemImporterBootstrap, tenantDomain);
    }
    
    private void bootstrapSystemTenantStore(ImporterBootstrap systemImporterBootstrap, String tenantDomain)
    {
        // Bootstrap Tenant-Specific System Store
        StoreRef bootstrapStoreRef = systemImporterBootstrap.getStoreRef();
        StoreRef tenantBootstrapStoreRef = new StoreRef(bootstrapStoreRef.getProtocol(), tenantService.getName(bootstrapStoreRef.getIdentifier(), tenantDomain));
        systemImporterBootstrap.setStoreUrl(tenantBootstrapStoreRef.toString());
        
        // override default property (workspace://SpacesStore)
        List<String> mustNotExistStoreUrls = new ArrayList<String>();
        mustNotExistStoreUrls.add(new StoreRef(PROTOCOL_STORE_WORKSPACE, tenantService.getName(STORE_BASE_ID_USER, tenantDomain)).toString());
        systemImporterBootstrap.setMustNotExistStoreUrls(mustNotExistStoreUrls);
        
        systemImporterBootstrap.bootstrap();
        
        // reset since systemImporter is singleton (hence reused)
        systemImporterBootstrap.setStoreUrl(bootstrapStoreRef.toString());
        
        logger.debug("Bootstrapped store: " + tenantService.getBaseName(tenantBootstrapStoreRef));
    }
    
    private void importBootstrapUserTenantStore(String tenantDomain, File directorySource)
    {
        // Import Bootstrap (restore) Tenant-Specific User Store
        Properties bootstrapView = new Properties();
        bootstrapView.put("path", "/");
        bootstrapView.put("location", directorySource.getPath()+"/"+tenantDomain+"_users.acp");

        List<Properties> bootstrapViews = new ArrayList<Properties>(1);
        bootstrapViews.add(bootstrapView);
        
        ImporterBootstrap userImporterBootstrap = (ImporterBootstrap)ctx.getBean("userBootstrap");
        userImporterBootstrap.setBootstrapViews(bootstrapViews);
        
        bootstrapUserTenantStore(userImporterBootstrap, tenantDomain, null);
    }
    
    private void bootstrapUserTenantStore(ImporterBootstrap userImporterBootstrap, String tenantDomain, char[] tenantAdminRawPassword)
    {
        // Bootstrap Tenant-Specific User Store
        StoreRef bootstrapStoreRef = userImporterBootstrap.getStoreRef();
        bootstrapStoreRef = new StoreRef(bootstrapStoreRef.getProtocol(), tenantService.getName(bootstrapStoreRef.getIdentifier(), tenantDomain));
        userImporterBootstrap.setStoreUrl(bootstrapStoreRef.toString());
    
        // override admin username property
        Properties props = userImporterBootstrap.getConfiguration();       
        props.put("alfresco_user_store.adminusername", getTenantAdminUser(tenantDomain));
        
        if (tenantAdminRawPassword != null)
        {
            String salt = null; // GUID.generate();
        	props.put("alfresco_user_store.adminpassword", passwordEncoder.encodePassword(new String(tenantAdminRawPassword), salt));
        }
        
        userImporterBootstrap.bootstrap();
        
        logger.debug("Bootstrapped store: " + tenantService.getBaseName(bootstrapStoreRef));
    }

    private void importBootstrapVersionTenantStore(String tenantDomain, File directorySource)
    {
        // Import Bootstrap (restore) Tenant-Specific Version Store
        Properties bootstrapView = new Properties();
        bootstrapView.put("path", "/");
        bootstrapView.put("location", directorySource.getPath()+"/"+tenantDomain+"_versions2.acp");

        List<Properties> bootstrapViews = new ArrayList<Properties>(1);
        bootstrapViews.add(bootstrapView);
        
        ImporterBootstrap versionImporterBootstrap = (ImporterBootstrap)ctx.getBean("versionBootstrap");
        versionImporterBootstrap.setBootstrapViews(bootstrapViews);

        bootstrapVersionTenantStore(versionImporterBootstrap, tenantDomain);
    }
    
    private void bootstrapVersionTenantStore(ImporterBootstrap versionImporterBootstrap, String tenantDomain)
    {
        // Bootstrap Tenant-Specific Version Store
        StoreRef bootstrapStoreRef = versionImporterBootstrap.getStoreRef();
        bootstrapStoreRef = new StoreRef(bootstrapStoreRef.getProtocol(), tenantService.getName(bootstrapStoreRef.getIdentifier(), tenantDomain));
        versionImporterBootstrap.setStoreUrl(bootstrapStoreRef.toString());
    
        versionImporterBootstrap.bootstrap();
        
        logger.debug("Bootstrapped store: " + tenantService.getBaseName(bootstrapStoreRef));
    }
    
    private void importBootstrapSpacesArchiveTenantStore(String tenantDomain, File directorySource)
    {
        // Import Bootstrap (restore) Tenant-Specific Spaces Archive Store
        Properties bootstrapView = new Properties();
        bootstrapView.put("path", "/");
        bootstrapView.put("location", directorySource.getPath()+"/"+tenantDomain+"_spaces_archive.acp");

        List<Properties> bootstrapViews = new ArrayList<Properties>(1);
        bootstrapViews.add(bootstrapView);
        
        ImporterBootstrap spacesArchiveImporterBootstrap = (ImporterBootstrap)ctx.getBean("spacesArchiveBootstrap");
        spacesArchiveImporterBootstrap.setBootstrapViews(bootstrapViews);

        bootstrapSpacesArchiveTenantStore(spacesArchiveImporterBootstrap, tenantDomain);
    }
    
    private void bootstrapSpacesArchiveTenantStore(ImporterBootstrap spacesArchiveImporterBootstrap, String tenantDomain)
    {
        // Bootstrap Tenant-Specific Spaces Archive Store
        StoreRef bootstrapStoreRef = spacesArchiveImporterBootstrap.getStoreRef();
        bootstrapStoreRef = new StoreRef(bootstrapStoreRef.getProtocol(), tenantService.getName(bootstrapStoreRef.getIdentifier(), tenantDomain));
        spacesArchiveImporterBootstrap.setStoreUrl(bootstrapStoreRef.toString());
    
        // override default property (archive://SpacesStore)       
        List<String> mustNotExistStoreUrls = new ArrayList<String>();
        mustNotExistStoreUrls.add(bootstrapStoreRef.toString());
        spacesArchiveImporterBootstrap.setMustNotExistStoreUrls(mustNotExistStoreUrls);        
        
        spacesArchiveImporterBootstrap.bootstrap();
        
        logger.debug("Bootstrapped store: " + tenantService.getBaseName(bootstrapStoreRef));
    }

    private void importBootstrapSpacesModelsTenantStore(String tenantDomain, File directorySource)
    {
        // Import Bootstrap (restore) Tenant-Specific Spaces Store
        Properties bootstrapView = new Properties();
        bootstrapView.put("path", "/");
        bootstrapView.put("location", directorySource.getPath()+"/"+tenantDomain+"_models.acp");

        List<Properties> bootstrapViews = new ArrayList<Properties>(1);
        bootstrapViews.add(bootstrapView);
        
        ImporterBootstrap spacesImporterBootstrap = (ImporterBootstrap)ctx.getBean("spacesBootstrap");
        spacesImporterBootstrap.setBootstrapViews(bootstrapViews);

        bootstrapSpacesTenantStore(spacesImporterBootstrap, tenantDomain);
    }
    
    private void importBootstrapSpacesTenantStore(String tenantDomain, File directorySource)
    {
        // Import Bootstrap (restore) Tenant-Specific Spaces Store
        Properties bootstrapView = new Properties();
        bootstrapView.put("path", "/");
        bootstrapView.put("location", directorySource.getPath()+"/"+tenantDomain+"_spaces.acp");
        bootstrapView.put("uuidBinding", "UPDATE_EXISTING");

        List<Properties> bootstrapViews = new ArrayList<Properties>(1);
        bootstrapViews.add(bootstrapView);
        
        ImporterBootstrap spacesImporterBootstrap = (ImporterBootstrap)ctx.getBean("spacesBootstrap");
        spacesImporterBootstrap.setBootstrapViews(bootstrapViews);
        
        spacesImporterBootstrap.setUseExistingStore(true);

        bootstrapSpacesTenantStore(spacesImporterBootstrap, tenantDomain);
    }
    
    private void bootstrapSpacesTenantStore(ImporterBootstrap spacesImporterBootstrap, String tenantDomain)
    {
        // Bootstrap Tenant-Specific Spaces Store
        StoreRef bootstrapStoreRef = spacesImporterBootstrap.getStoreRef();
        bootstrapStoreRef = new StoreRef(bootstrapStoreRef.getProtocol(), tenantService.getName(bootstrapStoreRef.getIdentifier(), tenantDomain));
        spacesImporterBootstrap.setStoreUrl(bootstrapStoreRef.toString());
    
        // override admin username property
        Properties props = spacesImporterBootstrap.getConfiguration();
        props.put("alfresco_user_store.adminusername", getTenantAdminUser(tenantDomain));
        
        // override guest username property
        props.put("alfresco_user_store.guestusername", getTenantGuestUser(tenantDomain));
   
        spacesImporterBootstrap.bootstrap();
        
        // calculate any missing usages
        UserUsageTrackingComponent userUsageTrackingComponent = (UserUsageTrackingComponent)ctx.getBean("userUsageTrackingComponent");
        userUsageTrackingComponent.bootstrapInternal();
       
        logger.debug("Bootstrapped store: " + tenantService.getBaseName(bootstrapStoreRef));
    }
   
    public void deployTenants(final TenantDeployer deployer, Log logger)
    {
        if (deployer == null)
        {
            throw new AlfrescoRuntimeException("Deployer must be provided");
        }
        if (logger == null)
        {
            throw new AlfrescoRuntimeException("Logger must be provided");
        }
        
        if (tenantService.isEnabled())
        {
            UserTransaction userTransaction = transactionService.getUserTransaction();
            authenticationContext.setSystemUserAsCurrentUser();
            
            List<Tenant> tenants = null;
            try 
            {
                userTransaction.begin();
                tenants = getAllTenants();
                userTransaction.commit();
            }
            catch(Throwable e)
            {
                // rollback the transaction
                try { if (userTransaction != null) {userTransaction.rollback();} } catch (Exception ex) {}
                throw new AlfrescoRuntimeException("Failed to get tenants", e);
            }
            finally
            {
                authenticationContext.clearCurrentSecurityContext();
            }
            
            for (Tenant tenant : tenants)
            {
                if (tenant.isEnabled())
                {
                    try
                    {
                        // deploy within context of tenant domain
                        AuthenticationUtil.runAs(new RunAsWork<Object>()
                        {
                            public Object doWork()
                            {            
                                // init the service within tenant context
                                deployer.init();
                                return null;
                            }
                        }, getSystemUser(tenant.getTenantDomain()));
                    
                    }
                    catch (Throwable e)
                    {
                        logger.error("Deployment failed" + e);
                        
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        logger.error(stringWriter.toString());
                        
                        // tenant deploy failure should not necessarily affect other tenants
                    }
                }
            }
        }
    }
    
    public void undeployTenants(final TenantDeployer deployer, Log logger)
    {
        if (deployer == null)
        {
            throw new AlfrescoRuntimeException("Deployer must be provided");
        }  
        if (logger == null)
        {
            throw new AlfrescoRuntimeException("Logger must be provided");
        }  

        if (tenantService.isEnabled())
        {               
            UserTransaction userTransaction = transactionService.getUserTransaction();           
            authenticationContext.setSystemUserAsCurrentUser();
                                    
            List<Tenant> tenants = null;            
            try 
            {
                userTransaction.begin();               
                tenants = getAllTenants();                
                userTransaction.commit();
            }
            catch(Throwable e)
            {
                // rollback the transaction
                try { if (userTransaction != null) {userTransaction.rollback();} } catch (Exception ex) {}
                try {authenticationContext.clearCurrentSecurityContext(); } catch (Exception ex) {}
                throw new AlfrescoRuntimeException("Failed to get tenants", e);
            }
                           
            try 
            {
                AuthenticationUtil.pushAuthentication();
                for (Tenant tenant : tenants)
                { 
                    if (tenant.isEnabled()) 
                    {
                        try
                        {
                            // undeploy within context of tenant domain
                            AuthenticationUtil.runAs(new RunAsWork<Object>()
                            {
                                public Object doWork()
                                {            
                                    // destroy the service within tenant context
                                    deployer.destroy();
                                    return null;
                                }                               
                            }, getSystemUser(tenant.getTenantDomain()));
                        
                        }       
                        catch (Throwable e)
                        {
                            logger.error("Undeployment failed" + e);
                            
                            StringWriter stringWriter = new StringWriter();
                            e.printStackTrace(new PrintWriter(stringWriter));
                            logger.error(stringWriter.toString());
                            
                            // tenant undeploy failure should not necessarily affect other tenants
                        }
                    }
                }
            }
            finally
            { 
                AuthenticationUtil.popAuthentication();
            }
        }
    }   
    
    public void register(TenantDeployer deployer)
    {
        register(deployer, -1);
    }
    
    protected void register(TenantDeployer deployer, int position)
    {
        if (deployer == null)
        {
            throw new AlfrescoRuntimeException("Deployer must be provided");
        }
       
        if (! tenantDeployers.contains(deployer))
        {
            if (position == -1)
            {
                tenantDeployers.add(deployer);
            }
            else
            {
                tenantDeployers.add(position, deployer);
            }
        }
    }
    
    public void unregister(TenantDeployer deployer)
    {
        if (deployer == null)
        {
            throw new AlfrescoRuntimeException("TenantDeployer must be provided");
        }
        
        if (tenantDeployers != null)
        {
            tenantDeployers.remove(deployer);
        }
    }
    
    public void register(WorkflowDeployer workflowDeployer)
    {
        if (workflowDeployer == null)
        {
            throw new AlfrescoRuntimeException("WorkflowDeployer must be provided");
        }
        
        if (! workflowDeployers.contains(workflowDeployer))
        {
            workflowDeployers.add(workflowDeployer);
        }
    }
     
    public void resetCache(String tenantDomain)
    {
        if (existsTenant(tenantDomain))
        {
            if (isEnabledTenant(tenantDomain))
            {
                enableTenant(tenantDomain);
            }
            else
            {
                disableTenant(tenantDomain);
            }
        }
        else
        {
            throw new AuthenticationException("No such tenant " + tenantDomain);
        }
    }
    
    private void initTenant(String tenantDomain, String rootContentStoreDir)
    {
        validateTenantName(tenantDomain);
        
        if (existsTenant(tenantDomain))
        {
            throw new AlfrescoRuntimeException("Tenant already exists: " + tenantDomain);
        }
        
        if (rootContentStoreDir != null)
        {
            if (! (tenantFileContentStore instanceof AbstractTenantRoutingContentStore))
            {
                // eg. MT will not work with replicating-content-services-context.sample
                throw new AlfrescoRuntimeException("MT: cannot initialse tenant - TenantRoutingContentStore is not configured AND tenant is not using co-mingled content store (ie. default root location)");
            }
            
            File tenantRootDir = new File(rootContentStoreDir);
            if ((tenantRootDir.exists()) && (tenantRootDir.list().length != 0))
            {
                logger.warn("Tenant root directory is not empty: " + rootContentStoreDir);
            }
        }
        
        if (rootContentStoreDir == null)
        {
            rootContentStoreDir = tenantFileContentStore.getRootLocation();
        }
        
        // init - need to enable tenant (including tenant service) before stores bootstrap
        TenantEntity tenantEntity = new TenantEntity(tenantDomain);
        tenantEntity.setEnabled(true);
        tenantEntity.setContentRoot(rootContentStoreDir);
        
        tenantAdminDAO.createTenant(tenantEntity);
    }
    
    private void validateTenantName(String tenantDomain)
    {
        ParameterCheck.mandatory("tenantDomain", tenantDomain);
        
        if (tenantDomain.length() > MAX_LEN)
        {
        	throw new IllegalArgumentException(tenantDomain + " is not a valid tenant name (must be less than " + MAX_LEN + " characters)");
        }
        
        if (! Pattern.matches(REGEX_CONTAINS_ALPHA, tenantDomain))
        {
        	throw new IllegalArgumentException(tenantDomain + " is not a valid tenant name (must contain at least one alpha character)");
        }
        
        String[] dnsLabels = tenantDomain.split("\\.");
        if (dnsLabels.length != 0)
        {
	        for (int i = 0; i < dnsLabels.length; i++)
	        {
		        if (! Pattern.matches(REGEX_VALID_DNS_LABEL, dnsLabels[i]))
		        {
		        	throw new IllegalArgumentException(dnsLabels[i] + " is not a valid DNS label (must match " + REGEX_VALID_DNS_LABEL + ")");
		        }
	        }
        }
        else
        {
	        if (! Pattern.matches(REGEX_VALID_DNS_LABEL, tenantDomain))
	        {
	        	throw new IllegalArgumentException(tenantDomain + " is not a valid DNS label (must match " + REGEX_VALID_DNS_LABEL + ")");
	        }
        }
    }
    
    // tenant deployer/user services delegated to tenant service
    
    public boolean isEnabled()
    {
        return tenantService.isEnabled();
    }
    
    public String getCurrentUserDomain()
    {
        return tenantService.getCurrentUserDomain();
    }

    public String getUserDomain(String username)
    {
        return tenantService.getUserDomain(username);
    }
    
    public String getBaseNameUser(String username)
    {
        return tenantService.getBaseNameUser(username);
    }
    
    public String getDomainUser(String baseUsername, String tenantDomain)
    {
    	tenantDomain = getTenantDomain(tenantDomain);
        return tenantService.getDomainUser(baseUsername, tenantDomain);
    }
    
    public String getDomain(String name)
    {
    	name = getTenantDomain(name);
    	return tenantService.getDomain(name);
    }
    
    // local helpers
    
    public String getBaseAdminUser()
    {
        // default for backwards compatibility only - eg. upgrade of existing MT instance (mt-admin-context.xml.sample)
        if (baseAdminUsername != null)
        {
            return baseAdminUsername;
        }
        return getBaseNameUser(AuthenticationUtil.getAdminUserName());
    }
    
    private String getSystemUser(String tenantDomain)
    {
        return tenantService.getDomainUser(AuthenticationUtil.getSystemUserName(), tenantDomain);
    }
    
    private String getTenantAdminUser(String tenantDomain)
    {
        
        return tenantService.getDomainUser(getBaseAdminUser(), tenantDomain);
    }

    private String getTenantGuestUser(String tenantDomain)
    {
        return authenticationContext.getGuestUserName(tenantDomain);
    }
    
    protected String getTenantDomain(String tenantDomain)
    {
        ParameterCheck.mandatory("tenantDomain", tenantDomain);
        return tenantDomain.toLowerCase(I18NUtil.getLocale());
    }
}

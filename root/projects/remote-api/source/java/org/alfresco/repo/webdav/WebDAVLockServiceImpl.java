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

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.alfresco.model.ContentModel;
import org.alfresco.repo.security.authentication.AuthenticationUtil;
import org.alfresco.repo.security.authentication.AuthenticationUtil.RunAsWork;
import org.alfresco.repo.transaction.RetryingTransactionHelper.RetryingTransactionCallback;
import org.alfresco.service.Auditable;
import org.alfresco.service.cmr.coci.CheckOutCheckInService;
import org.alfresco.service.cmr.lock.LockService;
import org.alfresco.service.cmr.lock.LockStatus;
import org.alfresco.service.cmr.lock.LockType;
import org.alfresco.service.cmr.model.FileInfo;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.transaction.TransactionService;
import org.alfresco.util.Pair;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>
 * WebDAVLockService is used to manage file locks for WebDAV and Sharepoint protocol. It ensures a lock never persists
 * for more than 24 hours, and also ensures locks are timed out on session timeout.
 * 
 * @author Pavel.Yurkevich
 */
public class WebDAVLockServiceImpl implements WebDAVLockService
{
    /** The session attribute under which webdav/vti stores its locked documents. */
    private static final String LOCKED_RESOURCES = "_webdavLockedResources";

    private static Log logger = LogFactory.getLog(WebDAVLockServiceImpl.class);
    
    private static ThreadLocal<HttpSession> currentSession = new ThreadLocal<HttpSession>();
    
    private LockService lockService;
    private NodeService nodeService;
    private LockStore lockStore;
    private TransactionService transactionService;
    private CheckOutCheckInService checkOutCheckInService;

    /**
     * Set the LockService
     * 
     * @param lockService
     */
    public void setLockService(LockService lockService)
    {
        this.lockService = lockService;
    }

    /**
     * Set the NodeService
     * 
     * @param nodeService
     */
    public void setNodeService(NodeService nodeService)
    {
        this.nodeService = nodeService;
    }

    /**
     * Set the LockStore that will be used to keep hold of relavent LockInfo objects.
     * 
     * @param lockStore
     */
    public void setLockStoreFactory(LockStoreFactory lockStoreFactory)
    {
        LockStore lockStore = lockStoreFactory.createLockStore();
        this.lockStore = lockStore;
    }

    /**
     * Set the TransactionService
     * 
     * @param transactionService
     */
    public void setTransactionService(TransactionService transactionService)
    {
        this.transactionService = transactionService;
    }

    /**
     * Set the CheckOutCheckInService
     * 
     * @param checkOutCheckInService
     */
    public void setCheckOutCheckInService(CheckOutCheckInService checkOutCheckInService)
    {
        this.checkOutCheckInService = checkOutCheckInService;
    }
    
    /**
     * Caches current session to the thread local variable
     * 
     * @param currentSession
     */
    @Override
    public void setCurrentSession(HttpSession session)
    {
        currentSession.set(session);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void sessionDestroyed()
    {
        HttpSession session = currentSession.get();

        if (session == null)
        {
            if (logger.isDebugEnabled())
            {
                logger.debug("Couldn't find current session.");
            }
            return;
        }

        // look for locked documents list in http session
        final List<Pair<String, NodeRef>> lockedResources = (List<Pair<String, NodeRef>>) session.getAttribute(LOCKED_RESOURCES);

        if (lockedResources != null && lockedResources.size() > 0)
        {
            if (logger.isDebugEnabled())
            {
                logger.debug("Found " + lockedResources.size() + " locked resources for session: " + session.getId());
            }

            for (Pair<String, NodeRef> lockedResource : lockedResources)
            {
                String runAsUser = lockedResource.getFirst();
                final NodeRef nodeRef = lockedResource.getSecond();

                // there are some document that should be forcibly unlocked
                AuthenticationUtil.runAs(new RunAsWork<Void>()
                {
                    @Override
                    public Void doWork() throws Exception
                    {
                        return transactionService.getRetryingTransactionHelper().doInTransaction(
                                new RetryingTransactionCallback<Void>()
                                {
                                    @Override
                                    public Void execute() throws Throwable
                                    {
                                        // check whether this document still exists in repo
                                        if (nodeService.exists(nodeRef))
                                        {
                                            if (logger.isDebugEnabled())
                                            {
                                                logger.debug("Trying to release lock for: " + nodeRef);
                                            }

                                            // check the lock status of document
                                            LockStatus lockStatus = lockService.getLockStatus(nodeRef);
                                            
                                            // check if document was checked out
                                            boolean hasWorkingCopy = checkOutCheckInService.getWorkingCopy(nodeRef) != null;
                                            boolean isWorkingCopy = nodeService.hasAspect(nodeRef, ContentModel.ASPECT_WORKING_COPY);

                                            // forcibly unlock document if it is still locked and not checked out
                                            if ((lockStatus.equals(LockStatus.LOCKED) ||
                                                    lockStatus.equals(LockStatus.LOCK_OWNER)) && !hasWorkingCopy && !isWorkingCopy)
                                            {
                                                try
                                                {
                                                    // try to unlock it
                                                    lockService.unlock(nodeRef);
                                                    lockStore.remove(nodeRef);

                                                    if (logger.isDebugEnabled())
                                                    {
                                                        logger.debug("Lock was successfully released for: "
                                                                + nodeRef);
                                                    }
                                                }
                                                catch (Exception e)
                                                {
                                                    if (logger.isDebugEnabled())
                                                    {
                                                        logger.debug("Unable to unlock " + nodeRef
                                                                + " cause: " + e.getMessage());
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                // document is not locked or is checked out
                                                if (logger.isDebugEnabled())
                                                {
                                                    logger.debug("Skip lock releasing for: " + nodeRef
                                                            + " as it is not locked or is checked out");
                                                }
                                            }
                                        }
                                        else
                                        {
                                            // document no longer exists in repo 
                                            if (logger.isDebugEnabled())
                                            {
                                                logger.debug("Skip lock releasing for an unexisting node: " + nodeRef);
                                            }
                                        }
                                        return null;
                                    }
                                }, transactionService.isReadOnly());
                    }
                }, runAsUser == null ? AuthenticationUtil.getSystemUserName() : runAsUser);
            }
        }
        else
        {
            // there are no documents with unexpected lock left on it
            if (logger.isDebugEnabled())
            {
                logger.debug("No locked resources were found for session: " + session.getId());
            }
        }
    }

    public void lock(NodeRef nodeRef, LockInfo lockInfo)
    {
        boolean performSessionBehavior = false;
        long timeout;
        lockInfo.getRWLock().readLock().lock();
        try
        {
            timeout = lockInfo.getRemainingTimeoutSeconds();
        }
        finally
        {
            lockInfo.getRWLock().readLock().unlock();
        }
        
        // ALF-11777 fix, do not lock node for more than 24 hours (webdav and vti)
        if (timeout >= WebDAV.TIMEOUT_24_HOURS || timeout == WebDAV.TIMEOUT_INFINITY)
        {
            lockInfo.getRWLock().writeLock().lock();
            try
            {
                // Repeat the precondition check
                if (timeout >= WebDAV.TIMEOUT_24_HOURS || timeout == WebDAV.TIMEOUT_INFINITY)
                {    
                    timeout = WebDAV.TIMEOUT_24_HOURS;
                    lockInfo.setTimeoutSeconds((int) timeout);
                    performSessionBehavior = true;
                }
            }
            finally
            {
                lockInfo.getRWLock().writeLock().unlock();                    
            }
        }
        
        lockStore.put(nodeRef, lockInfo);
        

        if (logger.isDebugEnabled())
        {
            logger.debug(nodeRef + " was locked for " + timeout + " seconds.");
        }

        if (performSessionBehavior)
        {
            HttpSession session = currentSession.get();

            if (session == null)
            {
                if (logger.isDebugEnabled())
                {
                    logger.debug("Couldn't find current session.");
                }
                return;
            }

            storeObjectInSessionList(session, LOCKED_RESOURCES, new Pair<String, NodeRef>(AuthenticationUtil.getRunAsUser(), nodeRef));

            if (logger.isDebugEnabled())
            {
                logger.debug(nodeRef + " was added to the session " + session.getId() + " for post expiration processing.");
            }
        }
    }
    
    /**
     * Shared method for webdav/vti protocols to lock node. If node is locked for more than 24 hours it is automatically added
     * to the current session locked resources list.
     * 
     * @param nodeRef the node to lock
     * @param lockType the lock type
     * @param timeout the number of seconds before the locks expires
     */
    @Override
    public void lock(NodeRef nodeRef, String userName, int timeout)
    {
        LockInfo lockInfo = createLock(nodeRef, userName, true, timeout);
        lock(nodeRef, lockInfo);
    }
    
    /**
     * Shared method for webdav/vti to unlock node. Unlocked node is automatically removed from
     * current sessions's locked resources list.
     * 
     * @param nodeRef the node to lock
     */
    @Override
    public void unlock(NodeRef nodeRef)
    {
        lockStore.remove(nodeRef);

        if (logger.isDebugEnabled())
        {
            logger.debug(nodeRef + " was unlocked.");
        }

        HttpSession session = currentSession.get();

        if (session == null)
        {
            if (logger.isDebugEnabled())
            {
                logger.debug("Couldn't find current session.");
            }
            return;
        }

        boolean removed = removeObjectFromSessionList(session, LOCKED_RESOURCES, new Pair<String, NodeRef>(AuthenticationUtil.getRunAsUser(), nodeRef));

        if (removed && logger.isDebugEnabled())
        {
            logger.debug(nodeRef + " was removed from the session " + session.getId());
        }
    }
    
    /**
     * Gets the lock status for the node reference relative to the current user.
     * 
     * @see LockService#getLockStatus(NodeRef, NodeRef)
     * 
     * @param nodeRef    the node reference
     * @return           the lock status
     */
    @Override
    @Auditable(parameters = {"nodeRef"})
    public LockInfo getLockInfo(NodeRef nodeRef)
    {
        return lockStore.get(nodeRef);
    }

    /**
     * Add the given <code>object</code> to the session list that is stored in session under <code>listName</code> attribute
     * 
     * @param session the session 
     * @param listName the list name (session attribute name)
     * @param object the object to store in session list
     */
    @SuppressWarnings("unchecked")
    private static final void storeObjectInSessionList(HttpSession session, String listName, Object object)
    {
        List<Object> list = null;

        synchronized (session)
        {
            list = (List<Object>) session.getAttribute(listName);

            if (list == null)
            {
                list = new ArrayList<Object>();
                session.setAttribute(listName, list);
            }
        }

        synchronized (list)
        {
            if (!list.contains(object))
            {
                list.add(object);
            }
        }
    }

    /**
     * Removes the given <code>object</code> from the session list that is stored in session under <code>listName</code> attribute
     * 
     * @param session the session 
     * @param listName the list name (session attribute name)
     * @param object the object to store in session list
     * 
     * @return <tt>true</tt> if session list contained the specified element, otherwise <tt>false</tt>
     */
    @SuppressWarnings("unchecked")
    private static final boolean removeObjectFromSessionList(HttpSession session, String listName, Object object)
    {
        List<Object> list = null;

        synchronized (session)
        {
            list = (List<Object>) session.getAttribute(listName);
        }

        if (list == null)
        {
            return false;
        }

        synchronized (list)
        {
            return list.remove(object);
        }
    }
    
    /**
     * Create a new lock
     * 
     * @param lockNode NodeRef
     * @param userName String
     * @exception WebDAVServerException
     */
    protected LockInfo createLock(NodeRef nodeRef, String userName, boolean createExclusive, int timeoutSecs)
    {
        // Create Lock token
        String lockToken = WebDAV.makeLockToken(nodeRef, userName);

        LockInfo lockInfo = new LockInfoImpl();
        
        lockInfo.getRWLock().writeLock().lock();
        try
        {
            if (createExclusive)
            {
                // Lock the node
                lockInfo.setTimeoutSeconds(timeoutSecs);
                lockInfo.setExclusiveLockToken(lockToken);
            }
            else
            {
                lockInfo.addSharedLockToken(lockToken);
            }

            // Store lock depth
            lockInfo.setDepth(WebDAV.getDepthName(WebDAV.DEPTH_INFINITY));
            // Store lock scope (shared/exclusive)
            String scope = createExclusive ? WebDAV.XML_EXCLUSIVE : WebDAV.XML_SHARED;
            lockInfo.setScope(scope);
            // Store the owner of this lock
            lockInfo.setOwner(userName);
            // Lock the node
            lockStore.put(nodeRef, lockInfo);
            
            if (logger.isDebugEnabled())
            {
                logger.debug("Locked node " + nodeRef + ": " + lockInfo);
            }
        }
        finally
        {
            lockInfo.getRWLock().writeLock().unlock();
        }
        
        return lockInfo;
    }
    
}

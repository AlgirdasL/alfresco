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
package org.alfresco.util;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Helper class to provide static and common access to the Spring
 * {@link org.springframework.context.ApplicationContext application context}.
 * 
 * @author Derek Hulley
 */
public abstract class BaseApplicationContextHelper
{
    private static ClassPathXmlApplicationContext instance;
    private static String[] usedConfiguration;
    private static boolean useLazyLoading = false;
    private static boolean noAutoStart = false;
    
    /**
     * Provides a static, single instance of the application context.  This method can be
     * called repeatedly.
     * <p/>
     * If the configuration requested differs from one used previously, then the previously-created
     * context is shut down.
     * 
     * @return Returns an application context for the given configuration
     */
    public synchronized static ApplicationContext getApplicationContext(String[] configLocations)
    {
        if (configLocations == null)
        {
            throw new IllegalArgumentException("configLocations argument is mandatory.");
        }
        if (usedConfiguration != null && Arrays.deepEquals(configLocations, usedConfiguration))
        {
            // The configuration was used to create the current context
            return instance;
        }
        // The config has changed so close the current context (if any)
        closeApplicationContext();
       
        if(useLazyLoading || noAutoStart) {
           instance = new VariableFeatureClassPathXmlApplicationContext(configLocations); 
        } else {
           instance = new ClassPathXmlApplicationContext(configLocations);
        }
                    
        usedConfiguration = configLocations;
        
        return instance;
    }
    
    /**
     * Closes and releases the application context.  On the next call to
     * {@link #getApplicationContext()}, a new context will be given.
     */
    public static synchronized void closeApplicationContext()
    {
        if (instance == null)
        {
            // Nothing to do
            return;
        }
        instance.close();
        instance = null;
        usedConfiguration = null;
    }

    /**
     * Should the Spring beans be initilised in a lazy manner, or all in one go?
     * Normally lazy loading/intialising shouldn't be used when running with the
     * full context, but it may be appropriate to reduce startup times when
     * using a small, cut down context.
     */
    public static void setUseLazyLoading(boolean lazyLoading)
    {
        useLazyLoading = lazyLoading;
    }

    /**
     * Will the Spring beans be initilised in a lazy manner, or all in one go?
     * The default it to load everything in one go, as spring normally does.
     */
    public static boolean isUsingLazyLoading()
    {
        return useLazyLoading;
    }

    /**
     * Should the autoStart=true property on subsystems be honoured, or should
     * this property be ignored and the auto start prevented? Normally we will
     * use the spring configuration to decide what to start, but when running
     * tests, you can use this to prevent the auto start.
     */
    public static void setNoAutoStart(boolean noAutoStart)
    {
        BaseApplicationContextHelper.noAutoStart = noAutoStart;
    }

    /**
     * Will Subsystems with the autoStart=true property set on them be allowed
     * to auto start? The default is to honour the spring configuration and
     * allow them to, but they can be prevented if required.
     */
    public static boolean isNoAutoStart()
    {
        return noAutoStart;
    }

    /**
     * Is there currently a context loaded and cached?
     */
    public static boolean isContextLoaded()
    {
        return (instance != null);
    }

    /**
     * A wrapper around {@link ClassPathXmlApplicationContext} which allows us
     * to enable lazy loading or prevent Subsystem autostart as requested.
     */
    protected static class VariableFeatureClassPathXmlApplicationContext extends ClassPathXmlApplicationContext
    {
        protected VariableFeatureClassPathXmlApplicationContext(String[] configLocations) throws BeansException
        {
            super(configLocations);
        }

        protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader)
        {
            super.initBeanDefinitionReader(reader);

            if (useLazyLoading)
            {
                LazyClassPathXmlApplicationContext.postInitBeanDefinitionReader(reader);
            }
            if (noAutoStart)
            {
                NoAutoStartClassPathXmlApplicationContext.postInitBeanDefinitionReader(reader);
            }
        }
    }
}

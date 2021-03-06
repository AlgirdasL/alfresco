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
package org.alfresco.repo.cache;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;

import org.springframework.beans.factory.BeanNameAware;

import com.googlecode.concurrentlinkedhashmap.ConcurrentLinkedHashMap;
import com.googlecode.concurrentlinkedhashmap.Weighers;

/**
 * {@link SimpleCache} implementation backed by a {@link ConcurrentLinkedHashMap}.
 * 
 * @author Matt Ward
 */
public final class DefaultSimpleCache<K extends Serializable, V extends Object>
    implements SimpleCache<K, V>, BeanNameAware
{
    private static final int DEFAULT_CAPACITY = 200000;
    private ConcurrentLinkedHashMap<K, AbstractMap.SimpleImmutableEntry<K, V>> map;
    private String cacheName;
    
    /**
     * Construct a cache using the specified capacity and name.
     * 
     * @param maxItems The cache capacity.
     */
    public DefaultSimpleCache(int maxItems, String cacheName)
    {
        if (maxItems < 1)
        {
            throw new IllegalArgumentException("maxItems must be a positive integer, but was " + maxItems);
        }
        
        setBeanName(cacheName);
        
        // The map will have a bounded size determined by the maxItems member variable.
        map = new ConcurrentLinkedHashMap.Builder<K, AbstractMap.SimpleImmutableEntry<K, V>>()
                    .maximumWeightedCapacity(maxItems)
                    .concurrencyLevel(32)
                    .weigher(Weighers.singleton())
                    .build();
    }
    
    /**
     * Default constructor. Initialises the cache with a default capacity {@link #DEFAULT_CAPACITY}
     * and no name.
     */
    public DefaultSimpleCache()
    {
        this(DEFAULT_CAPACITY, null);
    }
    
    @Override
    public boolean contains(K key)
    {
        return map.containsKey(key);
    }

    @Override
    public Collection<K> getKeys()
    {
        return map.keySet();
    }

    @Override
    public V get(K key)
    {
        AbstractMap.SimpleImmutableEntry<K, V> kvp = map.get(key);
        if (kvp == null)
        {
            return null;
        }
        return kvp.getValue();
    }

    @Override
    public void put(K key, V value)
    {
        AbstractMap.SimpleImmutableEntry<K, V> kvp = new AbstractMap.SimpleImmutableEntry<K, V>(key, value);
        map.put(key, kvp);
    }

    @Override
    public void remove(K key)
    {
        map.remove(key);
    }

    @Override
    public void clear()
    {
        map.clear();
    }

    @Override
    public String toString()
    {
        return "DefaultSimpleCache[maxItems=" + map.capacity() + ", cacheName=" + cacheName + "]";
    }

    /**
     * Sets the maximum number of items that the cache will hold.
     * 
     * @param maxItems
     */
    public void setMaxItems(int maxItems)
    {
        map.setCapacity(maxItems);
    }

    /**
     * Since there are many cache instances, it is useful to be able to associate
     * a name with each one.
     * 
     * @param cacheName Set automatically by Spring, but can be set manually if required.
     */
    @Override
    public void setBeanName(String cacheName)
    {
        this.cacheName = cacheName;
    }
}

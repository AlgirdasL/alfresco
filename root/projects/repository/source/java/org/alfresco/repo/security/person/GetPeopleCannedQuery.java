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
package org.alfresco.repo.security.person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.alfresco.error.AlfrescoRuntimeException;
import org.alfresco.query.AbstractCannedQuery;
import org.alfresco.query.CannedQueryParameters;
import org.alfresco.query.CannedQuerySortDetails;
import org.alfresco.query.CannedQuerySortDetails.SortOrder;
import org.alfresco.repo.domain.node.NodeDAO;
import org.alfresco.repo.domain.qname.QNameDAO;
import org.alfresco.repo.domain.query.CannedQueryDAO;
import org.alfresco.repo.tenant.TenantService;
import org.alfresco.service.cmr.repository.InvalidNodeRefException;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.repository.StoreRef;
import org.alfresco.service.namespace.QName;
import org.alfresco.util.Pair;
import org.alfresco.util.ParameterCheck;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * GetPeople canned query
 * 
 * To get paged list of children of a parent node filtered by child type.
 * Also optionally filtered and/or sorted by one or more properties (up to three).
 *
 * @author janv
 * @since 4.1.2
 */
public class GetPeopleCannedQuery extends AbstractCannedQuery<NodeRef>
{
    private Log logger = LogFactory.getLog(getClass());
    
    private static final String QUERY_NAMESPACE = "alfresco.query.people";
    private static final String QUERY_SELECT_GET_PEOPLE = "select_GetPeopleCannedQuery";
    
    public static final int MAX_FILTER_SORT_PROPS = 3;
    
    private NodeDAO nodeDAO;
    private QNameDAO qnameDAO;
    private CannedQueryDAO cannedQueryDAO;
    private TenantService tenantService;
    
    public GetPeopleCannedQuery(
            NodeDAO nodeDAO,
            QNameDAO qnameDAO,
            CannedQueryDAO cannedQueryDAO,
            TenantService tenantService,
            CannedQueryParameters params)
    {
        super(params);
        
        this.nodeDAO = nodeDAO;
        this.qnameDAO = qnameDAO;
        this.cannedQueryDAO = cannedQueryDAO;
        this.tenantService = tenantService;
    }
    
    @Override
    protected List<NodeRef> queryAndFilter(CannedQueryParameters parameters)
    {
        Long start = (logger.isDebugEnabled() ? System.currentTimeMillis() : null);
        
        // Get parameters
        GetPeopleCannedQueryParams paramBean = (GetPeopleCannedQueryParams)parameters.getParameterBean();
        
        // Get parent node
        NodeRef parentRef = paramBean.getParentRef();
        ParameterCheck.mandatory("nodeRef", parentRef);
        Pair<Long, NodeRef> nodePair = nodeDAO.getNodePair(parentRef);
        if (nodePair == null)
        {
            throw new InvalidNodeRefException("Parent node does not exist: " + parentRef, parentRef);
        }
        Long parentNodeId = nodePair.getFirst();
        
        // Set query params - note: currently using SortableChildEntity to hold (supplemental-) query params
        FilterSortPersonEntity params = new FilterSortPersonEntity();
        
        // Set parent node id
        params.setParentNodeId(parentNodeId);
        
        // Get filter details
        final List<QName> filterProps = paramBean.getFilterProps();
        
        // Get sort details
        CannedQuerySortDetails sortDetails = parameters.getSortDetails();
        @SuppressWarnings({ "unchecked", "rawtypes" })
        final List<Pair<QName, SortOrder>> sortPairs = (List)sortDetails.getSortPairs();
        
        String pattern = paramBean.getPattern();
        if ((sortPairs.size() > 0) && ((pattern == null) || (pattern.equals(""))))
        {
            // note: although no pattern means no filtering required, we currently need to match all if sort required
            pattern = "%";
        }
        else if ((! pattern.endsWith("%")) && (! pattern.endsWith("*")))
        {
            // implicit startsWith match
            pattern = pattern + "%";
        }
        
        // Set filter pattern
        params.setPattern(pattern);
        
        // Set sort / filter params
        // Note - need to keep the sort properties in their requested order
        List<QName> sortFilterProps = new ArrayList<QName>(MAX_FILTER_SORT_PROPS);
        Map<QName, Boolean> sortAsc = new HashMap<QName, Boolean>(MAX_FILTER_SORT_PROPS);
        
        // add sort props first
        for (Pair<QName, SortOrder> sort : sortPairs)
        {
            QName sortQName = sort.getFirst();
            if ((filterProps.size() > 0) && (! filterProps.contains(sortQName)))
            {
                throw new AlfrescoRuntimeException("GetPeople: cannot sort by a non-filter property: "+sortQName+" (filterStringProps="+filterProps+")");
            }
            
            if (! sortFilterProps.contains(sortQName))
            {
               sortFilterProps.add(sortQName);
               sortAsc.put(sortQName, sort.getSecond().equals(SortOrder.ASCENDING));
            }
        }
        
        // add any additional filter props (not part of sort)
        for (QName filterQName : filterProps)
        {
            if (! sortFilterProps.contains(filterQName))
            {
               sortFilterProps.add(filterQName);
               sortAsc.put(filterQName, null);
            }
        }
        
        int filterSortPropCnt = sortFilterProps.size();
        
        if (filterSortPropCnt > MAX_FILTER_SORT_PROPS)
        {
            throw new AlfrescoRuntimeException("GetPeople: exceeded maximum number filter/sort properties: (max="+MAX_FILTER_SORT_PROPS+", actual="+filterSortPropCnt);
        }
        
        filterSortPropCnt = setFilterSortParams(sortFilterProps, sortAsc, params);
        
        // filtered and/or sorted - note: permissions not applicable for getPeople
        final List<NodeRef> result = new ArrayList<NodeRef>(100);
        final PersonQueryCallback c = new DefaultPersonQueryCallback(result);
        PersonResultHandler resultHandler = new PersonResultHandler(c);
        
        int offset = parameters.getPageDetails().getSkipResults();
        int limit = parameters.getPageDetails().getPageSize();
        if (limit != Integer.MAX_VALUE)
        {
            // to enable hasMore flag
            limit++;
        }
        
        cannedQueryDAO.executeQuery(QUERY_NAMESPACE, QUERY_SELECT_GET_PEOPLE, params, offset, limit, resultHandler);
        resultHandler.done();
        
        if (start != null)
        {
            logger.debug("Base query: "+result.size()+" in "+(System.currentTimeMillis()-start)+" msecs");
        }
        
        return result;
    }
    
    // Set filter/sort props (between 0 and 3)
    private int setFilterSortParams(List<QName> filterSortProps, Map<QName, Boolean> sortAsc, FilterSortPersonEntity params)
    {
        int cnt = 0;
        int propCnt = 0;
        
        for (QName filterSortProp : filterSortProps)
        {
            Long sortQNameId = getQNameId(filterSortProp);
            Boolean sortOrder = sortAsc.get(filterSortProp); // true = ascending, false = descending, null = unsorted
            
            if (sortQNameId != null)
            {
                if (propCnt == 0)
                {
                    params.setProp1qnameId(sortQNameId);
                    params.setSort1asc(sortOrder);
                }
                else if (propCnt == 1)
                {
                    params.setProp2qnameId(sortQNameId);
                    params.setSort2asc(sortOrder);
                }
                else if (propCnt == 2)
                {
                    params.setProp3qnameId(sortQNameId);
                    params.setSort3asc(sortOrder);
                }
                else
                {
                    // belts and braces
                    throw new AlfrescoRuntimeException("GetPeople: unexpected - cannot set sort parameter: "+cnt);
                }
                
                propCnt++;
            }
            else
            {
                logger.warn("Skipping filter/sort param - cannot find: "+filterSortProp);
                break;
            }
            
            cnt++;
        }
        
        return cnt;
    }
    
    private Long getQNameId(QName sortPropQName)
    {
        Pair<Long, QName> qnamePair = qnameDAO.getQName(sortPropQName);
        return (qnamePair == null ? null : qnamePair.getFirst());
    }
    
    @Override
    protected boolean isApplyPostQuerySorting()
    {
        // note: sorted as part of the query impl
        return false;
    }
    
    @Override
    protected boolean isApplyPostQueryPermissions()
    {
        return false;
    }
    
    @Override
    protected boolean isApplyPostQueryPaging()
    {
        return false;
    }
    
    @Override
    protected Pair<Integer, Integer> getTotalResultCount(List<NodeRef> results)
    {
        return null;
    }
    
    protected interface PersonQueryCallback
    {
        boolean handle(NodeRef personRef);
    }
    
    protected class DefaultPersonQueryCallback implements PersonQueryCallback
    {
        private List<NodeRef> children;
        
        public DefaultPersonQueryCallback(final List<NodeRef> children)
        {
            this.children = children;
        }
        
        @Override
        public boolean handle(NodeRef personRef)
        {
            children.add(tenantService.getBaseName(personRef));
            
            // More results
            return true;
        }
    }
    
    protected class PersonResultHandler implements CannedQueryDAO.ResultHandler<String>
    {
        private final PersonQueryCallback resultsCallback;
        
        private PersonResultHandler(PersonQueryCallback resultsCallback)
        {
            this.resultsCallback = resultsCallback;
        }
        
        public boolean handleResult(String uuid)
        {
            // Call back
            return resultsCallback.handle(new NodeRef(StoreRef.STORE_REF_WORKSPACE_SPACESSTORE, uuid));
        }
        
        public void done()
        {
        }
    }
}
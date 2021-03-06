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
package org.alfresco.repo.search.impl.querymodel.impl.lucene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.alfresco.repo.search.impl.lucene.LuceneUtils;
import org.alfresco.repo.search.impl.querymodel.Column;
import org.alfresco.repo.search.impl.querymodel.Constraint;
import org.alfresco.repo.search.impl.querymodel.FunctionEvaluationContext;
import org.alfresco.repo.search.impl.querymodel.Order;
import org.alfresco.repo.search.impl.querymodel.Ordering;
import org.alfresco.repo.search.impl.querymodel.PropertyArgument;
import org.alfresco.repo.search.impl.querymodel.Selector;
import org.alfresco.repo.search.impl.querymodel.Source;
import org.alfresco.repo.search.impl.querymodel.impl.BaseQuery;
import org.alfresco.repo.search.impl.querymodel.impl.functions.PropertyAccessor;
import org.alfresco.repo.search.impl.querymodel.impl.functions.Score;
import org.alfresco.service.cmr.search.SearchParameters.SortDefinition;
import org.alfresco.service.cmr.search.SearchParameters.SortDefinition.SortType;
import org.apache.lucene.index.Term;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.SortField;
import org.apache.lucene.search.TermQuery;

/**
 * @author andyh
 */
public class LuceneQuery extends BaseQuery implements LuceneQueryBuilder
{

    /**
     * @param columns
     * @param source
     * @param constraint
     * @param orderings
     */
    public LuceneQuery(List<Column> columns, Source source, Constraint constraint, List<Ordering> orderings)
    {
        super(columns, source, constraint, orderings);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.alfresco.repo.search.impl.querymodel.impl.lucene.LuceneQueryBuilder#buildQuery()
     */
    public Query buildQuery(Set<String> selectors, LuceneQueryBuilderContext luceneContext, FunctionEvaluationContext functionContext) throws ParseException
    {

        BooleanQuery luceneQuery = new BooleanQuery();

        boolean must = false;
        @SuppressWarnings("unused")
        boolean should = false;
        boolean must_not = false;

        if (selectors != null)
        {
            for (String selector : selectors)
            {
                Selector current = getSource().getSelector(selector);
                if (current instanceof LuceneQueryBuilderComponent)
                {
                    LuceneQueryBuilderComponent luceneQueryBuilderComponent = (LuceneQueryBuilderComponent) current;
                    Query selectorQuery = luceneQueryBuilderComponent.addComponent(selectors, null, luceneContext, functionContext);
                    if (selectorQuery != null)
                    {
                        luceneQuery.add(selectorQuery, Occur.MUST);
                        must = true;
                    }
                }
                else
                {
                    throw new UnsupportedOperationException();
                }
            }
        }

        Constraint constraint = getConstraint();
        if (constraint != null)
        {
            if (constraint instanceof LuceneQueryBuilderComponent)
            {
                LuceneQueryBuilderComponent luceneQueryBuilderComponent = (LuceneQueryBuilderComponent) constraint;
                Query constraintQuery = luceneQueryBuilderComponent.addComponent(selectors, null, luceneContext, functionContext);
                
                if (constraintQuery != null)
                {
                    constraintQuery.setBoost(constraint.getBoost());
                    switch (constraint.getOccur())
                    {
                    case DEFAULT:
                    case MANDATORY:
                        luceneQuery.add(constraintQuery, Occur.MUST);
                        must = true;
                        break;
                    case OPTIONAL:
                        luceneQuery.add(constraintQuery, Occur.SHOULD);
                        should = true;
                        break;
                    case EXCLUDE:
                        luceneQuery.add(constraintQuery, Occur.MUST_NOT);
                        must_not = true;
                        break;
                    }
                }
            }
            else
            {
                throw new UnsupportedOperationException();
            }
        }

        if (!must && must_not)
        {
            luceneQuery.add(new TermQuery(new Term("ISNODE", "T")), BooleanClause.Occur.MUST);
        }

        return luceneQuery;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.alfresco.repo.search.impl.querymodel.impl.lucene.LuceneQueryBuilder#buildSort(java.lang.String,
     *      org.alfresco.repo.search.impl.querymodel.impl.lucene.LuceneQueryBuilderContext,
     *      org.alfresco.repo.search.impl.querymodel.FunctionEvaluationContext)
     */
    public Sort buildSort(Set<String> selectors, LuceneQueryBuilderContext luceneContext, FunctionEvaluationContext functionContext)
    {
        if ((getOrderings() == null) || (getOrderings().size() == 0))
        {
            return null;
        }

        int index = 0;
        SortField[] fields = new SortField[getOrderings().size()];

        for (Ordering ordering : getOrderings())
        {
            if (ordering.getColumn().getFunction().getName().equals(PropertyAccessor.NAME))
            {
                PropertyArgument property = (PropertyArgument) ordering.getColumn().getFunctionArguments().get(PropertyAccessor.ARG_PROPERTY);

                if (property == null)
                {
                    throw new IllegalStateException();
                }

                String propertyName = property.getPropertyName();

                String luceneField = functionContext.getLuceneSortField(luceneContext.getLuceneQueryParser(), propertyName);

                if (luceneField != null)
                {
                    if (LuceneUtils.fieldHasTerm(luceneContext.getLuceneQueryParser().getIndexReader(), luceneField))
                    {
                        Locale locale = luceneContext.getLuceneQueryParser().getSearchParameters().getSortLocale();
//                        if(locale.getLanguage().equals(Locale.ENGLISH.getLanguage()))
//                        {
//                            fields[index++] = new SortField(luceneField, (ordering.getOrder() == Order.DESCENDING));
//                        }
//                        else
//                        {
                        fields[index++] = new SortField(luceneField, locale, (ordering.getOrder() == Order.DESCENDING));
//                        }
                    }
                    else
                    {
                        fields[index++] = new SortField(null, SortField.DOC, (ordering.getOrder() == Order.DESCENDING));
                    }
                }
                else
                {
                    throw new IllegalStateException();
                }
            }
            else if (ordering.getColumn().getFunction().getName().equals(Score.NAME))
            {
                fields[index++] = new SortField(null, SortField.SCORE, !(ordering.getOrder() == Order.DESCENDING));
            }
            else
            {
                throw new IllegalStateException();
            }

        }

        return new Sort(fields);
    }
    
    public List<SortDefinition> buildSortDefinitions(Set<String> selectors, LuceneQueryBuilderContext luceneContext, FunctionEvaluationContext functionContext)
    {
        if ((getOrderings() == null) || (getOrderings().size() == 0))
        {
            return Collections.<SortDefinition>emptyList();
        }

        ArrayList<SortDefinition> definitions = new ArrayList<SortDefinition>(getOrderings().size());

        for (Ordering ordering : getOrderings())
        {
            if (ordering.getColumn().getFunction().getName().equals(PropertyAccessor.NAME))
            {
                PropertyArgument property = (PropertyArgument) ordering.getColumn().getFunctionArguments().get(PropertyAccessor.ARG_PROPERTY);

                if (property == null)
                {
                    throw new IllegalStateException();
                }

                String propertyName = property.getPropertyName();

                String fieldName = functionContext.getLuceneFieldName(propertyName);
                
                definitions.add(new SortDefinition(SortType.FIELD, fieldName, ordering.getOrder() == Order.ASCENDING));
            }
            else if (ordering.getColumn().getFunction().getName().equals(Score.NAME))
            {
                definitions.add(new SortDefinition(SortType.SCORE, null, ordering.getOrder() == Order.ASCENDING));
            }
        }

        return definitions;
    }
}

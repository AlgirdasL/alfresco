/*
 * Copyright (C) 2005-2011 Alfresco Software Limited.
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
package org.alfresco.util.schemacomp;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.alfresco.util.schemacomp.Difference.Where;
import org.alfresco.util.schemacomp.model.Column;
import org.alfresco.util.schemacomp.model.ForeignKey;
import org.alfresco.util.schemacomp.model.Index;
import org.alfresco.util.schemacomp.model.PrimaryKey;
import org.alfresco.util.schemacomp.model.Schema;
import org.alfresco.util.schemacomp.model.Table;
import org.apache.commons.lang.ArrayUtils;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the SchmeaComparator class.
 * 
 * @author Matt Ward
 */
public class SchemaComparatorTest
{
    private SchemaComparator comparator;
    private Schema left;
    private Schema right;
    private Dialect dialect;
    
    @Before
    public void setup()
    {
        left = new Schema("left_schema");
        right = new Schema("right_schema");
        dialect = new MySQL5InnoDBDialect();
    }
    

    @Test
    public void canPerformDiff()
    {
        // Left hand side's database objects.
        left.add(new Table(left, "tbl_no_diff", columns("id NUMBER(10)", "nodeRef VARCHAR2(200)", "name VARCHAR2(150)"), 
                    pk("pk_tbl_no_diff", "id"), fkeys(fk("fk_tbl_no_diff", "nodeRef", "node", "nodeRef")),
                    indexes("idx_node id nodeRef")));
        left.add(table("table_in_left"));
        left.add(new Table(left, "tbl_has_diff_pk", columns("id NUMBER(10)", "nodeRef VARCHAR2(200)"),
                    pk("pk_is_diff", "id"), fkeys(), indexes()));
        
        // Right hand side's database objects.
        right.add(new Table(right, "tbl_no_diff", columns("id NUMBER(10)", "nodeRef VARCHAR2(200)", "name VARCHAR2(150)"), 
                    pk("pk_tbl_no_diff", "id"), fkeys(fk("fk_tbl_no_diff", "nodeRef", "node", "nodeRef")),
                    indexes("idx_node id nodeRef")));
        right.add(new Table(right, "tbl_has_diff_pk", columns("id NUMBER(10)", "nodeRef VARCHAR2(200)"),
                    pk("pk_is_diff", "nodeRef"), fkeys(), indexes()));
        right.add(table("table_in_right"));
        
        
        comparator = new SchemaComparator(left, right, dialect);
        comparator.validateAndCompare();
        
        // See stdout for diagnostics dump...
        dumpDiffs(comparator.getDifferences(), false);
        dumpValidation(comparator.getValidationResults());
        

        Results differences = comparator.getDifferences();
        assertEquals(5, differences.size());
        
        Iterator<Difference> it = differences.iterator();
        
        // Schema names are different ("left_schema" vs "right_schema")
        Difference diff = it.next();
        assertEquals(Where.IN_BOTH_BUT_DIFFERENCE, diff.getWhere());
        assertEquals("left_schema.name", diff.getLeft().getPath());
        assertEquals("right_schema.name", diff.getRight().getPath());
        assertSame(left, diff.getLeft().getDbObject());
        assertSame(right, diff.getRight().getDbObject());
        assertEquals("name", diff.getLeft().getPropertyName());
        assertEquals("left_schema", diff.getLeft().getPropertyValue());
        assertEquals("name", diff.getRight().getPropertyName());
        assertEquals("right_schema", diff.getRight().getPropertyValue());
        
        // Table table_in_left only appears in the left schema
        diff = it.next();
        assertEquals(Where.ONLY_IN_LEFT, diff.getWhere());
        assertEquals("left_schema.table_in_left", diff.getLeft().getPath());
        assertEquals(null, diff.getRight());
        assertEquals(null, diff.getLeft().getPropertyName());
        assertEquals(null, diff.getLeft().getPropertyValue());
        
        // Table tbl_has_diff_pk has PK of "id" in left and "nodeRef" in right
        diff = it.next();
        assertEquals(Where.ONLY_IN_LEFT, diff.getWhere());
        assertEquals("left_schema.tbl_has_diff_pk.pk_is_diff.columnNames[0]", diff.getLeft().getPath());
        assertEquals("right_schema.tbl_has_diff_pk.pk_is_diff.columnNames", diff.getRight().getPath());
        assertEquals("columnNames[0]", diff.getLeft().getPropertyName());
        assertEquals("id", diff.getLeft().getPropertyValue());
        assertEquals("columnNames", diff.getRight().getPropertyName());
        assertEquals(Arrays.asList("nodeRef"), diff.getRight().getPropertyValue());
        
        // Table tbl_has_diff_pk has PK of "id" in left and "nodeRef" in right
        diff = it.next();
        assertEquals(Where.ONLY_IN_RIGHT, diff.getWhere());
        assertEquals("left_schema.tbl_has_diff_pk.pk_is_diff.columnNames", diff.getLeft().getPath());
        assertEquals("right_schema.tbl_has_diff_pk.pk_is_diff.columnNames[0]", diff.getRight().getPath());
        assertEquals("columnNames", diff.getLeft().getPropertyName());
        assertEquals(Arrays.asList("id"), diff.getLeft().getPropertyValue());
        assertEquals("columnNames[0]", diff.getRight().getPropertyName());
        assertEquals("nodeRef", diff.getRight().getPropertyValue());
        
        // Table table_in_right does not exist in the left schema
    }
    
    
    private void dumpValidation(List<ValidationResult> validationResults)
    {
        System.out.println("Validation Results (" + validationResults.size() + ")");
        for (ValidationResult r : validationResults)
        {
            System.out.println(r);
        }
    }
        
    private void dumpDiffs(Results differences, boolean showNonDifferences)
    {
        System.out.println("Differences (" + differences.size() + ")");
        for (Difference d : differences)
        {
            if (d.getWhere() != Where.IN_BOTH_NO_DIFFERENCE || showNonDifferences)
            {
                System.out.println(d);
            }
        }
    }

    private Table table(String name)
    {
        return new Table(null, name, columns("id NUMBER(10)"), pk("pk_" + name, "id"), fkeys(), indexes());
    }
    
    private Collection<Column> columns(String... colDefs)
    {
        assertTrue("Tables must have columns", colDefs.length > 0);
        Column[] columns = new Column[colDefs.length];

        for (int i = 0; i < colDefs.length; i++)
        {
            String[] parts = colDefs[i].split(" ");
            columns[i] = new Column(null, parts[0], parts[1], false);
        }
        return Arrays.asList(columns);
    }
    
    private PrimaryKey pk(String name, String... columnNames)
    {
        assertTrue("No columns specified", columnNames.length > 0);
        PrimaryKey pk = new PrimaryKey(null, name, Arrays.asList(columnNames));
        return pk;
    }
    
    private List<ForeignKey> fkeys(ForeignKey... fkeys)
    {
        return Arrays.asList(fkeys);
    }
    
    private ForeignKey fk(String fkName, String localColumn, String targetTable, String targetColumn)
    {
        return new ForeignKey(null, fkName, localColumn, targetTable, targetColumn);
    }
    
    private Collection<Index> indexes(String... indexDefs)
    {
        Index[] indexes = new Index[indexDefs.length];
        for (int i = 0; i < indexDefs.length; i++)
        {
            String[] parts = indexDefs[i].split(" ");
            String name = parts[0];
            String[] columns = (String[]) ArrayUtils.subarray(parts, 1, parts.length);
            indexes[i] = new Index(null, name, Arrays.asList(columns));
        }
        return Arrays.asList(indexes);
    }
}

package com.testds.ds.trees.problems;

import com.testds.ds.trees.TreeNode;
import com.testds.ds.trees.traversal.PreOrderTraversal;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class BuildTreeFromPreOrderTraversalStringTest extends TestCase {

    BuildTreeFromPreOrderTraversalString buildTreeFromPreOrderTraversalString;

    @Parameterized.Parameter
    public String preOrderString;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"ILILL"},
                        {"IILLL"},
                        {"IILILLILL"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(BuildTreeFromPreOrderTraversalString.class);
    }

    @Before
    public void setUp() {
        buildTreeFromPreOrderTraversalString = new BuildTreeFromPreOrderTraversalString();
    }

    @org.junit.Test
    public void testBuildTreeFromPreOrderTraversalString() {
        TreeNode root = buildTreeFromPreOrderTraversalString.buildTree(preOrderString);
        assertEquals(preOrderString,
                convertToString(new PreOrderTraversal().preOrderTraversalWithoutRecursion(root)));
    }

    private String convertToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i == 73 ? 'I' : 'L');
        }
        return sb.toString();
    }

    @After
    public void tearDown() {
        buildTreeFromPreOrderTraversalString = null;
    }


}

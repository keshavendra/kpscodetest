package com.testds.ds.trees.problems;

import com.testds.leetcode.utils.TreeNode;
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
public class VerticalSumInBinaryTreeTest extends TestCase {

    private VerticalSumInBinaryTree verticalSumInBinaryTree;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 2, 3, 4, 5, 6, 7}, Arrays.asList(4, 2, 12, 3, 7)},
        });
    }

    public static Test suite() {
        return new TestSuite(VerticalSumInBinaryTreeTest.class);
    }

    @Before
    public void setUp() {
        verticalSumInBinaryTree = new VerticalSumInBinaryTree();
    }

    @org.junit.Test
    public void testVerticalSum() {
        List<Integer> actualResult = verticalSumInBinaryTree.verticalSum(TreeNode.createTree(nodes));
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void cleanUp() {
        verticalSumInBinaryTree = null;
    }

}

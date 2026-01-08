package com.testds.leetcode.problems.validateBinarySearchTree;

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

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{2, 1, 3}, true},
                        {new Integer[]{5, 1, 4, null, null, 3, 6}, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setup() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testIsValidBST() {
        assertEquals(expectedResult, solution.isValidBST(TreeNode.createTree(nodes)));
    }

    @After
    public void cleanup() {
        solution = null;
    }

}

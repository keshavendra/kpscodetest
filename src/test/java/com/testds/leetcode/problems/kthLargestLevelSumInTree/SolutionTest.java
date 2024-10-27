package com.testds.leetcode.problems.kthLargestLevelSumInTree;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{5, 8, 9, 2, 1, 3, 7, 4, 6}, 2, 13},
                        {new Integer[]{1, 2, null, 3}, 1, 3}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testKthLargestLevelSumInTree() {
        TreeNode root = TreeNode.createTree(nodes);
        long actualResult = solution.kthLargestLevelSum(root, k);
        assertEquals(expectedResult, actualResult);
    }

}

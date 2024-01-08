package com.testds.leetcode.problems.rangeSumBST;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public int low;

    @Parameterized.Parameter(2)
    public int high;

    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{10, 5, 15, 3, 7, null, 18}, 7, 15, 32},
                        {new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6}, 6, 10, 23}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRangeSumBST() {
        int actualResult = solution.rangeSumBST(TreeNode.createTree(nodes), low, high);
        assertEquals(expectedResult, actualResult);
    }

}

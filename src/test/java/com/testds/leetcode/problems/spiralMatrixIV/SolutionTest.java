package com.testds.leetcode.problems.spiralMatrixIV;

import com.testds.leetcode.utils.ListNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int m;

    @Parameterized.Parameter(1)
    public int n;

    @Parameterized.Parameter(2)
    public int[] nodes;

    @Parameterized.Parameter(3)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {3, 5, new int[]{3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0}, new int[][]{{3, 0, 2, 6, 8}, {5, 0, -1, -1, 1}, {5, 2, 4, 9, 7}}},
                        {1, 4, new int[]{0, 1, 2}, new int[][]{{0, 1, 2, -1}}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSpiralMatrix() {
        int[][] actualResult = solution.spiralMatrix(m, n, ListNode.createList(nodes));
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

package com.testds.leetcode.problems.divideArrayWithMaxDifference;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2, new int[][]{{1, 1, 3}, {3, 4, 5}, {7, 8, 9}}},
                        {new int[]{1, 3, 3, 2, 7, 3}, 3, new int[0][0]},
                        {new int[]{15, 13, 12, 13, 12, 14, 12, 2, 3, 13, 12, 14, 14, 13, 5, 12, 12, 2, 13, 2, 2}, 2, new int[0][0]}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDivideArrayWithMaxDifference() {
        int[][] actualResult = solution.divideArray(nums, k);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

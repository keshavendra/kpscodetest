package com.testds.leetcode.problems.rangeSumOfSortedSubarraySum;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int n;

    @Parameterized.Parameter(2)
    public int left;

    @Parameterized.Parameter(3)
    public int right;

    @Parameterized.Parameter(4)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 4}, 4, 1, 5, 13},
                        {new int[]{1, 2, 3, 4}, 4, 3, 4, 6},
                        {new int[]{1, 2, 3, 4}, 4, 1, 10, 50}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRangeSumOfSortedSubarraySum() {
        int actualResult = solution.rangeSum(nums, n, left, right);
        assertEquals(expectedResult, actualResult);
    }

}

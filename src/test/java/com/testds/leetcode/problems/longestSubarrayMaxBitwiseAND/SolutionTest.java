package com.testds.leetcode.problems.longestSubarrayMaxBitwiseAND;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 3, 2, 2}, 2},
                        {new int[]{1, 2, 3, 4}, 1},
                        {new int[]{1, 4, 2, 2, 4, 4}, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLongestSubarrayMaxBitwiseAND() {
        int actualResult = solution.longestSubarray(nums);
        assertEquals(expectedResult, actualResult);
    }

}

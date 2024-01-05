package com.testds.leetcode.problems.lengthOfLIS;

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
                        {new int[]{10, 9, 2, 5, 3, 7, 101, 18}, 4},
                        {new int[]{0, 1, 0, 3, 2, 3}, 4},
                        {new int[]{7, 7, 7, 7, 7, 7, 7}, 1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLengthOfLIS() {
        int actualResult = solution.lengthOfLIS(nums);
        assertEquals(expectedResult, actualResult);
    }
}

package com.testds.leetcode.problems.minDiffBwMaxAndMin;

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
                        {new int[]{9, 48, 92, 48, 81, 31}, 17},
                        {new int[]{5, 3, 2, 4}, 0},
                        {new int[]{1, 5, 0, 10, 14}, 1},
                        {new int[]{3, 100, 20}, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinDiffBwMaxAndMin() {
        int actualResult = solution.minDifference(nums);
        assertEquals(expectedResult, actualResult);
    }
}

package com.testds.leetcode.problems.maxProfitJobScheduling;

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
    public int[] startTime;

    @Parameterized.Parameter(1)
    public int[] endTime;

    @Parameterized.Parameter(2)
    public int[] profit;

    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}, 120},
                        {new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}, 150},
                        {new int[]{1, 1, 1}, new int[]{2, 3, 4}, new int[]{5, 6, 4}, 6}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxProfitJobScheduling() {
        int actualResult = solution.jobScheduling(startTime, endTime, profit);
        assertEquals(expectedResult, actualResult);
    }

}

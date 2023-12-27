package com.testds.leetcode.problems.minTime2MkRopeColrful;

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
    public String colors;

    @Parameterized.Parameter(1)
    public int[] neededTime;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"abaac", new int[]{1, 2, 3, 4, 5}, 3},
                        {"abc", new int[]{1, 2, 3}, 0},
                        {"aabaa", new int[]{1, 2, 3, 4, 1}, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinTime2MkRopeColrful() {
        int actualResult = solution.minCost(colors, neededTime);
        assertEquals(expectedResult, actualResult);
    }

}

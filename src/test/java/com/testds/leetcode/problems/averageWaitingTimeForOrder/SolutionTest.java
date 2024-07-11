package com.testds.leetcode.problems.averageWaitingTimeForOrder;

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
    public int[][] customers;

    @Parameterized.Parameter(1)
    public double expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 2}, {2, 5}, {4, 3}}, 5.0},
                        {new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}}, 3.25000}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testAverageWaitingTimeForOrder() {
        double actualResult = solution.averageWaitingTime(customers);
        assertEquals(expectedResult, actualResult);
    }

}

package com.testds.leetcode.problems.numWaterBottles;

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
    public int numBottles;

    @Parameterized.Parameter(1)
    public int numExchange;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 3, 1},
                {3, 3, 4},
                {5, 3, 7},
                {9, 3, 13},
                {15, 4, 19}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testNumWaterBottles() {
        int actualResult = solution.numWaterBottles(numExchange, numBottles);
        assertEquals(expectedResult, actualResult);
    }

}

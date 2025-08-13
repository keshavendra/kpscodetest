package com.testds.leetcode.problems.containerWithMostWater;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;


    @Parameterized.Parameter()
    public int[] height;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testMaxArea() {
        int actualResult = solution.maxArea(height);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Parameterized.Parameters(name = "{index}: Test Max Area with height array {0} and expectedResult {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49},
                        {new int[]{1, 1}, 1}
                }
        );
    }
}
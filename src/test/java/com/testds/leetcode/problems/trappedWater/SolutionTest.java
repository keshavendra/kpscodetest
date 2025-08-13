package com.testds.leetcode.problems.trappedWater;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] height;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6},
                        {new int[]{4, 2, 0, 3, 2, 5}, 9},
                        {new int[]{1, 2, 3, 4, 5}, 0},
                        {new int[]{5, 4, 3, 2, 1}, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testTrappedWater() {
        assertEquals(expectedResult, solution.trap(height));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

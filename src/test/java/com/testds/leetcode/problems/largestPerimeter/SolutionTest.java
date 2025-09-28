package com.testds.leetcode.problems.largestPerimeter;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 1, 2}, 5},
                        {new int[]{1, 2, 1, 10}, 0},
                        {new int[]{3, 2, 3, 4}, 10}
                });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testLargestPerimeter() {
        assertEquals(expectedResult, solution.largestPerimeter(nums));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

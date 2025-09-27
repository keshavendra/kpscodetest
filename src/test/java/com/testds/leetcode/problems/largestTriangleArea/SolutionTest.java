package com.testds.leetcode.problems.largestTriangleArea;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameterized.Parameter
    public int[][] points;

    @Parameterized.Parameter(1)
    public double expectedResult;

    @Parameters(name = "Test LargestTriangleArea - {index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}, 2.0},
                {new int[][]{{1, 0}, {0, 0}, {0, 1}}, 0.5},
                {new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}}, 0.0} // All collinear points
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
    public void testLargestTriangleArea() {
        double actualResult = solution.largestTriangleArea(points);
        Assert.assertEquals(expectedResult, actualResult, 0.00001); // Delta for floating-point comparison
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

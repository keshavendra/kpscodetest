package com.testds.leetcode.problems.maxAreaOfLongestDiagonalRectangle;

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
    public int[][] dimensions;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{9, 3}, {8, 6}}, 48},
                        {new int[][]{{3, 4}, {4, 3}}, 12}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testMaxAreaOfLongestDiagonalRectangle() {
        assertEquals(expectedResult, solution.areaOfMaxDiagonal(dimensions));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

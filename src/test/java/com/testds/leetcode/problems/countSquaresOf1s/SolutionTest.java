package com.testds.leetcode.problems.countSquaresOf1s;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public int[][] matrix;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}}, 15},
                        {new int[][]{{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}, 7}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCountSquaresOf1s() {
        int actualResult = solution.countSquares(matrix);
        assertEquals(expectedResult, actualResult);
    }

}

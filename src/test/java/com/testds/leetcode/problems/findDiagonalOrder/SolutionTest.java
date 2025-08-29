package com.testds.leetcode.problems.findDiagonalOrder;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameterized.Parameter
    public int[][] matrix;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}},
                        {new int[][]{{1, 2}, {3, 4}}, new int[]{1, 2, 3, 4}}
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
    public void testFindDiagonalOrder() {
        Assert.assertArrayEquals(expectedResult,
                solution.findDiagonalOrder(matrix));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

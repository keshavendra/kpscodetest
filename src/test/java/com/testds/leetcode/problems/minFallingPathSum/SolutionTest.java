package com.testds.leetcode.problems.minFallingPathSum;

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
    public int[][] matrix;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}, 13},
                        {new int[][]{{-19, 57}, {-40, -5}}, -59},
                        {new int[][]{{-48}}, -48}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinFallingPathSum() {
        int actualResult = solution.minFallingPathSum(matrix);
        assertEquals(expectedResult, actualResult);
    }

}

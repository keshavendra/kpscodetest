package com.testds.leetcode.problems.diff1s0sInRowNCol;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[][] grid;

    @Parameterized.Parameter(1)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}},
                                new int[][]{{0, 0, 4}, {0, 0, 4}, {-2, -2, 2}}
                        },
                        {
                                new int[][]{{1, 1, 1}, {1, 1, 1}},
                                new int[][]{{5, 5, 5}, {5, 5, 5}}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDiff1s0sInRowNCol() {
        int[][] actualResult = solution.onesMinusZeros(grid);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

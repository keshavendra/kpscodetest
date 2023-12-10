package com.testds.leetcode.problems.transposeMatrix;

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
    public int[][] matrix;

    @Parameterized.Parameter(1)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}},
                        {new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{1, 4}, {2, 5}, {3, 6}}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testTransposeMatrix() {
        int[][] actualResult = solution.transpose(matrix);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

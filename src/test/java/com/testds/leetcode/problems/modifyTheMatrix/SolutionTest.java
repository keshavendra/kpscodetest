package com.testds.leetcode.problems.modifyTheMatrix;

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
                        {new int[][]{{1, 2, -1}, {4, -1, 6}, {7, 8, 9}}, new int[][]{{1, 2, 9}, {4, 8, 6}, {7, 8, 9}}},
                        {new int[][]{{3, -1}, {5, 2}}, new int[][]{{3, 2}, {5, 2}}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testModifyTheMatrix() {
        int[][] actualResult = solution.modifiedMatrix(matrix);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

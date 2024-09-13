package com.testds.leetcode.problems.xorQueries;

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
    public int[] arr;

    @Parameterized.Parameter(1)
    public int[][] queries;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new int[]{1, 3, 4, 8},
                                new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}},
                                new int[]{2, 7, 14, 8}
                        },
                        {
                                new int[]{4, 8, 2, 10},
                                new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}},
                                new int[]{8, 0, 4, 4}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testXorQueries() {
        int[] actualResult = solution.xorQueries(arr, queries);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

package com.testds.leetcode.problems.largestSubmatrixWithRearrangements;

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
                        {new int[][]{{0, 0, 1}, {1, 1, 1}, {1, 0, 1}}, 4},
                        {new int[][]{{1, 0, 1, 0, 1}}, 3},
                        {new int[][]{{1, 1, 0}, {1, 0, 1}}, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLargestSubmatrixWithRearrangements() {
        int actualResult = solution.largestSubmatrix(matrix);
        assert expectedResult == actualResult;
    }

}

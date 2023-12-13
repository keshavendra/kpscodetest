package com.testds.leetcode.problems.specialPositionInBinaryMatrix;

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
    public int[][] mat;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}, 1},
                        {new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, 3}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSpecialPositionInBinaryMatrix() {
        int actualResult = solution.numSpecial(mat);
        assertEquals(expectedResult, actualResult);
    }

}

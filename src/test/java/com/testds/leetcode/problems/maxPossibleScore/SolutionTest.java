package com.testds.leetcode.problems.maxPossibleScore;

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
    public int[] start;

    @Parameterized.Parameter(1)
    public int d;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{6, 0, 3}, 2, 4},
                        {new int[]{2, 6, 13, 13}, 5, 5},
                        {new int[]{1000000000, 1000000000}, 1000000000, 1000000000}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxPossibleScore() {
        int actualResult = solution.maxPossibleScore(start, d);
        assertEquals(expectedResult, actualResult);
    }

}

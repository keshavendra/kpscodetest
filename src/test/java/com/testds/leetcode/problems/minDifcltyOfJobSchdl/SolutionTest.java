package com.testds.leetcode.problems.minDifcltyOfJobSchdl;

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
    public int[] jobDifficulty;

    @Parameterized.Parameter(1)
    public int d;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{6, 5, 4, 3, 2, 1}, 2, 7},
                        {new int[]{9, 9, 9}, 4, -1},
                        {new int[]{1, 1, 1}, 3, 3}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinDifcltyOfJobSchdl() {
        int actualResult = solution.minDifficulty(jobDifficulty, d);
        assertEquals(expectedResult, actualResult);
    }

}

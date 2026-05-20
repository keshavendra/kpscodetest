package com.testds.leetcode.problems.minMovesToMakeArrayComplementary;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int limit;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 3}, 4, 1},
                {new int[]{1, 2, 2, 1}, 2, 2},
                {new int[]{1, 2, 1, 2}, 2, 0},
                {new int[]{1, 2, 1, 1, 2, 1}, 2, 2},
                {new int[]{1, 2, 1, 1, 2, 1}, 3, 2},
                {new int[]{28, 50, 76, 80, 64, 30, 32, 84, 53, 8}, 84, 4},
                {new int[]{2, 7, 11, 48, 29, 5, 12, 4, 27, 55, 57, 33, 45, 49, 33, 32, 26, 29, 39, 4, 13, 24, 48, 47, 3, 24, 56, 57, 28, 50, 4, 8, 34, 46, 44, 47, 44, 27, 56, 30, 16, 20, 34, 35, 57, 57, 17, 9, 25, 16, 28, 44}, 57, 24}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void minMovesToMakeArrayComplementary() {
        int actualResult = solution.minMoves(nums, limit);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

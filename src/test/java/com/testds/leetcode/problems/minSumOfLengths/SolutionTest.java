package com.testds.leetcode.problems.minSumOfLengths;

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
    public int[] arr;

    @Parameterized.Parameter(1)
    public int target;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{3, 2, 2, 4, 3}, 3, 2},
                        {new int[]{7, 3, 4, 7}, 7, 2},
                        {new int[]{1, 2, 3, 3, 6}, 6, 3},
                        {new int[]{1, 1, 1, 2, 2, 2, 4, 4}, 6, 6},
                        {new int[]{4, 3, 2, 6, 2, 3, 4}, 6, -1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testMinSumOfLengths() {
        int actualResult = solution.minSumOfLengths(arr, target);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

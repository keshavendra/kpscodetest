package com.testds.leetcode.problems.firstCompleteIndex;

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
    public int[][] mat;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 3, 4, 2}, new int[][]{{1, 4}, {2, 3}}, 2},
                        {new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9}, new int[][]{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}}, 3}
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
    public void testFirstCompleteIndex() {
        int actualResult = solution.firstCompleteIndex(arr, mat);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

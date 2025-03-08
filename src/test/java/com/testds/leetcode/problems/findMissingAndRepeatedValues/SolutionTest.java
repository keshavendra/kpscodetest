package com.testds.leetcode.problems.findMissingAndRepeatedValues;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[][] grid;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 3}, {2, 2}}, new int[]{2, 4}},
                        {new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}, new int[]{9, 5}}
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
    public void testFindMissingAndRepeatedValues() {
        int[] result = solution.findMissingAndRepeatedValues(grid);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

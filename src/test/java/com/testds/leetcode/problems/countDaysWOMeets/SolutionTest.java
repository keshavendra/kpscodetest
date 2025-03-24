package com.testds.leetcode.problems.countDaysWOMeets;

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
    public int days;

    @Parameterized.Parameter(1)
    public int[][] meetings;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {10, new int[][]{{5, 7}, {1, 3}, {9, 10}}, 2},
                        {5, new int[][]{{2, 4}, {1, 3}}, 1},
                        {6, new int[][]{{1, 6}}, 0},
                        {57, new int[][]{{3, 49}, {23, 44}, {21, 56}, {26, 55}, {23, 52}, {2, 9}, {1, 48}, {3, 31}}, 1}
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
    public void testCountDays() {
        Assert.assertEquals(expectedResult, solution.countDays(days, meetings));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

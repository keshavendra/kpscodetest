package com.testds.leetcode.problems.removeCoveredIntervals;

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
    public int[][] intervals;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{1, 4}, {3, 6}, {2, 8}}, 2},
                {new int[][]{{1, 4}, {2, 3}}, 1},
                {new int[][]{{3, 10}, {4, 10}, {5, 11}}, 2},
                {new int[][]{{1, 2}, {1, 4}, {3, 4}}, 1}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testRemoveCoveredIntervals() {
        assertEquals(expectedResult, solution.removeCoveredIntervals(intervals));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

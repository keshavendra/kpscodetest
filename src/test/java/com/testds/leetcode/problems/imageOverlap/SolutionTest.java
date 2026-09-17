package com.testds.leetcode.problems.imageOverlap;

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
    public int[][] img1;

    @Parameterized.Parameter(1)
    public int[][] img2;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}}, new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}}, 3},
                {new int[][]{{1}}, new int[][]{{1}}, 1},
                {new int[][]{{0}}, new int[][]{{0}}, 0}
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
    public void testLargestOverlap() {
        assertEquals(expectedResult, solution.largestOverlap(img1, img2));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.maxAvgPassRatio;

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
    public int[][] classes;

    @Parameterized.Parameter(1)
    public int extraStudents;

    @Parameterized.Parameter(2)
    public double expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 2}, {3, 5}, {2, 2}}, 2, 0.78333},
                        {new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}}, 4, 0.53485}
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
    public void testMaxAverageRatio() {
        double actualResult = solution.maxAverageRatio(classes, extraStudents);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

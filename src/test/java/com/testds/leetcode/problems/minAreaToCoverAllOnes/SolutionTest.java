package com.testds.leetcode.problems.minAreaToCoverAllOnes;

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
    public int[][] grid;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters(name = "Test MinimumArea with grid {0} , and expectedResult {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{0, 1, 0}, {1, 0, 1}}, 6},
                        {new int[][]{{1, 0}, {0, 0}}, 1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void test() {
        assertEquals(expectedResult, solution.minimumArea(grid));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

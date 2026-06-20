package com.testds.leetcode.problems.maxBuilding;

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
    public int n;

    @Parameterized.Parameter(1)
    public int[][] restrictions;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, new int[][]{{2, 1}, {4, 1}}, 2},
                {6, new int[][]{}, 5},
                {10, new int[][]{{5, 3}, {2, 5}, {7, 4}, {10, 3}}, 5}
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
    public void testMaxBuilding() {
        assertEquals(expectedResult, solution.maxBuilding(n, restrictions));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

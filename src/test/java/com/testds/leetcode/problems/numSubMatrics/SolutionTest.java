package com.testds.leetcode.problems.numSubMatrics;

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
    public int[][] mat;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}, 13},
                        {new int[][]{{0, 1, 1, 0}, {0, 1, 1, 1}, {1, 1, 1, 0}}, 24}
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
    public void testNumSubmat() {
        assertEquals(expectedResult, solution.numSubmat(mat));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

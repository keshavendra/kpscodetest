package com.testds.leetcode.problems.minScoreTriangulation;

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
    public int[] values;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3}, 6},
                        {new int[]{3, 7, 4, 5}, 144},
                        {new int[]{1, 3, 1, 4, 1, 5}, 13},
                        {new int[]{2, 1, 4, 4}, 24}
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
    public void testMinScoreTriangulation() {
        assertEquals(expectedResult, solution.minScoreTriangulation(values));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

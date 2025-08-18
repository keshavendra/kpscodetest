package com.testds.leetcode.problems.newGame21;

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
    public int k;

    @Parameterized.Parameter(2)
    public int maxPts;

    @Parameterized.Parameter(3)
    public double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {10, 1, 10, 1.00000},
                        {6, 1, 10, 0.60000},
                        {21, 17, 10, 0.73278},
                        {2, 2, 2, 0.75},
                        {1000, 1000, 500, 0.0039},
                        {9811, 8776, 1096, 0.99696}
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
    public void testNewGame21() {
        double actual = solution.new21Game(n, k, maxPts);
        assertEquals(expected, actual, 0.0001);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

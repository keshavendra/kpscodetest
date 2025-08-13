package com.testds.leetcode.problems.waysToExpressAnIntegerAsSumOfPowers;

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
    public int x;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {10, 2, 1},
                        {4, 1, 2},
                        {103, 1, 570078},
                        {0, -1, 1}
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
    public void testNumberOfWays() {
        assertEquals(expectedResult, solution.numberOfWays(n, x));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

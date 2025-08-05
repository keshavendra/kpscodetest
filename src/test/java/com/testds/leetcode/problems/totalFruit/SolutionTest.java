package com.testds.leetcode.problems.totalFruit;

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
    public int[] fruits;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 1}, 3},
                        {new int[]{0, 1, 2, 2}, 3},
                        {new int[]{1, 2, 3, 2, 2}, 4},
                        {new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}, 5},
                        {new int[]{1, 0, 3, 4, 3}, 3},
                        {new int[]{0, 1, 1, 4, 3}, 3}
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
    public void testTotalFruit() {
        assertEquals(expectedResult, solution.totalFruit(fruits));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

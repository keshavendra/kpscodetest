package com.testds.leetcode.problems.countOddNumbersInAnInterval;

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
    public int low;

    @Parameterized.Parameter(1)
    public int high;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {3, 7, 3},
                        {8, 10, 1},
                        {8, 9, 1},
                        {7, 8, 1}
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
    public void countOddNumbers() {
        assertEquals(expectedResult, solution.countOdds(low, high));
    }

    @After
    public void tearDown() {
        solution = null;
    }


}

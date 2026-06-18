package com.testds.leetcode.problems.calculateAngleBetweenHands;

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
    public int hour;

    @Parameterized.Parameter(1)
    public int minute;

    @Parameterized.Parameter(2)
    public double expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {12, 30, 165},
                        {3, 30, 75},
                        {3, 15, 7.5}
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
    public void testCalculateAngle() {
        assertEquals(expectedResult, solution.angleClock(hour, minute));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

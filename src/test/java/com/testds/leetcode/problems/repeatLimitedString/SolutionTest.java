package com.testds.leetcode.problems.repeatLimitedString;

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
    public String s;

    @Parameterized.Parameter(1)
    public int repeatLimit;

    @Parameterized.Parameter(2)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"cczazcc", 3, "zzcccac"},
                        {"aababab", 2, "bbabaa"}
                }
        );
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRepeatLimitedString() {
        String actualResult = solution.repeatLimitedString(s, repeatLimit);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }


}

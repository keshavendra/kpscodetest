package com.testds.leetcode.problems.fractionToDecimal;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameter
    public int numerator;

    @Parameter(1)
    public int denominator;

    @Parameter(2)
    public String expectedResult;

    private Solution solution;

    @Parameters(name = "{index}: fractionToDecimal({0}, {1}) = \"{2}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, "0.5"},
                {2, 1, "2"},
                {4, 333, "0.(012)"},
                {1, 6, "0.1(6)"},
                {-1, 2, "-0.5"},
                {1, -2, "-0.5"},
                {-1, -2, "0.5"},
                {-1, -2147483648, "0.0000000004656612873077392578125"}
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
    public void testFractionToDecimal() {
        String actualResult = solution.fractionToDecimal(numerator, denominator);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
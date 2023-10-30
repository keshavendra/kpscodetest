package com.testds.leetcode.problems.divide;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int dividend;

    @Parameterized.Parameter(1)
    public int divisor;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, 3, 3},
                {7, -3, -2},
                {-2147483648, 2, -1073741824},
                {-1010369383, -2147483648, 0},
                {-2147483648, 122481295, -17}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDivide() {
        int actualResult = solution.divide(dividend, divisor);
        assert expectedResult == actualResult;
    }

}

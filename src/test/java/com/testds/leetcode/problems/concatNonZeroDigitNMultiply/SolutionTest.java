package com.testds.leetcode.problems.concatNonZeroDigitNMultiply;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
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
    public int[][] queries;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"10203004", new int[][]{{0, 7}, {1, 3}, {4, 6}}, new int[]{12340, 4, 9}},
                {"10203004", new int[][]{{1, 3}}, new int[]{4}},
                {"10203404", new int[][]{{4, 6}}, new int[]{238}},
                {"1000", new int[][]{{0, 3}, {1, 1}}, new int[]{1, 0}},
                {"9876543210", new int[][]{{0, 9}}, new int[]{444444137}},
                {"2711785625", new int[][]{{0, 9}}, new int[]{318566667}}
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
    public void testSumAndMultiply() {
        int[] actualResult = solution.sumAndMultiply(s, queries);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

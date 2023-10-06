package com.testds.leetcode.problems.integerBreak;

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
    public int n;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {1, 1},
                        {10, 36}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIntegerBreak() {
        int actualResult = solution.integerBreak(n);
        assert expectedResult == actualResult;
    }

    @org.junit.Test
    public void testIntegerBreak1() {
        int actualResult = solution.integerBreak1(n);
        assert expectedResult == actualResult;
    }

}

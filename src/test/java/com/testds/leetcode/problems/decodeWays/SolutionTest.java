package com.testds.leetcode.problems.decodeWays;

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
    public String s;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12", 2},
                        {"226", 3},
                        {"06", 0},
                        {"1201234", 3}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDecodeWays() {
        int actualResult = solution.numDecodings(s);
        assertEquals(expectedResult, actualResult);
    }

}

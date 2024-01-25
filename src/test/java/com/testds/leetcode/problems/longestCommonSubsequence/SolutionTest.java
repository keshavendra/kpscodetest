package com.testds.leetcode.problems.longestCommonSubsequence;

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
    public String text1;

    @Parameterized.Parameter(1)
    public String text2;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"abcde", "ace", 3},
                        {"abc", "abc", 3},
                        {"abc", "def", 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLongestCommonSubsequence() {
        int actualResult = solution.longestCommonSubsequence(text1, text2);
        assertEquals(expectedResult, actualResult);
    }

}

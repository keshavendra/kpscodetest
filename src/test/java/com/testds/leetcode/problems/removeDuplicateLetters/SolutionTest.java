package com.testds.leetcode.problems.removeDuplicateLetters;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public String s;

    @Parameterized.Parameter(1)
    public String expectedSubsequence;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"bcabc", "abc"},
                        {"cbacdcbc", "acdb"},
                        {"abacb", "abc"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRemoveDuplicateLetters() {
        String actualSubsequence = solution.removeDuplicateLetters(s);
        Assert.assertEquals(expectedSubsequence, actualSubsequence);
    }

}

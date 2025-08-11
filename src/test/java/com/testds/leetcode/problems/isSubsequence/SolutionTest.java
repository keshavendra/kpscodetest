package com.testds.leetcode.problems.isSubsequence;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public String s;

    @Parameterized.Parameter(1)
    public String t;

    @Parameterized.Parameter(2)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"", "abc", true},
                        {"a", "abc", true},
                        {"d", "abc", false},
                        {"ab", "ahbgdc", true},
                        {"axc", "ahbgdc", false},
                        {"abcd", "abc", false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @org.junit.Test
    public void testIsSubsequence() {
        boolean actual = solution.isSubsequence(s, t);
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.longestSubsequenceInBinaryString;

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
    public int k;

    @Parameterized.Parameter(2)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"1001010", 5, 5},
                        {"00101001", 1, 6}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @org.junit.Test
    public void testLongestSubsequence() {
        assertEquals(expected, solution.longestSubsequence(s, k));
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

}

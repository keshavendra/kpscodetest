package com.testds.leetcode.problems.longestDiverseString;

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

    @Parameterized.Parameter
    public int a;

    @Parameterized.Parameter(1)
    public int b;

    @Parameterized.Parameter(2)
    public int c;

    @Parameterized.Parameter(3)
    public String possibleResult;

    private Solution solution;

    @Before
    public void setup() throws Exception {
        solution = new Solution();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {1, 1, 7, "ccaccbcc"},
                        {7, 1, 0, "aabaa"},
                        {0, 8, 11, "ccbccbcbcbcbcbcbcbc"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLongestDiverseString() {
        String actualResult = solution.longestDiverseString(a, b, c);
        assertNotNull(actualResult);
        assertEquals(possibleResult.length(), actualResult.length());
        assertTrue(validate(actualResult));
    }

    public boolean validate(String actualResult) {
        return !actualResult.contains("aaa") &&
                !actualResult.contains("bbb") &&
                !actualResult.contains("ccc") &&
                count('a', actualResult) <= a &&
                count('b', actualResult) <= b &&
                count('c', actualResult) <= c;
    }

    public int count(char ch, String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    @After
    public void cleanup() {
        solution = null;
    }

}

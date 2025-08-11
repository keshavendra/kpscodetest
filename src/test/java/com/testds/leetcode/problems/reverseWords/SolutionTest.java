package com.testds.leetcode.problems.reverseWords;

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
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"the sky is blue", "blue is sky the"},
                        {"  hello world  ", "world hello"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testReverseWords() {
        String actualResult = solution.reverseWords(s);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

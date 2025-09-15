package com.testds.leetcode.problems.canBeTypedWords;

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
    public String text;

    @Parameterized.Parameter(1)
    public String brokenLetters;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"leet code", "lt", 1},
                        {"hello world", "ad", 1},
                        {"leet code", "e", 0}
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
    public void testCanBeTyped() {
        assertEquals(expectedResult, solution.canBeTypedWords(text, brokenLetters));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

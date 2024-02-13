package com.testds.leetcode.problems.firstPalindrome;

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
    public String[] words;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new String[]{"abc", "car", "ada", "racecar", "cool"}, "ada"},
                        {new String[]{"notapalindrome", "racecar"}, "racecar"},
                        {new String[]{"def", "ghi"}, ""}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFirstPalindrome() {
        String actualResult = solution.firstPalindrome(words);
        assertEquals(expectedResult, actualResult);
    }

}

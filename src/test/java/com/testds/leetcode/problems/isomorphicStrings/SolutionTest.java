package com.testds.leetcode.problems.isomorphicStrings;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    @Parameterized.Parameter
    public String sourceString;
    @Parameterized.Parameter(1)
    public String targetString;
    @Parameterized.Parameter(2)
    public boolean expectedIsIsomorphicResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"egg", "add", true},
                {"foo", "bar", false},
                {"paper", "title", true},
                {"badc", "baba", false},
                {"13", "42", true}
        });
    }

    public static final Solution solution = new Solution();

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIsomorphicStrings() {
        boolean actualIsIsomorphicResult = solution.isIsomorphic(sourceString, targetString);
        assertEquals(expectedIsIsomorphicResult, actualIsIsomorphicResult);
    }

}

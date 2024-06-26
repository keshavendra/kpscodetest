package com.testds.leetcode.problems.appendCharsToStrToMkSubseq;

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
    public String t;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"coaching", "coding", 4},
                        {"abcde", "a", 0},
                        {"z", "abcde", 5}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testAppendCharacters() {
        int actualResult = solution.appendCharacters(s, t);
        assertEquals(expectedResult, actualResult);
    }

}

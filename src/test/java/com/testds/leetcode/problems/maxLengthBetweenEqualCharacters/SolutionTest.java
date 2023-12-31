package com.testds.leetcode.problems.maxLengthBetweenEqualCharacters;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"aa", 0},
                        {"abca", 2},
                        {"cbzxy", -1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxLengthBetweenEqualCharacters() {
        int actualResult = solution.maxLengthBetweenEqualCharacters(s);
        assertEquals(expectedResult, actualResult);
    }

}

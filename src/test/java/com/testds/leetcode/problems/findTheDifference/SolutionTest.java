package com.testds.leetcode.problems.findTheDifference;

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
    public char expectedChar;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"abcd", "abcde", 'e'},
                        {"", "y", 'y'}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindTheDifference() {
        char actualResult = solution.findTheDifference(s, t);
        assert expectedChar == actualResult;
    }

}

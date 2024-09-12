package com.testds.leetcode.problems.countConsistentStrings;

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
    public String allowed;

    @Parameterized.Parameter(1)
    public String[] words;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}, 2},
                        {"abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}, 7},
                        {"cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}, 4}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCountConsistentStrings() {
        int actualResult = solution.countConsistentStrings(allowed, words);
        assertEquals(expectedResult, actualResult);
    }

}

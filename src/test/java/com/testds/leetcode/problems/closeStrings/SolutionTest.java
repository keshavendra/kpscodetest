package com.testds.leetcode.problems.closeStrings;

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
    public String word1;

    @Parameterized.Parameter(1)
    public String word2;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"abc", "bca", true},
                        {"a", "aa", false},
                        {"cabbba", "abbccc", true},
                        {"cabbba", "aabbss", false},
                        {"abbzzca", "babzzcz", false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCloseStrings() {
        boolean actualResult = solution.closeStrings(word1, word2);
        assertEquals(expectedResult, actualResult);
    }

}

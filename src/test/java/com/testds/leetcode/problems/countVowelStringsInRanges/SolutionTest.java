package com.testds.leetcode.problems.countVowelStringsInRanges;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    Solution solution;

    @Parameterized.Parameter
    public String[] words;

    @Parameterized.Parameter(1)
    public int[][] queries;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"aba", "bcb", "ece", "aa", "e"},
                                new int[][]{{0, 2}, {1, 4}, {1, 1}},
                                new int[]{2, 3, 0}
                        },
                        {
                                new String[]{"a", "e", "i"},
                                new int[][]{{0, 2}, {0, 1}, {2, 2}},
                                new int[]{3, 2, 1}
                        }
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
    public void testCountVowelStringsInRanges() {
        int[] actualResult = solution.vowelStrings(words, queries);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }


}

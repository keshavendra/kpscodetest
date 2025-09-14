package com.testds.leetcode.problems.vowelSpellChecker;

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

    private Solution solution;

    @Parameterized.Parameter
    public String[] wordList;

    @Parameterized.Parameter(1)
    public String[] queries;

    @Parameterized.Parameter(2)
    public String[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"KiTe", "kite", "hare", "Hare"},
                                new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"},
                                new String[]{"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"}
                        },
                        {
                                new String[]{"KiTe", "kite", "hare", "Hare"},
                                new String[]{"keto"},
                                new String[]{"KiTe"}
                        },
                        {
                                new String[]{"yellow"},
                                new String[]{"YellOw"},
                                new String[]{"yellow"}
                        },
                        {
                                new String[]{"YellOw"},
                                new String[]{"yeellow"},
                                new String[]{""}
                        },
                        {
                                new String[]{"YellOw"},
                                new String[]{"yllw"},
                                new String[]{""}
                        },
                        {
                                new String[]{"ae", "aa"},
                                new String[]{"UU"},
                                new String[]{"ae"}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testVowelSpellChecker() {
        String[] actualResult = solution.spellchecker(wordList, queries);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

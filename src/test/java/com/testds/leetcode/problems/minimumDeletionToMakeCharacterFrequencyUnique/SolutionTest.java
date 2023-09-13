package com.testds.leetcode.problems.minimumDeletionToMakeCharacterFrequencyUnique;

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
        return Arrays.asList(new Object[][]{
                {"aab", 0},
                {"aaabbbcc", 2},
                {"ceabaacb", 2},
                {"abcabc", 3},
                {"bbcebab", 2}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinimumDeletion() {
        int actualResult = solution.minDeletions(s);
        assert expectedResult == actualResult;
    }

}

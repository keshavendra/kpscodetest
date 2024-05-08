package com.testds.leetcode.problems.findRelativeRanks;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] score;

    @Parameterized.Parameter(1)
    public String[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{5, 4, 3, 2, 1}, new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}},
                        {new int[]{10, 3, 8, 9, 4}, new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindRelativeRanks() {
        String[] actualResult = solution.findRelativeRanks(score);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

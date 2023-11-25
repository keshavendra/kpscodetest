package com.testds.leetcode.problems.getSumAbsoluteDifferences;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 3, 5}, new int[]{4, 3, 5}},
                        {new int[]{1, 4, 6, 8, 10}, new int[]{24, 15, 13, 15, 21}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testGetSumAbsoluteDifferences() {
        int[] actualResult = solution.getSumAbsoluteDifferences(nums);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

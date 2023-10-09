package com.testds.leetcode.problems.searchRange;

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
    public int target;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}},
                        {new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1}},
                        {new int[]{}, 0, new int[]{-1, -1}},
                        {new int[]{1}, 1, new int[]{0, 0}},
                        {new int[]{2, 2}, 3, new int[]{-1, -1}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSearchRange() {
        int[] actualResult = solution.searchRange(nums, target);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

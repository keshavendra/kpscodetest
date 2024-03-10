package com.testds.leetcode.problems.intersectionOfArrays;

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
    public int[] nums1;

    @Parameterized.Parameter(1)
    public int[] nums2;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2}},
                        {new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIntersectionOfArrays() {
        int[] actualResult = solution.intersection(nums1, nums2);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

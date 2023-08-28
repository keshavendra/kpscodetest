package com.test.leetcode.problems.twosum;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;

public class SolutionTest extends TestCase {

    private Solution solution;

    public SolutionTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    public void setUp() throws Exception {
        solution = new Solution();
    }

    public void testTwoSum() {
        int[] nums = new int[]{1, 5, 2, 6};
        int target = 11;
        int[] expectedResult = new int[]{1, 3};
        Assert.assertTrue(Arrays.equals(expectedResult, solution.twoSum(nums, target)));
    }
}

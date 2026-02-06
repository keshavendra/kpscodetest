//https://leetcode.com/problems/transformed-array/
package com.testds.leetcode.problems.transformedArray;

public class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[((nums[i] % nums.length) + i + nums.length) % nums.length];
        }
        return result;
    }
}

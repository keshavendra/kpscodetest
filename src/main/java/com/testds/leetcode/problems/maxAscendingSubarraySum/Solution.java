//https://leetcode.com/problems/maximum-ascending-subarray-sum/
package com.testds.leetcode.problems.maxAscendingSubarraySum;

public class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0], ascendingSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                ascendingSum += nums[i];
            } else {
                if (maxSum < ascendingSum) {
                    maxSum = ascendingSum;
                }
                ascendingSum = nums[i];
            }
        }
        if (maxSum < ascendingSum) {
            maxSum = ascendingSum;
        }
        return maxSum;
    }
}

//https://leetcode.com/problems/longest-increasing-subsequence
package com.testds.leetcode.problems.lengthOfLIS;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lengthOfLIS = new int[nums.length];
        int grandMaxLength = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int max = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j] && max < 1 + lengthOfLIS[j]) {
                    max = 1 + lengthOfLIS[j];
                }
            }
            lengthOfLIS[i] = max;
            if (max > grandMaxLength)
                grandMaxLength = max;
        }
        return grandMaxLength;
    }
}

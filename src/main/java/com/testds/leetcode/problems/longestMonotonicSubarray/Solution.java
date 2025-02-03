//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
package com.testds.leetcode.problems.longestMonotonicSubarray;

public class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increment = 1, decrement = 1, max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                decrement++;
                increment = 1;
            } else if (nums[i] < nums[i + 1]) {
                decrement = 1;
                increment++;
            } else {
                increment = 1;
                decrement = 1;
            }
            if (increment > max) {
                max = increment;
            } else if (decrement > max) {
                max = decrement;
            }
        }
        return max;
    }
}

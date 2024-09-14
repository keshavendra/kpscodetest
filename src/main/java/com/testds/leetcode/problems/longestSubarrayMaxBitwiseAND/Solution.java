//https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/
package com.testds.leetcode.problems.longestSubarrayMaxBitwiseAND;

public class Solution {
    public int longestSubarray(int[] nums) {
        int res = 1, max = nums[0], len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                if (nums[i - 1] == max) {
                    if (len > res) res = len;
                } else if (nums[i - 1] > max) {
                    res = len;
                    max = nums[i - 1];
                }
                len = 1;
            } else {
                len++;
            }
        }
        if (nums[nums.length - 1] > max) res = len;
        if (nums[nums.length - 1] == max) res = Math.max(res, len);
        return res;
    }
}

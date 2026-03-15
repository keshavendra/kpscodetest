//https://leetcode.com/problems/subarray-sum-equals-k/
package com.testds.leetcode.problems.subarraySumEqualsK;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == 0) {
                    if (nums[j] == k)
                        count++;
                } else {
                    if (nums[j] - nums[i - 1] == k)
                        count++;
                }
            }
        }
        return count;
    }
}

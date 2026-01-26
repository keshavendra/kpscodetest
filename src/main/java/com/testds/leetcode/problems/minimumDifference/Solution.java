//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
package com.testds.leetcode.problems.minimumDifference;

import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1)
            return 0;
        k--;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE, diff;
        for (int i = k; i < nums.length; i++) {
            diff = nums[i] - nums[i - k];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}

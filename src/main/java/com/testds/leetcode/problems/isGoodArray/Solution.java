//https://leetcode.com/problems/check-if-array-is-good/
package com.testds.leetcode.problems.isGoodArray;

import java.util.Arrays;

public class Solution {

    public boolean isGood(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        Arrays.sort(nums);
        int expectedMax = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return nums[nums.length - 1] == expectedMax
                && nums[nums.length - 2] == expectedMax;
    }
}

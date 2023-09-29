//https://leetcode.com/problems/monotonic-array/
package com.testds.leetcode.problems.monotonicArray;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2)
            return true;
        boolean isIncreasing = false;
        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                isIncreasing = nums[i] > nums[i - 1];
                break;
            }
        }
        if (i >= nums.length - 1)
            return true;

        for (; i < nums.length; i++) {
            if (isIncreasing) {
                if (nums[i] < nums[i - 1])
                    return false;
            } else {
                if (nums[i] > nums[i - 1])
                    return false;
            }
        }
        return true;
    }
}

//https://leetcode.com/problems/smallest-range-i/
package com.testds.leetcode.problems.smallestRange1;

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        return Math.max((max - min - (2 * k)), 0);
    }
}

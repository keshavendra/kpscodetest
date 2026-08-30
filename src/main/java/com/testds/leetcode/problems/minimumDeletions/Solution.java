//https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
package com.testds.leetcode.problems.minimumDeletions;

public class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0, max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[min] <= nums[i]) {
                min = i;
            }
            if (nums[max] > nums[i]) {
                max = i;
            }
        }
        if (min > max) {
            min ^= max;
            max ^= min;
            min ^= max;
        }
        return Math.min(max + 1,
                Math.min(nums.length - min,
                        min + 1 + (nums.length - max)));
    }
}

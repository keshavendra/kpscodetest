//https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/
package com.testds.leetcode.problems.minOperationsToMakeAll1sInBinaryArray;

public class Solution {
    public int minOperations(int[] nums) {
        int totalFlip = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) {
                totalFlip++;
                nums[i] = 1;
                nums[i + 1] = (nums[i + 1] + 1) % 2;
                nums[i + 2] = (nums[i + 2] + 1) % 2;
            }
        }
        if (nums[nums.length - 1] == 1 && nums[nums.length - 2] == 1) {
            return totalFlip;
        }
        return -1;
    }
}

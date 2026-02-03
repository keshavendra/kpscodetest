//https://leetcode.com/problems/trionic-array-i/
package com.testds.leetcode.problems.trionicArray1;

public class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums == null || nums.length < 4) {
            return false;
        }
        int index = 1;

        while (index < nums.length - 1 && nums[index] > nums[index - 1]) {
            index++;
        }
        if (index == nums.length - 1 || index == 1 || nums[index] == nums[index - 1]) {
            return false;
        }

        while (index < nums.length - 1 && nums[index] < nums[index - 1]) {
            index++;
        }

        if (nums[index] == nums[index - 1]) {
            return false;
        }

        while (index < nums.length - 1 && nums[index] > nums[index - 1]) {
            index++;
        }
        return index == nums.length - 1 && nums[index] > nums[index - 1];
    }
}

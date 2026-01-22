//https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/
package com.testds.leetcode.problems.minimumPairRemoval;


public class Solution {
    public int minimumPairRemoval(int[] nums) {
        int numOfOperations = 0, lastIndex = nums.length - 1;
        while (checkAndAdjustArray(nums, lastIndex)) {
            lastIndex--;
            numOfOperations++;
        }
        return numOfOperations;
    }

    private boolean checkAndAdjustArray(int[] nums, int lastIndex) {
        boolean required = false;
        int min = Integer.MAX_VALUE, index = lastIndex;
        for (int i = lastIndex; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                required = true;
            }
            if (min >= nums[i] + nums[i - 1]) {
                min = nums[i] + nums[i - 1];
                index = i;
            }
        }
        if (required) {
            nums[index - 1] += nums[index];
            for (; index < lastIndex; index++) {
                nums[index] = nums[index + 1];
            }
        }
        return required;
    }
}

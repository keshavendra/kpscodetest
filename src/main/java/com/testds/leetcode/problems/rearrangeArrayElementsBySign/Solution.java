//https://leetcode.com/problems/rearrange-array-elements-by-sign/
package com.testds.leetcode.problems.rearrangeArrayElementsBySign;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positiveIntegersArray = new int[nums.length / 2];
        int[] negativeIntegersArray = new int[nums.length / 2];
        int positiveArrayIndex = 0, negativeArrayIndex = 0;
        for (int num : nums) {
            if (num < 0)
                negativeIntegersArray[negativeArrayIndex++] = num;
            else
                positiveIntegersArray[positiveArrayIndex++] = num;
        }
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = positiveIntegersArray[i / 2];
            nums[i + 1] = negativeIntegersArray[i / 2];
        }
        return nums;
    }
}

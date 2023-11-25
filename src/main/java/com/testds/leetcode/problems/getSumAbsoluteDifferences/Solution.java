//https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
package com.testds.leetcode.problems.getSumAbsoluteDifferences;

public class Solution {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
            rightSum[nums.length - 1 - i] = rightSum[nums.length - i] + nums[nums.length - i];
        }
        for (int i = 0; i < nums.length; i++) {
            int rightArrayLength = nums.length - 1 - i;
            nums[i] = (i * nums[i] - leftSum[i]) + (rightSum[i] - rightArrayLength * nums[i]);
        }
        return nums;
    }

}

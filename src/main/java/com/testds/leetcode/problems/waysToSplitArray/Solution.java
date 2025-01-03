//https://leetcode.com/problems/number-of-ways-to-split-array/
package com.testds.leetcode.problems.waysToSplitArray;

import java.util.Arrays;

public class Solution {
    public int waysToSplitArray(int[] nums) {
        int prefixSum = Arrays.stream(nums).sum();
        int currentSum = 0, partition = 0, num;
        for (int i = 0; i < nums.length - 1; i++) {
            num = nums[i];
            currentSum += num;
            prefixSum -= num;
            if (currentSum >= prefixSum) {
                partition++;
            }
        }
        return partition;
    }
}

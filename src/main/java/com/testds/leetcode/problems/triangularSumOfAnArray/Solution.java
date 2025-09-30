//https://leetcode.com/problems/find-triangular-sum-of-an-array/
package com.testds.leetcode.problems.triangularSumOfAnArray;

public class Solution {
    public int triangularSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
        }
        return nums[0];
    }
}

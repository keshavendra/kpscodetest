//https://leetcode.com/problems/missing-number/
package com.testds.leetcode.problems.missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = ((long) n * (n + 1)) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return (int) sum;
    }
}

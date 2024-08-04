//https://leetcode.com/problems/range-sum-of-sorted-subarray-sums
package com.testds.leetcode.problems.rangeSumOfSortedSubarraySum;

import java.util.Arrays;

public class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int MODULO = 1_000_000_007;
        long sum;
        int i, j;
        int[] sumArray = new int[n * (n + 1) / 2];
        int sumArrayIndex = 0;
        for (i = 0; i < n; i++) {
            sum = nums[i];
            sumArray[sumArrayIndex++] = (int) sum;
            for (j = i + 1; j < n; j++) {
                sum += nums[j];
                sum %= MODULO;
                sumArray[sumArrayIndex++] = (int) sum;
            }
        }
        sum = 0;
        Arrays.sort(sumArray);
        for (i = left - 1; i < right; i++) {
            sum += sumArray[i];
            sum %= MODULO;
        }
        return (int) (sum % MODULO);
    }
}

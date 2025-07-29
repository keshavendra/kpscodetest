//https://leetcode.com/problems/smallest-subarrays-with-maximum-bitwise-or
package com.testds.leetcode.problems.smallestSubArraysWithMaxBitwiseOR;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] smallestSubarrays(int[] nums) {
        final int[] result = new int[nums.length];
        int[] setBits = new int[32];
        IntStream.range(0, nums.length)
                .map(index -> nums.length - index - 1)
                .forEach(index -> {
                    setTheBits(nums[index], setBits, index);
                    result[index] = findMaxDiffInArray(setBits, index);
                });
        return result;
    }

    private int findMaxDiffInArray(int[] setBits, int index) {
        return Arrays.stream(setBits)
                .filter(num -> num != 0)
                .max()
                .orElse(index) - index + 1;
    }

    private void setTheBits(int num, int[] setBits, int index) {
        IntStream.range(0, setBits.length)
                .filter(i -> ((1 << i) & num) != 0)
                .forEach(i -> setBits[i] = index);
    }
}

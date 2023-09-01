//https://leetcode.com/problems/counting-bits
package com.testds.leetcode.problems.countingBits;

public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = (i & 1) + result[i >> 1];
        }
        return result;
    }
}

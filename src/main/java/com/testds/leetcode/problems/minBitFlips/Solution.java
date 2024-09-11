//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
package com.testds.leetcode.problems.minBitFlips;

public class Solution {
    public int minBitFlips(int start, int goal) {
        int num = start ^ goal;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}

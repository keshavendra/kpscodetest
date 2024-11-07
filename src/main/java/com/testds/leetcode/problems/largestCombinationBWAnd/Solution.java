//https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/
package com.testds.leetcode.problems.largestCombinationBWAnd;

public class Solution {

    public int largestCombination(int[] candidates) {
        int[] bitCounts = new int[32];
        int max = 0;
        for (int candidate : candidates) {
            for (int i = 0; i < 32; i++) {
                if ((candidate & (1 << i)) != 0) {
                    bitCounts[i]++;
                    if (bitCounts[i] > max) max = bitCounts[i];
                }
            }
        }
        return max;
    }

}

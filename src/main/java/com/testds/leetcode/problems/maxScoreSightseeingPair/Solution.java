//https://leetcode.com/problems/best-sightseeing-pair/
package com.testds.leetcode.problems.maxScoreSightseeingPair;

public class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int previousMax = values[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < values.length; i++) {
            if (previousMax + values[i] - i > max) {
                max = previousMax + values[i] - i;
            }
            if (previousMax < values[i] + i) {
                previousMax = values[i] + i;
            }
        }
        return max;
    }
}

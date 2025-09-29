//https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
package com.testds.leetcode.problems.minScoreTriangulation;

public class Solution {
    public int minScoreTriangulation(int[] values) {
        Integer[][] dp = new Integer[values.length][values.length];
        return calculateMinTriangulation(values, 0, values.length - 1, dp);
    }

    private int calculateMinTriangulation(int[] values, int i, int j, Integer[][] dp) {
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (i + 1 == j) {
            dp[i][j] = 0;
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            min = Math.min(min, values[i] * values[j] * values[k]
                    + calculateMinTriangulation(values, i, k, dp)
                    + calculateMinTriangulation(values, k, j, dp));
        }
        dp[i][j] = min;
        return min;
    }
}

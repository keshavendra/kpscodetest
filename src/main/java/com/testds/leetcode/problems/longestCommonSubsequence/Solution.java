//https://leetcode.com/problems/longest-common-subsequence
package com.testds.leetcode.problems.longestCommonSubsequence;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        int rows = text1.length();
        int cols = text2.length();
        int maxLength = 0;

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (text1.charAt(row - 1) == text2.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1] + 1;
                } else {
                    dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]);
                }
                if (dp[row][col] > maxLength)
                    maxLength = dp[row][col];
            }
        }
        return maxLength;
    }
}

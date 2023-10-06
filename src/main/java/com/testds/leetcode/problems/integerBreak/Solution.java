//https://leetcode.com/problems/integer-break/
package com.testds.leetcode.problems.integerBreak;

//2 <= n <= 58
// k>=2

import java.util.stream.IntStream;

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[59];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        if (n > 3) {
            IntStream.rangeClosed(4, n)
                    .forEach(i -> populateDP(dp, i));
        }
        return dp[n];
    }

    private void populateDP(int[] dp, int i) {
        for (int j = 1; j <= i; j++) {
            int y = i - j;
            dp[i] = Math.max(Math.max(dp[i], j * y), Math.max(j * dp[y], dp[j] * dp[y]));
        }
    }

    public int integerBreak1(int n) {
        int[] dp = new int[59];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        if (n > 3) {
            for (int i = 4; i <= n; i++) {
                populateDP(dp, i);
            }
        }
        return dp[n];
    }
}

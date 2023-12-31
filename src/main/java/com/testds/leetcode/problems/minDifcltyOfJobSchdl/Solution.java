//https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
package com.testds.leetcode.problems.minDifcltyOfJobSchdl;

public class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {

        int jobs = jobDifficulty.length;

        if (jobs < d) {
            return -1;
        }

        int[][] dp = new int[d][jobs];

        dp[0][0] = jobDifficulty[0];
        for(int i = 1; i < jobs; i++) {
            dp[0][i] = Math.max(dp[0][i-1], jobDifficulty[i]);
        }

        for(int days = 1; days < d; days++) {

            for(int i = days; i < jobs; i++) {
                int Max = jobDifficulty[i];
                dp[days][i] = Integer.MAX_VALUE;

                for(int j = i; j >= days; j--) {
                    Max = Math.max(Max, jobDifficulty[j]);
                    dp[days][i] = Math.min(dp[days][i], dp[days - 1][j - 1] + Max);
                }
            }
        }

        return dp[d-1][jobs-1];
    }
}

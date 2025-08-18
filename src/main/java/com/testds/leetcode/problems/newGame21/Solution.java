//https://leetcode.com/problems/new-21-game/
package com.testds.leetcode.problems.newGame21;

public class Solution {

    private static final int DECIMAL_PLACES = 5;

    public double new21Game(int n, int k, int maxPts) {
        if (k == 0)
            return 1.0;
        if (k == 1) {
            if (n >= maxPts) {
                return 1.0;
            }
            return ((double) n) / maxPts;
        }

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double window = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = window / maxPts;
            if (i < k) {
                window += dp[i];
            }

            if (i >= maxPts && i - maxPts < k) {
                window -= dp[i - maxPts];
            }
        }
        double sum = 0;
        for (int i = k; i <= n; i++) {
            sum += dp[i];
        }
        return round(sum);
    }

    private double round(double d) {
        double scaled = d * Math.pow(10, DECIMAL_PLACES);
        long roundedScaledValue = Math.round(scaled);
        d = roundedScaledValue / Math.pow(10, DECIMAL_PLACES);
        return d;
    }

}

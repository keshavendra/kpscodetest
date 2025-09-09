//https://leetcode.com/problems/number-of-people-aware-of-a-secret
package com.testds.leetcode.problems.peopleAwareOfSecret;

public class Solution {

    private static final int MODULO = 1_000_000_000 + 7;

    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long activeSharer = 0;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int day = 2; day <= n; day++) {
            if (day - delay >= 1) {
                activeSharer = (activeSharer + dp[day - delay]) % MODULO;
            }
            if (day - forget >= 1) {
                activeSharer = (activeSharer - dp[day - forget] + MODULO) % MODULO;
            }
            dp[day] = (int) activeSharer;
        }
        int ans = 0;
        if (n - forget >= 0) {
            for (int i = n - forget + 1; i <= n; i++) {
                ans = ((ans + dp[i]) % MODULO);
            }
        }
        return ans;
    }
}

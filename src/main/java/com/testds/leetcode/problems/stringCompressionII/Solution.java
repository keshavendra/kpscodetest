//https://leetcode.com/problems/string-compression-ii/
package com.testds.leetcode.problems.stringCompressionII;


public class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {

        int n = s.length();
        int[][] dp = new int[n + 1][k + 1];

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= k; j++) {
                //declare
                if (i == n) {
                    dp[n][j] = 0;
                    continue;
                }

                //case 1 =delete the ith character if possible(j>0)
                dp[i][j] = j > 0 ? dp[i + 1][j - 1] : Integer.MAX_VALUE;

                //case 2 =k33p 5h3 i5h ine3s.
                //find the index end point

                int possible_del = j, count = 0;
                for (int end = i; end < n && possible_del >= 0; end++) {
                    if (s.charAt(end) == s.charAt(i)) {
                        count++;
                        //assuming the block end here "aaaa"
                        dp[i][j] = Math.min(dp[i][j], getLength(count) + dp[end + 1][possible_del]);
                    } else {
                        // this character should be deleted to make length min.
                        possible_del--;
                    }
                }
            }
        }
        return dp[0][k];

    }

    private int getLength(int count) {
        return count == 1 ? 1 : (count < 10 ? 2 : (count < 100 ? 3 : 4));
    }
}

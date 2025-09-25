//https://leetcode.com/problems/triangle/
package com.testds.leetcode.problems.minimumTotalInTriangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int[] dp = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> currentRow = triangle.get(i);
            for (int j = 0; j < currentRow.size(); j++) {
                dp[j] = currentRow.get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        return dp[0];
    }
}

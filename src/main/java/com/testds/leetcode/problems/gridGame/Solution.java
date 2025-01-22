//https://leetcode.com/problems/grid-game/

package com.testds.leetcode.problems.gridGame;

public class Solution {
    public long gridGame(int[][] grid) {
        long lowerSumB = 0;
        for (int col = 0; col < grid[0].length; col++) {
            lowerSumB += grid[1][col];
        }
        lowerSumB -= grid[1][grid[0].length - 1];
        long upperSumB = 0;
        long result = lowerSumB;
        for (int col = grid[0].length - 2; col >= 0; col--) {
            upperSumB += grid[0][col + 1];
            lowerSumB -= grid[1][col];
            if (Math.max(upperSumB, lowerSumB) < result) {
                result = Math.max(upperSumB, lowerSumB);
            }
        }
        return result;
    }
}

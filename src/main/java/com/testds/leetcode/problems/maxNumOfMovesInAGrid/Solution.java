//https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/
package com.testds.leetcode.problems.maxNumOfMovesInAGrid;

public class Solution {
    int[][] dp = null;
    int[][] grid = null;

    public int maxMoves(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int maxMoves = 0;

        for (int i = 0; i < grid.length; i++) {
            fetchResult(i, 0);
            if (dp[i][0] > maxMoves)
                maxMoves = dp[i][0];
        }
        return maxMoves;
    }

    private int fetchResult(int row, int col) {
        if (dp[row][col] == -1) {
            if (col == dp[0].length - 1) {
                dp[row][col] = 0;
            } else {
                int aboveRight = -1;
                int right = -1;
                int belowRight = -1;
                if (row != 0 && grid[row - 1][col + 1] > grid[row][col]) {
                    aboveRight = fetchResult(row - 1, col + 1);
                }
                if (grid[row][col + 1] > grid[row][col]) {
                    right = fetchResult(row, col + 1);
                }
                if (row != grid.length - 1 && grid[row + 1][col + 1] > grid[row][col]) {
                    belowRight = fetchResult(row + 1, col + 1);
                }
                dp[row][col] = Math.max(0,
                        Math.max(aboveRight + 1,
                                Math.max(right + 1, belowRight + 1)));
            }
        }
        return dp[row][col];
    }
}

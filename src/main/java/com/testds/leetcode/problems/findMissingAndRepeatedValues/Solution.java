//https://leetcode.com/problems/find-missing-and-repeated-values/
package com.testds.leetcode.problems.findMissingAndRepeatedValues;

public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int cols = grid[0].length;
        int row, col;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < cols; j++) {
                row = (Math.abs(grid[i][j]) - 1) / cols;
                col = (Math.abs(grid[i][j]) - 1) % cols;
                if (grid[row][col] < 0) {
                    //already -ve
                    result[0] = Math.abs(grid[i][j]);
                } else {
                    grid[row][col] *= (-1);
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {
                    result[1] = i * cols + j + 1;
                    break;
                }
            }
            if (result[1] != 0) {
                break;
            }
        }
        return result;
    }
}
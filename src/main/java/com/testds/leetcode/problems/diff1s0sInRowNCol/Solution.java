//https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column
package com.testds.leetcode.problems.diff1s0sInRowNCol;

public class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int numRows = grid.length;
        int numCols = grid[0].length;

        final int DIFF_FOR_ROW_N_COL = numRows + numCols;

        int[] rowsArray = new int[numRows];
        int[] colsArray = new int[numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col] == 1) {
                    rowsArray[row] += 1;
                    colsArray[col] += 1;
                }
            }
        }
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                grid[row][col] = 2 * (rowsArray[row] + colsArray[col]) - DIFF_FOR_ROW_N_COL;
            }
        }
        return grid;
    }
}

//https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/
package com.testds.leetcode.problems.minAreaToCoverAllOnes;

public class Solution {
    public int minimumArea(int[][] grid) {
        int minRow = grid.length + 1;
        int minCol = grid[0].length + 1;
        int maxRow = -1;
        int maxCol = -1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    if (minRow > row) {
                        minRow = row;
                    }
                    if (minCol > col) {
                        minCol = col;
                    }
                    if (maxRow < row) {
                        maxRow = row;
                    }
                    if (maxCol < col) {
                        maxCol = col;
                    }
                }
            }
        }
        if (maxRow == -1) {
            //no 1 are found
            return 0;
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}

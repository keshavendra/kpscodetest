//https://leetcode.com/problems/minimum-falling-path-sum/
package com.testds.leetcode.problems.minFallingPathSum;

public class Solution {

    private int[][] matrix;

    public int minFallingPathSum(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        if (matrix.length == 1 && matrix[0].length == 1)
            return matrix[0][0];
        this.matrix = matrix;

        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                getMin(row, col);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int row = matrix.length - 1; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                getMin(row, col);
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
        }
        return min;
    }

    private void getMin(int row, int col) {
        matrix[row][col] += Math.min(Math.min(col != 0 ? matrix[row - 1][col - 1] : Integer.MAX_VALUE, matrix[row - 1][col]), col < (matrix[row].length - 1) ? matrix[row - 1][col + 1] : Integer.MAX_VALUE);
    }
}

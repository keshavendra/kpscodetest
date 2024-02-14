//https://leetcode.com/problems/modify-the-matrix/
package com.testds.leetcode.problems.modifyTheMatrix;

public class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] copyMatrix = new int[matrix.length][matrix[0].length];
        for (int col = 0; col < matrix[0].length; col++) {
            int maxNumInCol = -1;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] > maxNumInCol) {
                    maxNumInCol = matrix[row][col];
                }
                copyMatrix[row][col] = matrix[row][col];
            }
            for (int row = 0; row < matrix.length; row++) {
                if (copyMatrix[row][col] == -1) {
                    copyMatrix[row][col] = maxNumInCol;
                }
            }
        }
        return copyMatrix;
    }
}

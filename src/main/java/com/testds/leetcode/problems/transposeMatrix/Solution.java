//https://leetcode.com/problems/transpose-matrix
package com.testds.leetcode.problems.transposeMatrix;

public class Solution {

    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] resultMatrix = new int[col][row];
        for ( row = 0; row < matrix.length; row++) {
            for ( col = 0; col < matrix[0].length; col++) {
                resultMatrix[col][row] = matrix[row][col];
            }
        }
        return resultMatrix;
    }

}

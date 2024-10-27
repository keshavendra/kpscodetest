//https://leetcode.com/problems/count-square-submatrices-with-all-ones/
package com.testds.leetcode.problems.countSquaresOf1s;

public class Solution {
    public int countSquares(int[][] matrix) {
        int squareCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    if (i != 0 && j != 0) {
                        matrix[i][j] += Math.min(
                                matrix[i - 1][j - 1],
                                Math.min(
                                        matrix[i - 1][j],
                                        matrix[i][j - 1]
                                )
                        );
                    }
                    squareCount += matrix[i][j];
                }
            }
        }
        return squareCount;
    }
}

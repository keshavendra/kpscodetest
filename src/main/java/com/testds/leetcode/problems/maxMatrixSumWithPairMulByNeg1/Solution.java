//https://leetcode.com/problems/maximum-matrix-sum/
package com.testds.leetcode.problems.maxMatrixSumWithPairMulByNeg1;

public class Solution {

    public long maxMatrixSum(int[][] matrix) {
        int n = 0;
        long s = 0;
        int m = Integer.MAX_VALUE;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] < 0) {
                    matrix[r][c] *= -1;
                    n++;
                }
                s += matrix[r][c];
                if (matrix[r][c] < m) {
                    m = matrix[r][c];
                }
            }


        }
        if (n % 2 == 1)
            s = s - m - m;
        return s;
    }
}
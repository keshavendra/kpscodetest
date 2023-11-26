//https://leetcode.com/problems/largest-submatrix-with-rearrangements
package com.testds.leetcode.problems.largestSubmatrixWithRearrangements;

import java.util.Arrays;

public class Solution {
    public int largestSubmatrix(int[][] matrix) {

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 0) {
                    matrix[row][col] = matrix[row - 1][col] + 1;
                }
            }

        }
        int maxArea = 0;
        for (int[] row : matrix) {
            Arrays.sort(row);
            for (int col = row.length - 1; col >= 0; col--) {
                if (row[col] > 0) {
                    if (((row.length - col) * row[col]) > maxArea)
                        maxArea = (row.length - col) * row[col];
                }
            }
        }
        return maxArea;
    }
}

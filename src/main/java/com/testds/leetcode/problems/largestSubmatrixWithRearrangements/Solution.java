//https://leetcode.com/problems/largest-submatrix-with-rearrangements
package com.testds.leetcode.problems.largestSubmatrixWithRearrangements;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int largestSubmatrix(int[][] matrix) {
        Integer[][] count1InEachColumnMatrix = new Integer[matrix.length][matrix[0].length];
        for (int i = 0; i < count1InEachColumnMatrix[0].length; i++) {
            count1InEachColumnMatrix[0][i] = matrix[0][i];
        }
        int maxArea = 0;
        for (int row = 1; row < matrix.length; row++) {
            int[] rowArray = matrix[row];
            for (int col = 0; col < rowArray.length; col++) {
                if (rowArray[col] == 0) {
                    count1InEachColumnMatrix[row][col] = 0;
                } else {
                    count1InEachColumnMatrix[row][col] = count1InEachColumnMatrix[row - 1][col] + 1;
                }
            }

        }
        for (Integer[] inEachColumnMatrix : count1InEachColumnMatrix) {
            Arrays.sort(inEachColumnMatrix, Comparator.reverseOrder());
            int area = inEachColumnMatrix[0];
            if (maxArea < area)
                maxArea = area;
            for (int i = 1; i < inEachColumnMatrix.length; i++) {
                area = (i + 1) * Math.min(inEachColumnMatrix[i], inEachColumnMatrix[i - 1]);
                if (maxArea < area)
                    maxArea = area;
            }
        }
        return maxArea;
    }
}

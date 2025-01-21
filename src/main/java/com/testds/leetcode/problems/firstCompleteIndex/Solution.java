//https://leetcode.com/problems/first-completely-painted-row-or-column/
package com.testds.leetcode.problems.firstCompleteIndex;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, Integer> rowToNums = new HashMap<>();
        Map<Integer, Integer> colToNums = new HashMap<>();
        Map<Integer, Integer> numToRowCol = new HashMap<>();
        int row, col, rows = mat.length, cols = mat[0].length;
        for (row = 0; row < rows; row++) {
            for (col = 0; col < cols; col++) {
                rowToNums.put(row, rowToNums.getOrDefault(row, 0) + 1);
                colToNums.put(col, colToNums.getOrDefault(col, 0) + 1);
                numToRowCol.put(mat[row][col], cols * row + col);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            Integer rowCol = numToRowCol.get(arr[i]);
            row = rowCol / cols;
            col = rowCol % cols;
            if (rowToNums.get(row) == 1 || colToNums.get(col) == 1) {
                return i;
            } else {
                rowToNums.put(row, rowToNums.remove(row) - 1);
                colToNums.put(col, colToNums.remove(col) - 1);
            }
        }
        return -1;
    }
}

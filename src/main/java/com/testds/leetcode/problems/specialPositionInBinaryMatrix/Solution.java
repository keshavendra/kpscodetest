//https://leetcode.com/problems/special-positions-in-a-binary-matrix/
package com.testds.leetcode.problems.specialPositionInBinaryMatrix;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numSpecial(int[][] mat) {
        Map<Integer, Integer> rowNumToNumOf1s = new HashMap<>();
        Map<Integer, Integer> colNumToNumOf1s = new HashMap<>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 1) {
                    rowNumToNumOf1s.put(row, rowNumToNumOf1s.getOrDefault(row, 0) + 1);
                    colNumToNumOf1s.put(col, colNumToNumOf1s.getOrDefault(col, 0) + 1);
                }
            }
        }
        rowNumToNumOf1s.entrySet().removeIf(rowIntegerEntry -> rowIntegerEntry.getValue() != 1);
        colNumToNumOf1s.entrySet().removeIf(colIntegerEntry -> colIntegerEntry.getValue() != 1);
        int count = 0;
        for (Map.Entry<Integer, Integer> rowEntry : rowNumToNumOf1s.entrySet()) {
            for (Map.Entry<Integer, Integer> colEntry : colNumToNumOf1s.entrySet()) {
                if (mat[rowEntry.getKey()][colEntry.getKey()] == 1)
                    count++;
            }
        }
        return count;
    }
}

//https://leetcode.com/problems/valid-sudoku
package com.testds.leetcode.problems.validateSudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> mapRowToSetOfNums = new HashMap<>();
        Map<Integer, Set<Character>> mapColToSetOfNums = new HashMap<>();
        Map<String, Set<Character>> map3Cross3Matrix = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] >= '1' && board[row][col] <= '9') {
                    if (!mapRowToSetOfNums.containsKey(row)) {
                        mapRowToSetOfNums.put(row, new HashSet<>());
                    }
                    if (!mapRowToSetOfNums.get(row).add(board[row][col])) {
                        return false;
                    }
                    if (!mapColToSetOfNums.containsKey(col)) {
                        mapColToSetOfNums.put(col, new HashSet<>());
                    }
                    if (!mapColToSetOfNums.get(col).add(board[row][col])) {
                        return false;
                    }
                    String gridString = (row / 3) + "##" + (col / 3);
                    if (!map3Cross3Matrix.containsKey(gridString)) {
                        map3Cross3Matrix.put(gridString, new HashSet<>());
                    }
                    if (!map3Cross3Matrix.get(gridString).add(board[row][col])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}

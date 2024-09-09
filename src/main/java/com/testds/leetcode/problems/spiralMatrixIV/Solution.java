//https://leetcode.com/problems/spiral-matrix-iv/
package com.testds.leetcode.problems.spiralMatrixIV;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = -1;
            }
        }

        char direction = 'R';
        int row = 0, col = 0;
        while (head != null) {
            if (result[row][col] == -1) {
                result[row][col] = head.val;
            }
            head = head.next;
            if (direction == 'R') {
                if (col + 1 < n && result[row][col + 1] == -1) {
                    col++;
                } else {
                    direction = 'D';
                    row++;
                }
            } else if (direction == 'D') {
                if (row + 1 < m && result[row + 1][col] == -1) {
                    row++;
                } else {
                    direction = 'L';
                    col--;
                }
            } else if (direction == 'L') {
                if (col - 1 >= 0 && result[row][col - 1] == -1) {
                    col--;
                } else {
                    direction = 'U';
                    row--;
                }
            } else {
                if (row - 1 >= 0 && result[row - 1][col] == -1) {
                    row--;
                } else {
                    direction = 'R';
                    col++;
                }
            }
        }
        return result;
    }
}

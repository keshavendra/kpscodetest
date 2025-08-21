//https://leetcode.com/problems/count-submatrices-with-all-ones/
package com.testds.leetcode.problems.numSubMatrics;

public class Solution {

    public int numSubmat(int[][] mat) {
        int res = 0;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (col == 0) {
                    mat[row][col] = mat[row][col];
                } else {
                    mat[row][col] = mat[row][col] == 0 ? 0 : mat[row][col - 1] + 1;
                }
                int cur = mat[row][col];
                for (int k = row; k >= 0; k--) {
                    cur = Math.min(cur, mat[k][col]);
                    if (cur == 0) {
                        break;
                    }
                    res += cur;
                }
            }
        }
        return res;
    }

}

//https://leetcode.com/problems/defuse-the-bomb/
package com.testds.leetcode.problems.defuseTheBomb;

public class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] output = new int[code.length];
        if (k == 0) return output;
        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                for (int j = 0; j < k; j++) {
                    output[i] += code[(i + 1 + j) % code.length];
                }
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                for (int j = 0; j < (-1 * k); j++) {
                    output[i] += code[(i - 1 - j + code.length) % code.length];
                }
            }
        }
        return output;
    }
}

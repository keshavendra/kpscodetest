//https://leetcode.com/problems/xor-queries-of-a-subarray/
package com.testds.leetcode.problems.xorQueries;

public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int index;
        for (index = 1; index < arr.length; index++) {
            arr[index] ^= arr[index - 1];
        }

        int[] answers = new int[queries.length];
        int i;
        for (index = 0; index < queries.length; index++) {
            int[] query = queries[index];
            i = 0;
            if (query[0] != 0) {
                i ^= arr[query[0] - 1];
            }
            i ^= arr[query[1]];
            answers[index] = i;
        }

        return answers;
    }
}

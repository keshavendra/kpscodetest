//https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
package com.testds.leetcode.problems.findThePrefixCommonArray;

public class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        long a = 0, b = 0;
        int[] result = new int[A.length];
        for (int i = 0; i < result.length; i++) {
            a |= (1L << A[i]);
            b |= (1L << B[i]);
            result[i] = findCommon(a, b);
        }
        return result;
    }

    private int findCommon(long a, long b) {
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            count += (a & b & (1L << i)) != 0L ? 1 : 0;
        }
        return count;
    }
}

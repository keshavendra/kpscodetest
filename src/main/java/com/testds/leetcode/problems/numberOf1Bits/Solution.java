//https://leetcode.com/problems/number-of-1-bits/
package com.testds.leetcode.problems.numberOf1Bits;

public class Solution {
    public int hammingWeight(int n) {
        final int ONE = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & ONE;
            n >>>= 1;
        }
        return count;
    }
}

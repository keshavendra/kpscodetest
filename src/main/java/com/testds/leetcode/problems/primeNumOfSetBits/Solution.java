//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
package com.testds.leetcode.problems.primeNumOfSetBits;

import java.util.Set;

public class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> primeNumbers = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (primeNumbers.contains(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }
}

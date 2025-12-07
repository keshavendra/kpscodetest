//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
package com.testds.leetcode.problems.countOddNumbersInAnInterval;

public class Solution {
    public int countOdds(int low, int high) {
        if (low == high || low == Integer.MAX_VALUE) {
            return low % 2 == 0 ? 0 : 1;
        }
        low = low % 2 == 1 ? low : low + 1;
        high = high % 2 == 1 ? high : high - 1;
        return ((high - low) / 2) + 1;
    }
}

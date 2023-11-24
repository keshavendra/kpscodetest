//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
package com.testds.leetcode.problems.maxCoinsYouMayGet;

import java.util.Arrays;

public class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int startIndex = (piles.length / 3);
        int maxCoins = 0;
        while (startIndex < piles.length) {
            maxCoins += piles[startIndex];
            startIndex += 2;
        }
        return maxCoins;
    }
}

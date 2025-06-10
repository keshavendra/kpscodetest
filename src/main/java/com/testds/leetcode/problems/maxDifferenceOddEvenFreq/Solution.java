//https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/
package com.testds.leetcode.problems.maxDifferenceOddEvenFreq;

public class Solution {

    public int maxDifference(String s) {
        int[] charFreq = new int[26];
        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }
        int minEvenFreq = Integer.MAX_VALUE, maxOddFreq = 0;
        for (int i = 0; i < 26; i++) {
            if (charFreq[i] > 0) {
                if (charFreq[i] % 2 == 0) {
                    if (minEvenFreq > charFreq[i]) {
                        minEvenFreq = charFreq[i];
                    }
                } else {
                    if (maxOddFreq < charFreq[i]) {
                        maxOddFreq = charFreq[i];
                    }
                }
            }
        }
        return maxOddFreq - minEvenFreq;
    }

}

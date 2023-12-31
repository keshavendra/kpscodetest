//https://leetcode.com/problems/largest-substring-between-two-equal-characters
package com.testds.leetcode.problems.maxLengthBetweenEqualCharacters;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] charOccurence = new int[26];
        int maxLength = -1;
        for (int i = 0; i < 26; i++)
            charOccurence[i] = -1;
        for (int i = 0; i < s.length(); i++) {
            if (charOccurence[s.charAt(i) - 'a'] != -1) {
                if (i - charOccurence[s.charAt(i) - 'a'] - 1 > maxLength) {
                    maxLength = i - charOccurence[s.charAt(i) - 'a'] - 1;
                }
            } else {
                charOccurence[s.charAt(i) - 'a'] = i;
            }
        }
        return maxLength;
    }
}

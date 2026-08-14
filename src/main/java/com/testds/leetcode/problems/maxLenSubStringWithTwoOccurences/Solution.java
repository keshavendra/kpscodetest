//https://leetcode.com/problems/maximum-length-substring-with-two-occurrences
package com.testds.leetcode.problems.maxLenSubStringWithTwoOccurences;

public class Solution {
    public int maximumLengthSubstring(String s) {
        int m = 0, start = 0, current = 0;
        char ch;
        int[] freq = new int[26];
        while (current < s.length()) {
            ch = s.charAt(current++);
            freq[ch - 'a']++;
            if (freq[ch - 'a'] > 2) {
                if ((current - start) > m) {
                    m = current - start - 1;
                }
                while (freq[ch - 'a'] > 2) {
                    freq[s.charAt(start++) - 'a']--;
                }
            }
        }
        if ((current - start) > m) {
            m = current - start;
        }
        return m;
    }
}

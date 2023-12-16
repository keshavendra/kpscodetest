//https://leetcode.com/problems/valid-anagram/

package com.testds.leetcode.problems.isAnagram;

public class Solution {

    public boolean isAnagram(String s, String t) {

        boolean isAnagram = false;
        if (s.length() == t.length()) {
            int[] numCharS = new int[26];
            for (char ch : s.toCharArray()) {
                numCharS[ch - 'a'] += 1;
            }
            for (char ch : t.toCharArray()) {
                numCharS[ch - 'a'] -= 1;
            }
            isAnagram = true;
            for (int i = 0; i < 26; i++) {
                if (numCharS[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }

}

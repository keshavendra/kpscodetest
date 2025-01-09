//https://leetcode.com/problems/counting-words-with-a-given-prefix/
package com.testds.leetcode.problems.prefixCount;

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (isPrefix(word, pref))
                count++;
        }
        return count;
    }

    private boolean isPrefix(String word, String pref) {
        if (word.length() < pref.length())
            return false;
        for (int i = 0; i < pref.length(); i++) {
            if (word.charAt(i) != pref.charAt(i))
                return false;
        }
        return true;
    }
}

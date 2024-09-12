//https://leetcode.com/problems/count-the-number-of-consistent-strings/
package com.testds.leetcode.problems.countConsistentStrings;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        if (allowed.length() == 26)
            return words.length;
        if (allowed.isEmpty())
            return 0;
        int consistentStrings = 0;

        int[] chars = new int[26];
        for (char c : allowed.toCharArray()) {
            chars[c - 'a']++;
        }

        for (String word : words) {
            boolean valid = true;
            for (char c : word.toCharArray()) {
                if (chars[c - 'a'] == 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                consistentStrings++;
            }
        }

        return consistentStrings;
    }
}

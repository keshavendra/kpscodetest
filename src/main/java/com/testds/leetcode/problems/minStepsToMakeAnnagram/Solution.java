//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
package com.testds.leetcode.problems.minStepsToMakeAnnagram;

import java.util.Arrays;

public class Solution {
    public int minSteps(String s, String t) {
        int[] charCount = new int[26];
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a'] += 1;
        }
        for (char ch : t.toCharArray()) {
            charCount[ch - 'a'] -= 1;
        }
        return Arrays.stream(charCount).filter(x -> x > 0).sum();
    }
}

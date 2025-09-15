//https://leetcode.com/problems/maximum-number-of-words-you-can-type
package com.testds.leetcode.problems.canBeTypedWords;

public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        boolean[] faultyKeys = new boolean[26];
        for (int i = 0; i < brokenLetters.length(); i++) {
            faultyKeys[brokenLetters.charAt(i) - 'a'] = true;
        }

        int count = 0;
        boolean canBeTyped = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (faultyKeys[text.charAt(i) - 'a']) {
                    canBeTyped = false;
                }
            } else {
                if (canBeTyped) {
                    count++;
                }
                canBeTyped = true;
            }
        }
        if (canBeTyped) {
            count++;
        }
        return count;
    }
}

//https://leetcode.com/problems/reverse-words-in-a-string-iii/
package com.testds.leetcode.problems.reverseWordsInAString3;

public class Solution {
    public String reverseWords(String s) {
        int i = 0;
        StringBuilder finalString = new StringBuilder();
        while (i < s.length()) {
            StringBuilder word = new StringBuilder();
            while (i < s.length() && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            finalString.append(word.reverse()).append(' ');
            i++;
        }
        return finalString.toString().trim();
    }
}

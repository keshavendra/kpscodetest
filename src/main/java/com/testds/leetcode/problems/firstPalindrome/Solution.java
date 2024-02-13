//https://leetcode.com/problems/find-first-palindromic-string-in-the-array
package com.testds.leetcode.problems.firstPalindrome;

public class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word))
                return word;
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        boolean isPalindrom = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}

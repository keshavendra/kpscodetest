//https://leetcode.com/problems/palindromic-substrings
package com.testds.leetcode.problems.countPalindromicSubstrings;

public class Solution {
    public int countSubstrings(String s) {
        int palindromicSubstringCount = s.length();
        boolean[] oddLengthSubstrings = new boolean[s.length()];
        boolean[] evenLengthSubstrings = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            oddLengthSubstrings[i] = true;
            if (i < s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    evenLengthSubstrings[i] = true;
                    palindromicSubstringCount++;
                }
            }
        }
        for (int substringLength = 3; substringLength <= s.length(); substringLength++) {
            boolean[] subStringArray = substringLength % 2 == 0 ? evenLengthSubstrings : oddLengthSubstrings;
            for (int startIndex = 0; startIndex <= s.length() - substringLength; startIndex++) {
                if (s.charAt(startIndex) == s.charAt(startIndex + substringLength - 1) && subStringArray[startIndex + 1]) {
                    subStringArray[startIndex] = true;
                    palindromicSubstringCount++;
                } else {
                    subStringArray[startIndex] = false;
                }
            }
        }
        return palindromicSubstringCount;
    }
}

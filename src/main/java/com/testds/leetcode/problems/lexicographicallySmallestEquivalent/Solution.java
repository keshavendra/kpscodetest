//https://leetcode.com/problems/lexicographically-smallest-equivalent-string/
package com.testds.leetcode.problems.lexicographicallySmallestEquivalent;

public class Solution {

    public String smallestEquivalentString(String s1, String s2, String baseStr) {

        char[] minCharArray = new char[26];
        for (int i = 0; i < 26; i++) {
            minCharArray[i] = (char) ('a' + i);
        }
        for (int i = 0; i < s1.length(); i++) {
            char cS1 = s1.charAt(i);
            char cS2 = s2.charAt(i);
            if (minCharArray[cS2 - 'a'] > minCharArray[cS1 - 'a']) {
                replaceChars(minCharArray, minCharArray[cS2 - 'a'], minCharArray[cS1 - 'a']);
            } else if (minCharArray[cS2 - 'a'] < minCharArray[cS1 - 'a']) {
                replaceChars(minCharArray, minCharArray[cS1 - 'a'], minCharArray[cS2 - 'a']);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            result.append(minCharArray[baseStr.charAt(i) - 'a']);
        }

        return result.toString();
    }

    private void replaceChars(char[] chars, char original, char replacement) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == original) {
                chars[i] = replacement;
            }
        }
    }

}

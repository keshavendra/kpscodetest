//https://leetcode.com/problems/count-vowel-strings-in-ranges/
package com.testds.leetcode.problems.countVowelStringsInRanges;

public class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefixArray[i] = 1;
            }
        }
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] += prefixArray[i - 1];
        }
        int[] queryResponse = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int prev = 0;
            if (queries[i][0] > 0) {
                prev = prefixArray[queries[i][0] - 1];
            }
            queryResponse[i] = prefixArray[queries[i][1]] - prev;
        }
        return queryResponse;
    }

    public boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}

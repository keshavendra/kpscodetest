//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters
package com.testds.leetcode.problems.findWordsFormedByCharacters;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsCountArray = findCharsArrayInString(chars);
        int length = 0;
        for (String word : words) {
            int[] wordCharactersArray = findCharsArrayInString(word);
            boolean canWordBeMade = true;
            for (int i = 0; i < 26; i++) {
                if (charsCountArray[i] < wordCharactersArray[i]) {
                    canWordBeMade = false;
                    break;
                }
            }
            if (canWordBeMade) {
                length += word.length();
            }

        }
        return length;
    }

    private int[] findCharsArrayInString(String str) {
        int[] charArray = new int[26];
        for (char ch : str.toCharArray()) {
            charArray[ch - 'a'] += 1;
        }
        return charArray;
    }
}

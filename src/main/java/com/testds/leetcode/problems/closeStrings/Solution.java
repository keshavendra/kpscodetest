//https://leetcode.com/problems/determine-if-two-strings-are-close/
package com.testds.leetcode.problems.closeStrings;

import java.util.Objects;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (Objects.equals(word1, word2))
            return true;
        if (word1 == null || word2 == null)
            return false;
        if (word1.length() != word2.length())
            return false;
        int[] freqArray1 = fetchCharacterFrequencyArray(word1);
        int[] freqArray2 = fetchCharacterFrequencyArray(word2);
        //first condition
        for (int i = 0; i < freqArray1.length; i++) {
            if ((freqArray1[i] == 0 && freqArray2[i] != 0) || (freqArray2[i] == 0 && freqArray1[i] != 0))
                return false;
        }
        //second condition
        for (int k : freqArray1) {
            boolean frequencyFound = false;
            for (int j = 0; j < freqArray2.length; j++) {
                if (freqArray2[j] == k) {
                    frequencyFound = true;
                    freqArray2[j] = -1;
                    break;
                }
            }
            if (!frequencyFound)
                return false;
        }
        return true;
    }

    public int[] fetchCharacterFrequencyArray(String word) {
        final int[] charFreq = new int[26];
        for (char c : word.toCharArray()) {
            charFreq[c - 'a'] += 1;
        }
        return charFreq;
    }
}

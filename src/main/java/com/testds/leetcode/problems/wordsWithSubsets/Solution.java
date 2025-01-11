//https://leetcode.com/problems/word-subsets/
package com.testds.leetcode.problems.wordsWithSubsets;

import java.util.*;

public class Solution {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFrequencyInWords2 = new int[26], wordFrequency = new int[26];
        for (String word : words2) {
            Arrays.fill(wordFrequency, 0);
            calculateFrequencies(word, wordFrequency);
            for (int i = 0; i < 26; i++) {
                maxFrequencyInWords2[i] = Math.max(maxFrequencyInWords2[i], wordFrequency[i]);
            }
        }
        List<String> result = new ArrayList<>();
        boolean satisfies = true;
        for (String word : words1) {
            Arrays.fill(wordFrequency, 0);
            calculateFrequencies(word, wordFrequency);
            for (int i = 0; i < 26; i++) {
                if (wordFrequency[i] < maxFrequencyInWords2[i]) {
                    satisfies = false;
                    break;
                }
            }
            if (satisfies) {
                result.add(word);
            }
            satisfies = true;
        }
        return result;
    }

    private void calculateFrequencies(String word, int[] localFrequencyInWord2) {
        for (int i = 0; i < word.length(); i++) {
            localFrequencyInWord2[word.charAt(i) - 'a']++;
        }
    }

}

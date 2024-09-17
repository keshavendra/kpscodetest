//https://leetcode.com/problems/uncommon-words-from-two-sentences/
package com.testds.leetcode.problems.uncommonFromSentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final char SEPARATOR = ' ';

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        wordsInASentenceWithFrequency(s1, map);
        wordsInASentenceWithFrequency(s2, map);
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);
    }

    public void wordsInASentenceWithFrequency(String s, Map<String, Integer> map) {
        String[] allWords = splitString(s);
        for (String word : allWords) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }

    public String[] splitString(String sentence) {
        int index = 0;
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (index < sentence.length()) {
            if (sentence.charAt(index) == SEPARATOR) {
                words.add(sb.toString());
                sb.delete(0, sb.length());
                while (index < sentence.length() && sentence.charAt(index) == SEPARATOR) {
                    index++;
                }
            } else {
                sb.append(sentence.charAt(index));
                index++;
            }
        }
        if (sb.length() != 0) {
            words.add(sb.toString());
        }
        return words.toArray(new String[0]);
    }

}

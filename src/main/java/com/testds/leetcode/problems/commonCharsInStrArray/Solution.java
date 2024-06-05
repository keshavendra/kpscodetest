//https://leetcode.com/problems/find-common-characters/
package com.testds.leetcode.problems.commonCharsInStrArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] words) {
        int[] commonChars = new int[26];
        for (char c : words[0].toCharArray()) {
            commonChars[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] charsArray = new int[26];
            for (char c : words[i].toCharArray()) {
                charsArray[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                commonChars[j] = Math.min(commonChars[j], charsArray[j]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < commonChars.length; i++) {
            if (commonChars[i] > 0) {
                for (int j = 0; j < commonChars[i]; j++) {
                    result.add(String.valueOf((char) ('a' + i)));
                }
            }
        }
        return result;
    }
}

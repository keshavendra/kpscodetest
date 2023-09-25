//https://leetcode.com/problems/count-pairs-of-similar-strings
package com.testds.leetcode.problems.countPairsOfSimilarStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int similarPairs(String[] words) {
        boolean[] charactersPresent;
        Map<String, Integer> mapWordToCount = new HashMap<>();
        for (String str : words) {
            charactersPresent = new boolean[26];
            for (char c : str.toCharArray()) {
                charactersPresent[c - 'a'] = true;
            }
            StringBuilder string = new StringBuilder();
            for (int x = 0; x < 26; x++) {
                if (charactersPresent[x])
                    string.append((char) ('a' + x));
            }
            mapWordToCount.put(string.toString(), mapWordToCount.getOrDefault(string.toString(), 0) + 1);
        }
        return mapWordToCount.values().stream().filter(x -> x > 1).mapToInt(x -> (x) * (x - 1) / 2).sum();
    }
}

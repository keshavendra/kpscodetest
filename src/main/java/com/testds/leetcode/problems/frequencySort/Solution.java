//https://leetcode.com/problems/sort-characters-by-frequency
package com.testds.leetcode.problems.frequencySort;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String frequencySort(String s) {
        final Map<Character, Integer> characterToFrequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            characterToFrequencyMap.put(ch, characterToFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> sortedMap = new TreeMap<>((o1, o2) -> {
            if (!characterToFrequencyMap.get(o1).equals(characterToFrequencyMap.get(o2))) {
                return characterToFrequencyMap.get(o2) - characterToFrequencyMap.get(o1);
            } else {
                return o1 - o2;
            }
        });

        sortedMap.putAll(characterToFrequencyMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> mapEntry : sortedMap.entrySet()) {
            for (int i = 0; i < mapEntry.getValue(); i++) {
                sb.append(mapEntry.getKey());
            }
        }
        return sb.toString();
    }
}

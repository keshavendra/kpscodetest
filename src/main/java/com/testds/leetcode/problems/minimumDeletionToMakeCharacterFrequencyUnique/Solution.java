//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique
package com.testds.leetcode.problems.minimumDeletionToMakeCharacterFrequencyUnique;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public int minDeletions(String s) {
        int[] arrOfFrequencies = new int[26];
        IntStream.range(0, s.length()).forEach(x -> arrOfFrequencies[s.charAt(x) - 'a'] += 1);
        Arrays.sort(arrOfFrequencies);
        TreeMap<Integer, Integer> frequencyToMaxFrequencyNum = new TreeMap<>();

        for (int i = 25; i >= 0; i--) {
            int val = arrOfFrequencies[i];
            if (val == 0)
                break;
            if (frequencyToMaxFrequencyNum.containsKey(val)) {
                frequencyToMaxFrequencyNum.put(val, frequencyToMaxFrequencyNum.get(val) + 1);
            } else
                frequencyToMaxFrequencyNum.put(val, 1);
        }
        int count = 0;
        Set<Integer> frequencySet = new HashSet<>(frequencyToMaxFrequencyNum.keySet());
        for (Map.Entry<Integer, Integer> mapEntry : frequencyToMaxFrequencyNum.entrySet()) {
            if (mapEntry.getValue() == 1)
                continue;
            for (int i = mapEntry.getValue(); i > 1; i--) {
                int prev = mapEntry.getKey();
                while (frequencySet.contains(prev) && prev > 0) {
                    prev--;
                    count++;
                }
                frequencySet.add(prev);
            }
        }
        return count;
    }
}

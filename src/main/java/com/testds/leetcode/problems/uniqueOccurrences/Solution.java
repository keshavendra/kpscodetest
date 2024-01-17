//https://leetcode.com/problems/unique-number-of-occurrences/
package com.testds.leetcode.problems.uniqueOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numToFrequency = new HashMap<>();
        for (int num : arr) {
            numToFrequency.put(num, numToFrequency.getOrDefault(num, 0) + 1);
        }
        return new HashSet<>(numToFrequency.values()).size() == numToFrequency.size();
    }
}

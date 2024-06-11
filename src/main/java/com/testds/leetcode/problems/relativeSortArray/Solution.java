//https://leetcode.com/problems/relative-sort-array/
package com.testds.leetcode.problems.relativeSortArray;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new TreeMap<>();
        for (int j : arr1) {
            frequencyMap.put(j, frequencyMap.getOrDefault(j, 0) + 1);
        }
        int currentIndex = 0;
        for (int i : arr2) {
            int frequency = frequencyMap.remove(i);
            for (int j = 0; j < frequency; j++) {
                arr1[currentIndex++] = i;
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            for (int j = 0; j < entry.getValue(); j++) {
                arr1[currentIndex++] = entry.getKey();
            }
        }
        return arr1;
    }
}

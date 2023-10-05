//https://leetcode.com/problems/top-k-frequent-elements/
package com.testds.leetcode.problems.topKFrequent;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        //Calculating the frequencies
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        TreeMap<Integer, List<Integer>> newMap = new TreeMap<>(Comparator.reverseOrder());
        //Rebuilding the map based on the count
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (!newMap.containsKey(value))
                newMap.put(value, new ArrayList<>());
            newMap.get(value).add(key);
        }
        //Copying result numbers to resultArray
        int[] resultArray = new int[k];
        Iterator<Map.Entry<Integer, List<Integer>>> itr = newMap.entrySet().iterator();
        int count = 0;
        while (count < k) {
            List<Integer> numList = itr.next().getValue();
            for (int num : numList) {
                resultArray[count++] = num;
                if (k == count)
                    return resultArray;
            }

        }
        return resultArray;
    }
}

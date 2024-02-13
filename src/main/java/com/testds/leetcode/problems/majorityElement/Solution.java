//https://leetcode.com/problems/majority-element/
package com.testds.leetcode.problems.majorityElement;

import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Arrays.stream(nums).forEach(x -> frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1));
        final Optional<Map.Entry<Integer, Integer>> max = frequencyMap.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue));
        if (max.isPresent())
            return max.get().getKey();
        else
            return -1;
    }
}

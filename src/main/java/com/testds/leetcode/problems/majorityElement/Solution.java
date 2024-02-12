//https://leetcode.com/problems/majority-element/
package com.testds.leetcode.problems.majorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Arrays.stream(nums).forEach(x -> frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1));
        int maxNum = -1, maxFreq = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxNum = entry.getKey();
            }
        }
        return maxNum;
    }
}

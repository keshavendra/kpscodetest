//https://leetcode.com/problems/majority-element-ii/
package com.testds.leetcode.problems.majorityElement2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Arrays.stream(nums)
                .forEach(x -> frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1));


        return frequencyMap
                .entrySet()
                .stream()
                .filter(x -> x.getValue() * 3 > nums.length)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}

//https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset/
package com.testds.leetcode.problems.findTheMaxNumOfElementsInSubset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    TreeMap<Integer, Integer> numToFrequency = new TreeMap<>();
    Map<Integer, Integer> len = new HashMap<>();
    int max = 0;

    public int maximumLength(int[] nums) {
        Arrays.stream(nums)
                .forEach(num -> numToFrequency.put(num,
                        numToFrequency.getOrDefault(num, 0) + 1));
        numToFrequency.keySet()
                .forEach(num -> len.put(num, findLen(Long.valueOf(num))));
        return max;
    }

    private Integer findLen(Long num) {
        if (num > Integer.MAX_VALUE
                || !numToFrequency.containsKey(num.intValue())) {
            return 0;
        }

        int n = num.intValue();
        if (len.containsKey((n)))
            return len.get(n);
        if (numToFrequency.get(n) == 1) {
            len.put(n, 1);
        } else if (n == 1) {
            int l = numToFrequency.get(n) % 2 == 0
                    ? numToFrequency.get(n) - 1
                    : numToFrequency.get(n);
            len.put(n, l);
        } else {
            int l = findLen(num * num);
            len.put(n, l > 0 ? l + 2 : 1);
        }
        if (len.get(n) > max)
            max = len.get(n);
        return len.get(n);
    }
}
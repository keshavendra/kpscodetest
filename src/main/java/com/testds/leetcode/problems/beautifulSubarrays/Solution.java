//https://leetcode.com/problems/count-the-number-of-beautiful-subarrays/
package com.testds.leetcode.problems.beautifulSubarrays;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> numToCountMap = new HashMap<>();
        long count = 0;
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
            if (xor == 0)
                count++;
            numToCountMap.put(xor, numToCountMap.getOrDefault(xor, 0) + 1);
        }
        count += numToCountMap
                .values()
                .stream()
                .filter(value -> value > 1)
                .mapToLong(intValue -> ((long) intValue * (intValue - 1)) / 2)
                .sum();
        return count;
    }
}

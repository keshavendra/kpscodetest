//https://leetcode.com/problems/count-nice-pairs-in-an-array
package com.testds.leetcode.problems.countNicePairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> mapDiffToFrequency = new HashMap<>();
        final int MOD = 1000000007;
        int pairCount = 0;
        for (int num : nums) {
            int diff = num - reverse(num);
            pairCount += mapDiffToFrequency.getOrDefault(diff, 0);
            mapDiffToFrequency.put(diff, mapDiffToFrequency.getOrDefault(diff, 0) + 1);
            if (pairCount >= MOD)
                pairCount %= MOD;
        }
        return pairCount % (MOD);
    }

    public int reverse(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }

        return result;
    }
}

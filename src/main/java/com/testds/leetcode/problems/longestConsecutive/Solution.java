//https://leetcode.com/problems/longest-consecutive-sequence/
package com.testds.leetcode.problems.longestConsecutive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        IntStream.range(0, nums.length)
                .forEach(i -> numsSet.add(nums[i]));

        Map<Integer, Integer> dp = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, findLengthOfLongestSequence(num, dp, numsSet));
        }
        return max;
    }

    private int findLengthOfLongestSequence(int n,
                                            Map<Integer, Integer> dp,
                                            Set<Integer> numsSet) {
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        if (!numsSet.contains(n)) {
            return 0;
        }
        dp.put(n, 1 + findLengthOfLongestSequence(n - 1, dp, numsSet));
        numsSet.remove(n);
        dp.remove(n-1);
        return dp.get(n);
    }

}

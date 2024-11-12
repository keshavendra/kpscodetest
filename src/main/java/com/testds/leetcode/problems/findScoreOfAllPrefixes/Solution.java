//https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/
package com.testds.leetcode.problems.findScoreOfAllPrefixes;

public class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] prefixes = new long[nums.length];
        prefixes[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prefixes[i - 1] > nums[i]) {
                prefixes[i] = prefixes[i - 1];
            } else {
                prefixes[i] = nums[i];
            }
        }
        prefixes[0] *= 2;
        for (int i = 1; i < nums.length; i++) {
            prefixes[i] += nums[i];
            prefixes[i] += prefixes[i - 1];
        }
        return prefixes;
    }
}

// https://leetcode.com/problems/number-of-zero-filled-subarrays/
package com.testds.leetcode.problems.zeroFilledSubarray;

public class Solution {

    public long zeroFilledSubarray(int[] nums) {
        long result = 0L;
        int currentStreak = 0;
        for (int num : nums) {
            if (num == 0) {
                currentStreak++;
                result += currentStreak;
            } else {
                currentStreak = 0;
            }
        }
        return result;
    }
}

//https://leetcode.com/problems/minimum-increment-to-make-array-unique/
package com.testds.leetcode.problems.minIncrementForUnique;

import java.util.Arrays;

public class Solution {
    public int minIncrementForUnique(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                moves += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return moves;
    }
}

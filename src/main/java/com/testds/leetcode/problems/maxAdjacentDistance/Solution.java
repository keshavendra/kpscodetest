//https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/
package com.testds.leetcode.problems.maxAdjacentDistance;

public class Solution {

    public int maxAdjacentDistance(int[] nums) {
        int maxDistance = Math.abs(nums[nums.length - 1] - nums[0]);
        int absDiff;
        for (int i = 1; i < nums.length; i++) {
            absDiff = Math.abs(nums[i] - nums[i - 1]);
            if (absDiff > maxDistance) {
                maxDistance = absDiff;
            }
        }
        return maxDistance;
    }

}

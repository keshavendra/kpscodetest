//https://leetcode.com/problems/house-robber-iv/
package com.testds.leetcode.problems.houseRobber4;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {

    public int minCapability(int[] nums, int k) {
        // Store the maximum nums value in maxReward.
        int minReward = 1,maxReward = 1;
        OptionalInt optional = Arrays.stream(nums).max();
        if (optional.isPresent()) {
            minReward = optional.getAsInt();
        }
        int totalHouses = nums.length;

        // Use binary search to find the minimum reward possible.
        while (minReward < maxReward) {
            int midReward = (minReward + maxReward) / 2;
            int possibleThefts = 0;

            for (int index = 0; index < totalHouses; ++index) {
                if (nums[index] <= midReward) {
                    possibleThefts += 1;
                    index++; // Skip the next house to maintain the
                    // non-adjacent condition
                }
            }

            if (possibleThefts >= k) maxReward = midReward;
            else minReward = midReward + 1;
        }

        return minReward;
    }

}

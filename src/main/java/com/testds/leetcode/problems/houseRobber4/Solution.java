//https://leetcode.com/problems/house-robber-iv/
package com.testds.leetcode.problems.houseRobber4;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {

    public int minCapability(int[] nums, int k) {
        OptionalInt max = Arrays.stream(nums).max();
        int minCap = 1, maxCap = 0, minimum = 0;
        if(max.isPresent()) {
            maxCap = max.getAsInt();
        }
        while (minCap <= maxCap) {
            int midCap = (maxCap + minCap) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= midCap) {
                    count++;
                    i++;
                }
            }
            if (count >= k) {
                minimum = midCap;
                maxCap = midCap - 1;
            } else {
                minCap = midCap + 1;
            }
        }
        return minimum;
    }

}

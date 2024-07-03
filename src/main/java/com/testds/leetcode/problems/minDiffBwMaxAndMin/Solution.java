//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
package com.testds.leetcode.problems.minDiffBwMaxAndMin;

import java.util.Arrays;

public class Solution {
    public int minDifference(int[] nums) {
        if (nums.length < 5) return 0;
        Arrays.sort(nums);
        int maxIndex = nums.length - 1;
        return Math.min(nums[maxIndex] - nums[3],
                Math.min(nums[maxIndex - 1] - nums[2],
                        Math.min(nums[maxIndex - 2] - nums[1],
                                nums[maxIndex - 3] - nums[0])));
    }
}

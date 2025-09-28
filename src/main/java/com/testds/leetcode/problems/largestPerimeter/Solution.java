//https://leetcode.com/problems/largest-perimeter-triangle/
package com.testds.leetcode.problems.largestPerimeter;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int side = nums.length - 1; side >= 2; side--) {
            if (nums[side] + nums[side - 1] > nums[side - 2]
                    && nums[side - 1] + nums[side - 2] > nums[side]
                    && nums[side - 2] + nums[side] > nums[side - 1]) {
                return nums[side] + nums[side - 1] + nums[side - 2];
            }
        }
        return 0;
    }
}

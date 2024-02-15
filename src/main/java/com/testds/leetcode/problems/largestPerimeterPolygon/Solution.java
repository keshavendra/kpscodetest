//https://leetcode.com/problems/find-polygon-with-the-largest-perimeter
package com.testds.leetcode.problems.largestPerimeterPolygon;

import java.util.Arrays;

public class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long largestPerimeter = -1;
        long prefixSum = 0;
        for (int i = 0; i < 2; i++) {
            prefixSum += nums[i];
        }
        for (int i = 2; i < nums.length; i++) {
            if (prefixSum > nums[i] && largestPerimeter < (prefixSum + nums[i])) {
                largestPerimeter = prefixSum + nums[i];
            }
            prefixSum += nums[i];
        }
        return largestPerimeter;
    }
}

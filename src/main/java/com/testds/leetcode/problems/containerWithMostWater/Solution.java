//https://leetcode.com/problems/container-with-most-water/
package com.testds.leetcode.problems.containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int max = 0, localMax, low = 0, high = height.length - 1;
        while (low <= high) {
            localMax = (high - low) * Math.min(height[low], height[high]);
            if (localMax > max) {
                max = localMax;
            }
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}

//https://leetcode.com/problems/valid-triangle-number/
package com.testds.leetcode.problems.numberOfValidTriangles;

import java.util.Arrays;

public class Solution {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int total = 0;
        for (int k = n - 1; k >= 2; k--) {
            int left = 0;
            int right = k - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[k]) {
                    total += (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return total;
    }
}

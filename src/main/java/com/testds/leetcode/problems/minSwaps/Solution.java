//https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/
package com.testds.leetcode.problems.minSwaps;

public class Solution {
    public int minSwaps(int[] nums) {
        int windowSize = 0;
        for (int num : nums) {
            if (num == 1)
                windowSize++;
        }
        int count0 = 0;
        int i = 0;
        //checking starting window size
        for (; i < windowSize; i++) {
            if (nums[i] == 0) {
                count0++;
            }
        }

        int minSwaps = count0;
        //checking till end;
        for ( i = windowSize; i < nums.length; i++) {
            if (nums[i - windowSize] == 0) {
                count0--;
            }
            if (nums[i] == 0) {
                count0++;
            }
            if (minSwaps > count0)
                minSwaps = count0;
        }
        //checking the rounding ones
        for ( i = 0; i < windowSize - 1; i++) {
            if (nums[nums.length - windowSize + i] == 0) {
                count0--;
            }
            if (nums[i] == 0)
                count0++;
            if (minSwaps > count0)
                minSwaps = count0;
        }
        return minSwaps;
    }
}

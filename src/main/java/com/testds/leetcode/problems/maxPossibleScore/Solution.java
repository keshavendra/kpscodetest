//https://leetcode.com/problems/maximize-score-of-numbers-in-ranges/
package com.testds.leetcode.problems.maxPossibleScore;

import java.util.Arrays;

public class Solution {
        public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);
        int low = 0, high = Integer.MAX_VALUE;
        int res = -1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (isValid(start, d, mid)) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    private boolean isValid(int[] start, int d, int possibleSolution) {
        int prev = start[0];
        for (int i = 1; i < start.length; i++) {
            if (prev + possibleSolution > start[i] + d) {
                return false;
            }
            prev = Math.max(prev + possibleSolution, start[i]);
        }
        return true;
    }
//    public int maxPossibleScore(int[] start, int d) {
//        int low = 0;
//        int high = Integer.MAX_VALUE;
//        int res = -1;
//        Arrays.sort(start);
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if (isValid(start, d, mid)) {
//                res = mid;
//                low = mid + 1;
//            } else high = mid - 1;
//        }
//
//        return res;
//    }
//
//    private boolean isValid(int[] nums, int d, int mid) {
//        int n = nums.length;
//        int prev = nums[0];
//
//        for (int i = 1; i < n; i++) {
//            if (prev + mid > nums[i] + d) return false;
//            prev = Math.max(nums[i], prev + mid);
//        }
//
//        return true;
//    }
}

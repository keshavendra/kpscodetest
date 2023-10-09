//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
package com.testds.leetcode.problems.searchRange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        return searchRange(nums, target, 0, nums.length - 1);
    }

    private int[] searchRange(int[] nums, int target, int low, int high) {
        if (low > high || nums == null || nums.length == 0)
            return new int[]{-1, -1};
        int mid = (low + high) / 2;
        if (nums[mid] != target) {
            if (nums[mid] > target)
                //search left subArray
                return searchRange(nums, target, low, mid - 1);
            else
                //search right subArray
                return searchRange(nums, target, mid + 1, high);
        }
        int left = mid;
        while (left >= 0 && nums[left] == target)
            left--;
        left++;
        int right = mid;
        while (right < nums.length && nums[right] == target)
            right++;
        right--;
        return new int[]{left, right};
    }
}

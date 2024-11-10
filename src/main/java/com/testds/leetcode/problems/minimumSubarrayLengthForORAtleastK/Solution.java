//https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/
package com.testds.leetcode.problems.minimumSubarrayLengthForORAtleastK;

public class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int answer = -1, low = 0, curr = 0, or;
        int[] arr = new int[32];
        while (low <= curr && curr < nums.length) {
            if (nums[curr] >= k) {
                answer = 1;
                break;
            }
            or = accumulate(arr, nums[curr]);
            if (or >= k) {
                if (answer == -1 || answer > (curr - low + 1)) {
                    answer = curr - low + 1;
                }
                subtract(arr, nums[curr]);
                subtract(arr, nums[low]);
                low++;
            } else {
                curr++;
            }
        }
        return answer;
    }

    public int accumulate(int[] nums, int k) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            if ((k & (1 << i)) != 0) {
                nums[i]++;
            }
            if (nums[i] > 0)
                num += (1 << i);
        }
        return num;
    }

    public void subtract(int[] nums, int k) {
        for (int i = 0; i < 32; i++) {
            if ((k & (1 << i)) != 0) {
                nums[i]--;
            }
        }
    }
}

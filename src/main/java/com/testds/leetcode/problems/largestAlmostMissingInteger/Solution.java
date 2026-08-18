//https://leetcode.com/problems/find-the-largest-almost-missing-integer
package com.testds.leetcode.problems.largestAlmostMissingInteger;

public class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] f = new int[51];
        int m = 0;
        for (int n : nums) {
            f[n]++;
            if (n > m)
                m = n;
        }
        int i = -1;
        while (m >= 0) {
            if (f[m] == 1 && k == 1) {
                i = m;
                break;
            }
            if (k == nums.length) {
                i = m;
                break;
            }
            if ((m == nums[0] || m == nums[nums.length - 1])) {
                if (f[m] == 1) {
                    i = m;
                    break;
                }
            }

            m--;
        }
        return i;
    }
}

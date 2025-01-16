//https://leetcode.com/problems/bitwise-xor-of-all-pairings/
package com.testds.leetcode.problems.xorAllNums;

public class Solution {

    public int xorAllNums(int[] nums1, int[] nums2) {

        //both even
        if (nums1.length % 2 == 0 && nums2.length % 2 == 0) {
            return 0;
        }

        int xor = 0;
        //nums1 is even
        if (nums1.length % 2 == 0) {
            for (int j : nums1) {
                xor ^= j;
            }
            return xor;
        }

        //nums2 is even
        if (nums2.length % 2 == 0) {
            for (int j : nums2) {
                xor ^= j;
            }
            return xor;
        }

        for (int j : nums1) {
            xor ^= j;
        }

        for (int j : nums2) {
            xor ^= j;
        }

        return xor;
    }

}

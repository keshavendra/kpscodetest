//https://leetcode.com/problems/single-number-ii/
package com.testds.leetcode.problems.singleNumber2;

public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int bit = 0; bit < 32; bit++) {
            int sum = 0;
            for (int num : nums) {
                sum += ((num >> bit) & 1) == 1 ? 1 : 0;
            }
            sum %= 3;
            ans |= (sum << bit);
        }
        return ans;
    }
}

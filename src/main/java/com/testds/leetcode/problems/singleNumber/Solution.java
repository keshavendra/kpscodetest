//https://leetcode.com/problems/single-number
package com.testds.leetcode.problems.singleNumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num ^= i;
        }
        return num;
    }
}

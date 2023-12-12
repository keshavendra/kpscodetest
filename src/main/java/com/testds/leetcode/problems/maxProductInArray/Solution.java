//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
package com.testds.leetcode.problems.maxProductInArray;

public class Solution {
    public int maxProduct(int[] nums) {
        int max = 0, secondMax = 0;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}

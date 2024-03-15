//https://leetcode.com/problems/product-of-array-except-self/
package com.testds.leetcode.problems.productExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        product[0] = 1;
        //calculating left product
        for (int i = 1; i < nums.length; i++) {
            product[i] = product[i - 1] * nums[i - 1];
        }

        int prev = nums[nums.length - 1];
        nums[nums.length - 1] = 1;
        int temp = 0;
        //calculating right product
        for (int i = nums.length - 2; i >= 0; i--) {
            temp = prev * nums[i + 1];
            prev = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            product[i] *= nums[i];
        }
        return product;
    }
}

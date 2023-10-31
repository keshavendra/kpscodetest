//https://leetcode.com/problems/single-number-iii/
package com.testds.leetcode.problems.singleNumber3;

public class Solution {
    public int[] singleNumber(int[] nums) {
        //FirstPass
        //Take xor of all nums
        int xor = 0;
        for (int num : nums)
            xor ^= num;

        //Find rightmost set bit for masking
        xor &= -xor;

        //2nd Pass to segregate the nums into two groups
        int[] resultArray = new int[2];
        for (int num : nums) {
            if ((num & xor) == 0)
                resultArray[0] ^= num;
            else
                resultArray[1] ^= num;
        }
        return resultArray;
    }
}

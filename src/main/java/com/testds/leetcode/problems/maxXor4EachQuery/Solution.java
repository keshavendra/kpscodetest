//https://leetcode.com/problems/maximum-xor-for-each-query/
package com.testds.leetcode.problems.maxXor4EachQuery;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = new int[]{0, 1, 1, 3};
//        int maximumBit = 2;
//        int[] nums = new int[]{2, 3, 4, 7};
//        int maximumBit = 3;
        int[] nums = new int[]{0, 1, 2, 2, 5, 7};
        int maximumBit = 3;
        System.out.println(Arrays.toString(new Solution().getMaximumXor(nums, maximumBit)));
    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] resultArray = new int[nums.length];
        int maxNum = (2 << (maximumBit - 1)) - 1;
        int cumulativeXor = 0;
        for (int i = 0; i < nums.length; i++) {
            cumulativeXor ^= nums[i];
            resultArray[resultArray.length - i - 1] = cumulativeXor ^ maxNum;
        }
        return resultArray;
    }
}

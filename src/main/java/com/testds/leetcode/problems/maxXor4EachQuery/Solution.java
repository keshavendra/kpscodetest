//https://leetcode.com/problems/maximum-xor-for-each-query/
package com.testds.leetcode.problems.maxXor4EachQuery;

public class Solution {
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

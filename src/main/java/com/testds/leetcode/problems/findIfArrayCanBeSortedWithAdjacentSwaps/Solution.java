//https://leetcode.com/problems/find-if-array-can-be-sorted/
package com.testds.leetcode.problems.findIfArrayCanBeSortedWithAdjacentSwaps;

public class Solution {
    public boolean canSortArray(int[] nums) {
        int[] countNum = new int[32];
        int count, i;
        for (int num : nums) {
            count = findNumOfSetBits(num);
            for (i = 0; i < countNum.length; i++) {
                if (i != count
                        && countNum[i] != 0
                        && countNum[i] > num)
                    return false;
            }
            if (countNum[count] < num) {
                countNum[count] = num;
            }
        }
        return true;
    }

    private int findNumOfSetBits(int num) {
        int setBits = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                setBits++;
            }
        }
        return setBits;
    }
}

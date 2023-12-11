//https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
package com.testds.leetcode.problems.findSpecialIntegerMoreThan25;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        if (arr.length < 4)
            return arr[0];
        int currFreq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currFreq++;
                if (currFreq > arr.length / 4) {
                    return arr[i];
                }
            } else {
                currFreq = 1;
            }
        }
        return arr[arr.length - 1];
    }
}

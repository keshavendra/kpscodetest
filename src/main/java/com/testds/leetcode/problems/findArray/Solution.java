//https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
package com.testds.leetcode.problems.findArray;

public class Solution {
    public int[] findArray(int[] pref) {
        int xorTillPoint = 0;
        int[] arr = new int[pref.length];
        xorTillPoint ^= pref[0];
        arr[0] = xorTillPoint;
        for (int i = 1; i < pref.length; i++) {
            arr[i] = xorTillPoint ^ pref[i];
            xorTillPoint ^= arr[i];
        }
        return arr;
    }
}

//https://leetcode.com/problems/find-the-pivot-integer/
package com.testds.leetcode.problems.findThePivotInteger;

public class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int leftSum = 0;
        int pivot = -1, index = 1;
        while (leftSum < totalSum && index <= n) {
            if (leftSum + index == totalSum) {
                pivot = index;
                break;
            }
            leftSum += index;
            totalSum -= index;
            index++;
        }
        return pivot;
    }
}

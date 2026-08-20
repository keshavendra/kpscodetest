//https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
package com.testds.leetcode.problems.distributeElementsIntoTwoArraysI;

public class Solution {
    public int[] resultArray(int[] nums) {
        int[] result = new int[nums.length];
        int rIndex = 0, currentIndex = 2, ar2Index = 1;
        result[rIndex] = nums[0];
        while (currentIndex < nums.length) {
            if (result[rIndex] > nums[ar2Index]) {
                result[rIndex + 1] = nums[currentIndex];
                rIndex++;
            } else {
                nums[ar2Index] *= (-1);
                ar2Index = currentIndex;
            }
            currentIndex++;
        }
        nums[ar2Index] *= (-1);
        rIndex++;
        for (currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] < 0) {
                nums[currentIndex] *= (-1);
                result[rIndex++] = nums[currentIndex];
            }
        }
        return result;
    }
}

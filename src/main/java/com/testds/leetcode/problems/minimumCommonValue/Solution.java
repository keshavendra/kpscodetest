//https://leetcode.com/problems/minimum-common-value/
package com.testds.leetcode.problems.minimumCommonValue;

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int firstArrayPointer = 0, secondArrayPointer = 0;
        int commonInteger = -1;
        while (firstArrayPointer < nums1.length && secondArrayPointer < nums2.length) {
            if (nums1[firstArrayPointer] == nums2[secondArrayPointer]) {
                commonInteger = nums1[firstArrayPointer];
                break;
            }
            if (nums1[firstArrayPointer] < nums2[secondArrayPointer]) {
                firstArrayPointer++;
            } else {
                secondArrayPointer++;
            }
        }
        return commonInteger;
    }
}

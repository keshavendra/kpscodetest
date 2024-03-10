//https://leetcode.com/problems/intersection-of-two-arrays/
package com.testds.leetcode.problems.intersectionOfArrays;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        for (int num : nums1) {
            freq[num] = 1;
        }
        int count = 0;
        for (int num : nums2) {
            if (freq[num] == 1) {
                freq[num] = 2;
                count++;
            }
        }
        int[] resultArray = new int[count];
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] == 2) {
                resultArray[--count] = i;
            }
        }
        return resultArray;
    }
}

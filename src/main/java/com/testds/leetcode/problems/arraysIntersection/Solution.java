//https://leetcode.com/problems/intersection-of-two-arrays-ii/
package com.testds.leetcode.problems.arraysIntersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointerNums1 = 0, pointerNums2 = 0;
        List<Integer> intersection = new ArrayList<>();
        while (pointerNums1 < nums1.length && pointerNums2 < nums2.length) {
            if (nums1[pointerNums1] == nums2[pointerNums2]) {
                intersection.add(nums1[pointerNums1]);
                pointerNums1++;
                pointerNums2++;
            } else if (nums1[pointerNums1] < nums2[pointerNums2]) {
                pointerNums1++;
            } else {
                pointerNums2++;
            }
        }
        int[] num = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            num[i] = intersection.get(i);
        }
        return num;
    }
}

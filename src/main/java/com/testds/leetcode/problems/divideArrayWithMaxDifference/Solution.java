//https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/
package com.testds.leetcode.problems.divideArrayWithMaxDifference;

import java.util.Arrays;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int numOfRowsInResultArray = nums.length / 3;
        numOfRowsInResultArray += (nums.length % 3 == 0 ? 0 : 1);
        int[][] resultArray = new int[numOfRowsInResultArray][3];
        for (int i = 0; i < nums.length; ) {
            int[] subArray = new int[(i + 3 < nums.length ? 3 : nums.length - i)];
            for (int j = 0; j < subArray.length; j++, i++) {
                subArray[j] = nums[i];
            }
            if (subArray[subArray.length - 1] - subArray[0] > k) {
                return new int[0][0];
            }
            resultArray[(i - 1) / 3] = subArray;
        }
        return resultArray;
    }
}

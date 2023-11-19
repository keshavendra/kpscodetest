//https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal
package com.testds.leetcode.problems.reductionOperations;

import java.util.Arrays;

public class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int numOfOperations = 0;
        int min = nums[0];
        for (int i = nums.length - 1; i > 0; i--) {
            int max = nums[i];
            if (max == min)
                break;
            int secondMax = nums[i - 1];
            if (max == secondMax)
                continue;
            numOfOperations += (nums.length - i);
        }
        return numOfOperations;
    }
}

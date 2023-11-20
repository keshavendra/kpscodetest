//https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal
package com.testds.leetcode.problems.reductionOperations;

import java.util.Arrays;

public class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int numOfOperations = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[0])
                break;
            if (nums[i] == nums[i - 1])
                continue;
            numOfOperations += (nums.length - i);
        }
        return numOfOperations;
    }
}

//https://leetcode.com/problems/combination-sum-iv
package com.testds.leetcode.problems.combinationSumIV;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    int[] sumArray = null;
    int[] inputArray = null;

    public int combinationSum4(int[] nums, int target) {
        int combinations = 0;
        sumArray = new int[target];
        IntStream.range(0, target).forEach(x -> sumArray[x] = -1);
        Arrays.sort(nums);
        inputArray = nums;
        for (int i : nums) {
            if (i > target)
                break;
            if (i == target)
                combinations++;
            else
                combinations += combinationSum4(target - i);
        }
        return combinations;
    }

    public int combinationSum4(int target) {
        if (sumArray[target] != -1)
            return sumArray[target];
        int count = 0;
        for (int i : inputArray) {
            if (i > target)
                break;
            if (i == target)
                count++;
            else {
                count += combinationSum4(target - i);
            }
        }
        sumArray[target] = count;
        return count;
    }
}

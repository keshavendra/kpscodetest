//https://leetcode.com/problems/maximum-erasure-value/
package com.testds.leetcode.problems.maximumUniqueSubarray;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int startIndex = 0, sum = 0, localSum;
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        numToIndexMap.put(nums[0], startIndex);
        int[] cumulativeSums = new int[nums.length];
        cumulativeSums[0] = nums[0];
        IntStream.range(1, cumulativeSums.length).forEach(i -> cumulativeSums[i] = cumulativeSums[i - 1] + nums[i]);
        for (int i = 1; i < nums.length; i++) {
            if (numToIndexMap.containsKey(nums[i])) {
                if (numToIndexMap.get(nums[i]) < startIndex) {
                    numToIndexMap.put(nums[i], i);
                } else {
                    localSum = cumulativeSums[i - 1] - (startIndex == 0 ? 0 : cumulativeSums[startIndex - 1]);
                    if (localSum > sum) {
                        sum = localSum;
                    }
                    startIndex = numToIndexMap.get(nums[i]) + 1;
                    numToIndexMap.put(nums[i], i);
                }
            } else {
                numToIndexMap.put(nums[i], i);
            }
        }
        localSum = cumulativeSums[nums.length - 1] - (startIndex == 0 ? 0 : cumulativeSums[startIndex - 1]);
        if (localSum > sum) {
            sum = localSum;
        }
        return sum;
    }
}

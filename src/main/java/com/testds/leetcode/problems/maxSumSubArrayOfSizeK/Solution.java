//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
package com.testds.leetcode.problems.maxSumSubArrayOfSizeK;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        Map<Integer, Integer> singleFrequencyMap = new HashMap<>();
        Map<Integer, Integer> moreThanOneFrequencyMap = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            sum += nums[i];
            if (moreThanOneFrequencyMap.containsKey(nums[i])) {
                moreThanOneFrequencyMap.put(nums[i], moreThanOneFrequencyMap.get(nums[i]) + 1);
            } else if (singleFrequencyMap.containsKey(nums[i])) {
                moreThanOneFrequencyMap.put(nums[i], singleFrequencyMap.get(nums[i]) + 1);
                singleFrequencyMap.remove(nums[i]);
            } else {
                singleFrequencyMap.put(nums[i], 1);
            }
        }

        long maxSum = 0;
        for (int i = k - 1; i < nums.length; i++) {
            sum += nums[i];
            if (moreThanOneFrequencyMap.containsKey(nums[i])) {
                moreThanOneFrequencyMap.put(nums[i], moreThanOneFrequencyMap.get(nums[i]) + 1);
            } else if (singleFrequencyMap.containsKey(nums[i])) {
                moreThanOneFrequencyMap.put(nums[i], singleFrequencyMap.get(nums[i]) + 1);
                singleFrequencyMap.remove(nums[i]);
            } else {
                singleFrequencyMap.put(nums[i], 1);
            }
            if (moreThanOneFrequencyMap.isEmpty() && sum > maxSum) {
                maxSum = sum;
            }
            //readjust sums
            int toRemove = nums[i - k + 1];
            if (moreThanOneFrequencyMap.containsKey(toRemove)) {
                if (moreThanOneFrequencyMap.get(toRemove) > 2) {
                    moreThanOneFrequencyMap.put(toRemove, moreThanOneFrequencyMap.get(toRemove) - 1);
                } else {
                    moreThanOneFrequencyMap.remove(toRemove);
                    singleFrequencyMap.put(toRemove, 1);
                }
            } else {
                singleFrequencyMap.remove(toRemove);
            }
            sum -= toRemove;
        }
        return maxSum;
    }
}

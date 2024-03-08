//https://leetcode.com/problems/count-elements-with-maximum-frequency/
package com.testds.leetcode.problems.countElementWithMaximumFrequency;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequency = new int[101];
        for (int num : nums) {
            frequency[num] += 1;
        }
        int maxFrequency = 0;
        for (int num : frequency) {
            if (num > maxFrequency)
                maxFrequency = num;
        }
        int sum = 0;
        for (int num : frequency) {
            if (num == maxFrequency)
                sum += num;
        }
        return sum;
    }
}

//https://leetcode.com/problems/maximize-happiness-of-selected-children/
package com.testds.leetcode.problems.maximumHappinessSum;

import java.util.Arrays;

public class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long maxSum = 0;
        Arrays.sort(happiness);
        for (int i = 0; i < k; i++) {
            int num = happiness[happiness.length - 1 - i] - i;
            if (num <= 0)
                break;
            maxSum += num;
        }
        return maxSum;
    }
}

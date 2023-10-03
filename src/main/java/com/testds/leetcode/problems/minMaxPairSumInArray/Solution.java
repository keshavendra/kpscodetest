//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
/*Constraints:

        n == nums.length
        2 <= n <= 105
        n is even.
        1 <= nums[i] <= 105
*/

package com.testds.leetcode.problems.minMaxPairSumInArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        return IntStream
                .range(0, nums.length / 2)
                .map(x -> nums[x] + nums[nums.length - x - 1])
                .max()
                .orElse(0);
    }

    public int minPairSum1(int[] nums) {
        Arrays.sort(nums);
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length / 2; i++) {
            int localSum = nums[i] + nums[nums.length - i - 1];
            if (localSum > maxSum)
                maxSum = localSum;
        }
        return maxSum;
    }
}

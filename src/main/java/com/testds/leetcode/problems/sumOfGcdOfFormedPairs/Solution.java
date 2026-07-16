//https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/
package com.testds.leetcode.problems.sumOfGcdOfFormedPairs;

import java.util.Arrays;

public class Solution {
    public long gcdSum(int[] nums) {
        //keep variable max and re-use the nums array to find out
        //gcd(nums[i],max)
        //for index 0, it will always be the same number
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            nums[i] = max == nums[i] ? max : calculateGcd(max, nums[i]);
        }

        //sort the array
        Arrays.sort(nums);

        //sum variable
        var sum = 0L;

        //iterating till the mid-element
        for (int i = 0; i < nums.length / 2; i++) {
            sum += calculateGcd(nums[i], nums[nums.length - 1 - i]);
        }
        return sum;
    }

    private int calculateGcd(int b, int a) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

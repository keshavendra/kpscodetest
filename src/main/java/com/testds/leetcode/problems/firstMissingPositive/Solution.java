//https://leetcode.com/problems/first-missing-positive/
package com.testds.leetcode.problems.firstMissingPositive;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        //setting all the zero and negative value to nums.length+1
        IntStream.range(0, nums.length)
                .filter(i -> nums[i] <= 0)
                .forEach(i -> nums[i] = nums.length + 1);

        //setting all the indexes which have appeared as negative value
        Arrays.stream(nums)
                .filter(num -> num != 0)
                .filter(num -> Math.abs(num) <= nums.length)
                .filter(num -> nums[Math.abs(num) - 1] > 0)
                .forEach(num -> nums[Math.abs(num) - 1] = -nums[Math.abs(num) - 1]);

        //returning the first index which has positive value or the length of array + 1
        return IntStream.range(0, nums.length)
                .filter(num -> nums[num] > 0)
                .map(num -> num + 1)
                .findFirst()
                .orElse(nums.length + 1);
    }
}

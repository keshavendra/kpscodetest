//https://leetcode.com/problems/132-pattern/
package com.testds.leetcode.problems.pattern132;

import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        int[] minimumInLeft = new int[nums.length];
        int min = nums[0];
        minimumInLeft[0] = min;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            minimumInLeft[i] = min;
        }
        Stack<Integer> numbersInRight = new Stack<>();
        for (int j = nums.length - 1; j >= 0; j--) {
            if (minimumInLeft[j] < nums[j]) {
                while (!numbersInRight.isEmpty() && numbersInRight.peek() <= minimumInLeft[j]) {
                    numbersInRight.pop();
                }
                if (!numbersInRight.isEmpty() && numbersInRight.peek() < nums[j])
                    return true;
            }
            numbersInRight.push(nums[j]);
        }
        return false;
    }
}

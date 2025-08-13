//https://leetcode.com/problems/trapping-rain-water/
package com.testds.leetcode.problems.trappedWater;

import java.util.Stack;

public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 1) {
            return 0;
        }
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < height.length - 1 && height[i] < height[i + 1]) {
            i++;
        }
        if (i == height.length - 1) {
            return 0;
        }
        stack.push(i);
        i++;
        int trappedWater = 0, temp;
        while (i < height.length) {
            if (stack.isEmpty() || height[stack.peek()] > height[i]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {
                    temp = stack.pop();
                    if (!stack.isEmpty()) {
                        trappedWater += (Math.min(height[stack.peek()], height[i]) - height[temp]) * (i - stack.peek() - 1);
                        height[temp] = Math.min(height[stack.peek()], height[i]);
                    }
                }
                stack.push(i);
            }
            i++;
        }
        return trappedWater;
    }
}

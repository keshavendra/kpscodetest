//https://leetcode.com/problems/daily-temperatures
package com.testds.leetcode.problems.dailyTemperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] nextWarmDay = new int[temperatures.length];
        nextWarmDay[temperatures.length - 1] = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(temperatures.length - 1);
        for (int i = temperatures.length - 2; i >= 0; i--) {
            int temp = temperatures[i];
            while (!stack.isEmpty()) {
                if (temperatures[stack.peek()] <= temp) {
                    stack.pop();
                } else {
                    nextWarmDay[i] = stack.peek() - i;
                    break;
                }
            }
            stack.push(i);
        }
        return nextWarmDay;
    }
}

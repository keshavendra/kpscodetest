//https://leetcode.com/problems/evaluate-reverse-polish-notation/
package com.testds.leetcode.problems.evalReversePolishNotation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        final Set<String> OPERATORS_SET = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (OPERATORS_SET.contains(str)) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                int result = 0;
                switch (str) {
                    case "+":
                        result = val1 + val2;
                        break;
                    case "-":
                        result = val1 - val2;
                        break;
                    case "*":
                        result = val1 * val2;
                        break;
                    case "/":
                        result = val1 / val2;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}

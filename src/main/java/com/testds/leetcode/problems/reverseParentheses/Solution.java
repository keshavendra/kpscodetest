//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
package com.testds.leetcode.problems.reverseParentheses;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (; index < s.length() && s.charAt(index) != '('; index++) {
            sb.append(s.charAt(index));
        }
        Queue<Character> auxStack = new LinkedList<>();
        for (; index < s.length(); index++) {
            if (s.charAt(index) != ')') {
                stack.push(s.charAt(index));
            } else {
                while (stack.peek() != '(') {
                    auxStack.add(stack.pop());
                }
                stack.pop();
                while (!auxStack.isEmpty()) {
                    stack.push(auxStack.poll());
                }
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while (!stack.isEmpty()) {
            sb1.append(stack.pop());
        }
        return sb.append(sb1.reverse()).toString();
    }
}

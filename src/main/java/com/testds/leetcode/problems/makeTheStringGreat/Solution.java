//https://leetcode.com/problems/make-the-string-great/
package com.testds.leetcode.problems.makeTheStringGreat;

import java.util.Stack;

public class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        stack.peek();
        char topChar, currentChar;
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                topChar = stack.peek();
                currentChar = s.charAt(i);
                int diff = topChar - currentChar;
                if (diff == 32 || diff == -32) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        final StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

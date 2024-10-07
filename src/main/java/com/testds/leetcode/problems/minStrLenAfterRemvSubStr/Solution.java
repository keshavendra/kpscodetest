//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/
package com.testds.leetcode.problems.minStrLenAfterRemvSubStr;

import java.util.Stack;

public class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if ((ch == 'D' && stack.peek() == 'C') ||
                        (ch == 'B' && stack.peek() == 'A')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.size();
    }
}

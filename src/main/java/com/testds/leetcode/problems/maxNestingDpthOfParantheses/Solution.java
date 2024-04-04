//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
package com.testds.leetcode.problems.maxNestingDpthOfParantheses;

import java.util.Stack;

public class Solution {
    public int maxDepth(String s) {
        Stack<Character> cStack = new Stack<>();
        int maxDepth = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    cStack.push(ch);
                    break;
                case ')':
                    if (cStack.size() > maxDepth)
                        maxDepth = cStack.size();
                    cStack.pop();
                    break;
                default:
            }
        }
        return maxDepth;
    }
}

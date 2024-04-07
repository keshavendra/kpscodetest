//https://leetcode.com/problems/valid-parenthesis-string/
package com.testds.leetcode.problems.checkValidString;

import java.util.Stack;

public class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> paranthesisStack = new Stack<>();
        Stack<Integer> astrikStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    paranthesisStack.push(i);
                    break;
                case '*':
                    astrikStack.push(i);
                    break;
                default:
                    if (!paranthesisStack.isEmpty()) {
                        paranthesisStack.pop();
                    } else if (!astrikStack.isEmpty()) {
                        astrikStack.pop();
                    } else
                        return false;
            }
        }
        while (!paranthesisStack.isEmpty()) {
            if (astrikStack.isEmpty())
                return false;
            if (paranthesisStack.pop() > astrikStack.pop())
                return false;
        }
        return true;
    }
}

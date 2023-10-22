//https://leetcode.com/problems/backspace-string-compare
package com.testds.leetcode.problems.backspaceCompare;

import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#')
                sStack.push(ch);
            else if (!sStack.isEmpty())
                sStack.pop();
        }
        for (int index = 0; index < t.length(); index++) {
            char ch = t.charAt(index);
            if (ch != '#')
                tStack.push(ch);
            else if (!tStack.isEmpty())
                tStack.pop();
        }
        if (sStack.size() == tStack.size()) {
            while (!sStack.isEmpty()) {
                if (sStack.pop() != tStack.pop())
                    return false;
            }
        }
        return sStack.size() == tStack.size();
    }
}

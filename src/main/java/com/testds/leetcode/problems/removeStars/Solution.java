//https://leetcode.com/problems/removing-stars-from-a-string/
package com.testds.leetcode.problems.removeStars;

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {
        Stack<Character> sStack = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (ch != '*')
                sStack.push(ch);
            else if (!sStack.isEmpty())
                sStack.pop();
        }

        StringBuilder sb = new StringBuilder();
        while (!sStack.isEmpty()) {
            sb.append(sStack.pop());
        }
        return sb.reverse().toString();
    }
}

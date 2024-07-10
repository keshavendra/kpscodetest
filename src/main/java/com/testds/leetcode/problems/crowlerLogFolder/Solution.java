//https://leetcode.com/problems/crawler-log-folder/
package com.testds.leetcode.problems.crowlerLogFolder;

import java.util.Stack;

public class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String str : logs) {
            if (!str.equals("./")) {
                if (str.equals("../")) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else {
                    stack.push(str);
                }
            }
        }
        return stack.size();
    }
}

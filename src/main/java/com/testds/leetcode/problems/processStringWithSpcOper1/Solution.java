//https://leetcode.com/problems/process-string-with-special-operations-i/
package com.testds.leetcode.problems.processStringWithSpcOper1;

public class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '*':
                    if (!sb.isEmpty()) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    break;
                case '#':
                    sb.append(sb);
                    break;
                case '%':
                    sb.reverse();
                    break;
                default:
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}

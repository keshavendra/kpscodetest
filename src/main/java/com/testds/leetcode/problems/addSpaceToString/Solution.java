//https://leetcode.com/problems/adding-spaces-to-a-string/
package com.testds.leetcode.problems.addSpaceToString;

public class Solution {
    public String addSpaces(String s, int[] spaces) {
        int p = 0;
        StringBuilder sb = new StringBuilder();
        for (int sp : spaces) {
            sb.append(s, p, sp).append(" ");
            p = sp;
        }
        if (p < s.length()) {
            sb.append(s, p, s.length());
        }
        return sb.toString();
    }
}

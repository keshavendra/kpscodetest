//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
package com.testds.leetcode.problems.minAddToMakeValidParanthesis;

public class Solution {
    public int minAddToMakeValid(String s) {
        int openLeftBrackets = 0, unbalancedRightBrackets = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openLeftBrackets++;
            } else {
                if (openLeftBrackets == 0) {
                    unbalancedRightBrackets++;
                } else {
                    openLeftBrackets--;
                }
            }
        }
        return openLeftBrackets + unbalancedRightBrackets;
    }
}

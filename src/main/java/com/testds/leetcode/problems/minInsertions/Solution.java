//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
package com.testds.leetcode.problems.minInsertions;

public class Solution {
    public int minInsertions(String s) {
        int insert = 0, needClosing = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (needClosing % 2 == 1) {
                    //there is some pair which is closed with just 1 ) and hence should be counted as missing and to insert
                    insert++;
                    needClosing--;
                }
                needClosing += 2;
            } else {
                //this is a ) paranthesis
                needClosing--;
                //if it is negative, then possibly we have hit a lone right paranthesis
                if (needClosing < 0) {
                    insert++;
                    //keeping it for the next right paranthesis
                    needClosing = 1;
                }
            }
        }
        return insert + needClosing;
    }
}

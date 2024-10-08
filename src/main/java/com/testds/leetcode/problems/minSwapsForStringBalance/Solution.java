//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
package com.testds.leetcode.problems.minSwapsForStringBalance;

public class Solution {
    public int minSwaps(String s) {
        int openBrackets = 0, index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == '[') {
                openBrackets++;
            } else {
                if (openBrackets > 0) {
                    openBrackets--;
                }
            }
            index++;
        }
        return (openBrackets + 1) / 2;
    }
}

//https://leetcode.com/problems/largest-odd-number-in-string/
package com.testds.leetcode.problems.largestOddNumberSubstring;

public class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            switch (num.charAt(i)) {
                case '1':
                case '3':
                case '5':
                case '7':
                case '9':
                    return num.substring(0, i + 1);
            }
        }
        return "";
    }
}

//https://leetcode.com/problems/determine-if-string-halves-are-alike/
package com.testds.leetcode.problems.halvesAreAlike;

public class Solution {
    public boolean halvesAreAlike(String s) {
        int i = 0;
        int count = 0;
        for (; i < s.length() / 2; i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:

            }
        }
        for (; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count--;
                    break;
                default:

            }
        }
        return count == 0;
    }
}

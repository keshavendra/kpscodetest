//https://leetcode.com/problems/smallest-palindromic-rearrangement-i
package com.testds.leetcode.problems.smalstPalndromRearr1;

public class Solution {
    public String smallestPalindrome(String s) {
        int[] f = new int[26];
        for (char c : s.toCharArray()) {
            f[c - 'a']++;
        }
        char mid = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < f.length; i++) {
            if (f[i] % 2 == 1) {
                mid = (char) (i + 'a');
                f[i]--;
            }
            sb.repeat(String.valueOf((char) (i + 'a')), Math.max(0, f[i] / 2));
        }
        if (mid == ' ') {
            return sb.toString()+sb.reverse();
        }
        return sb.toString() + mid + sb.reverse();
    }
}

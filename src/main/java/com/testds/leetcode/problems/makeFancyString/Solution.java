//https://leetcode.com/problems/delete-characters-to-make-fancy-string/
package com.testds.leetcode.problems.makeFancyString;

public class Solution {

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (sb.length() >= 2) {
                if (!(sb.charAt(sb.length() - 1) == c && sb.charAt(sb.length() - 2) == c))
                    sb.append(c);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}

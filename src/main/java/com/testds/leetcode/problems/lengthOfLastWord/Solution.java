//https://leetcode.com/problems/length-of-last-word/
package com.testds.leetcode.problems.lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        // int length = 0;
        int index = s.length() - 1;
        while (index >= 0) {
            char c = s.charAt(index);
            if (c == ' ' || index == 0) {
                if (c == ' ')
                    return s.length() - index - 1;
                else
                    return s.length();
            }
            // length++;
            index--;
        }
        return 0;
    }
}

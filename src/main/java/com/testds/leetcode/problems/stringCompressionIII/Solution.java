//https://leetcode.com/problems/string-compression-iii/
package com.testds.leetcode.problems.stringCompressionIII;

public class Solution {
    public String compressedString(String word) {
        int count = 0;
        char ch = word.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            } else {
                appendCharacter(ch, count, sb);
                ch = word.charAt(i);
                count = 1;
            }
        }
        appendCharacter(ch, count, sb);
        return sb.toString();
    }

    private void appendCharacter(char ch, int count, StringBuilder sb) {
        while (count > 9) {
            sb
                    .append(9)
                    .append(ch);
            count -= 9;
        }
        if (count != 0) {
            sb
                    .append(count)
                    .append(ch);
        }
    }
}

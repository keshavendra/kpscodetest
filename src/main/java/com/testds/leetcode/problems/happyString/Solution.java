//https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n
package com.testds.leetcode.problems.happyString;

public class Solution {
    public String getHappyString(int n, int k) {
        if (n == 1 && k > 3)
            return "";
        int rangeEnd = 3 * ((int) Math.pow(2, n - 1));
        if (k > rangeEnd)
            return "";
        StringBuilder sb = new StringBuilder();
        int rangeStart = 1;
        char ch;
        if (k <= rangeEnd / 3) {
            sb.append("a");
            ch = 'a';
            rangeEnd /= 3;
        } else if (k <= (2 * rangeEnd) / 3) {
            sb.append("b");
            ch = 'b';
            rangeStart = (rangeEnd / 3) + 1;
            rangeEnd /= 3;
            rangeEnd *= 2;
        } else {
            sb.append("c");
            ch = 'c';
            rangeStart = 2 * (rangeEnd / 3) + 1;
        }
        char current;
        int mid;
        while (rangeStart < rangeEnd) {
            mid = rangeStart + (rangeEnd - rangeStart) / 2;
            if (k > mid) {
                rangeStart = mid + 1;
                current = getNextToNextChar(ch);

            } else {
                rangeEnd = mid;
                current = getNextChar(ch);
            }
            sb.append(current);
            ch = current;
        }
        return sb.toString();
    }

    private char getNextChar(char ch) {
        if (ch == 'a')
            return 'b';
        else
            return 'a';
    }

    private char getNextToNextChar(char ch) {
        if (ch == 'a' || ch == 'b')
            return 'c';
        else
            return 'b';

    }
}

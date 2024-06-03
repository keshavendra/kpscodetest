//https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
package com.testds.leetcode.problems.appendCharsToStrToMkSubseq;

public class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }
        int len = 0;
        if (tIndex < t.length()) {
            len = t.length() - tIndex;
        }
        return len;
    }
}

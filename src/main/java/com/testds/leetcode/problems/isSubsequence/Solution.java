//https://leetcode.com/problems/is-subsequence/
package com.testds.leetcode.problems.isSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int indexS = 0, indexT = 0;
        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
            }
            indexT++;
        }
        return indexS == s.length();
    }
}

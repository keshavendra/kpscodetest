//https://leetcode.com/problems/find-the-original-typed-string-i/
package com.testds.leetcode.problems.possibleStringCount1;

public class Solution {
    public int possibleStringCount(String word) {
        int totalWays = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                totalWays++;
            }
        }
        return totalWays;
    }
}

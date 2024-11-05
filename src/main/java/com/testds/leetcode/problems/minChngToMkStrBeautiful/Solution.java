//https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
package com.testds.leetcode.problems.minChngToMkStrBeautiful;

public class Solution {
    public int minChanges(String s) {
        int minChanges = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                minChanges++;
            }
        }
        return minChanges;
    }
}

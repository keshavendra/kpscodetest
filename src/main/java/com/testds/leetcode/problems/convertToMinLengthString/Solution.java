//https://leetcode.com/problems/minimum-length-of-string-after-operations/
package com.testds.leetcode.problems.convertToMinLengthString;

import java.util.Arrays;

public class Solution {
    public int minimumLength(String s) {
        int[] charLength = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charLength[s.charAt(i) - 'a']++;
            if (charLength[s.charAt(i) - 'a'] == 3) {
                charLength[s.charAt(i) - 'a'] = 1;
            }
        }
        return Arrays.stream(charLength).sum();
    }
}

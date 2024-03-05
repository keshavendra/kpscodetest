//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
package com.testds.leetcode.problems.minimumLengthOfString;

public class Solution {
    public int minimumLength(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                while (l < r && s.charAt(l) == s.charAt(l + 1)) {
                    l++;
                }
                while (l < r && s.charAt(r) == s.charAt(r - 1)) {
                    r--;
                }
            } else {
                break;
            }
            l++;
            r--;
        }
        return r >= l ? r - l + 1 : 0;
    }
}

//https://leetcode.com/problems/construct-k-palindrome-strings/
package com.testds.leetcode.problems.canConstructPalindromicStrings;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        if (s.length() == k)
            return true;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }

        return set.size() <= k;
    }
}

//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal
package com.testds.leetcode.problems.areAlmostEqual;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }

        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Set<Integer>> mapCharToIndexesS1 = new HashMap<>();
        Map<Character, Set<Integer>> mapCharToIndexesS2 = new HashMap<>();
        int unmatched = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                unmatched++;
                if (!mapCharToIndexesS1.containsKey(s1.charAt(i))) {
                    mapCharToIndexesS1.put(s1.charAt(i), new HashSet<>());
                }
                mapCharToIndexesS1.get(s1.charAt(i)).add(i);
                if (!mapCharToIndexesS2.containsKey(s2.charAt(i))) {
                    mapCharToIndexesS2.put(s2.charAt(i), new HashSet<>());
                }
                mapCharToIndexesS2.get(s2.charAt(i)).add(i);
            }
            if (unmatched > 2) {
                return false;
            }
        }
        if (unmatched == 0) {
            return true;
        }

        return mapCharToIndexesS1
                .keySet()
                .containsAll(mapCharToIndexesS2.keySet())
                && unmatched == 2;

    }
}

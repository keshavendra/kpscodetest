//https://leetcode.com/problems/isomorphic-strings/
package com.testds.leetcode.problems.isomorphicStrings;

import java.util.stream.IntStream;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == t.length()) {
            short[] charMappingArraySource = new short[256];
            short[] charMappingArrayTarget = new short[256];
            IntStream.range(0, 256).forEach(x -> {
                charMappingArraySource[x] = -1;
                charMappingArrayTarget[x] = -1;
            });
            for (int i = 0; i < s.length(); i++) {
                char sourceChar = s.charAt(i);
                char targetChar = t.charAt(i);
                if (charMappingArraySource[sourceChar] == -1 && charMappingArrayTarget[targetChar] == -1) {
                    charMappingArraySource[sourceChar] = (short) (targetChar);
                    charMappingArrayTarget[targetChar] = (short) (sourceChar);
                } else {
                    if (charMappingArraySource[sourceChar] != (targetChar)
                            || charMappingArrayTarget[targetChar] != (sourceChar)) {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
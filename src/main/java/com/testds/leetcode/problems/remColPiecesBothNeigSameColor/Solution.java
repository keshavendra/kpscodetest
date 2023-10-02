//https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
package com.testds.leetcode.problems.remColPiecesBothNeigSameColor;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean winnerOfGame(String colors) {
        Map<Character, Integer> chancesCount = new HashMap<>();
        char prevChar = colors.charAt(0);
        for (int i = 1; i < colors.length(); i++) {
            if (prevChar == colors.charAt(i)) {
                int count = 2;
                prevChar = colors.charAt(i);
                i++;
                while (i < colors.length() && prevChar == colors.charAt(i)) {
                    prevChar = colors.charAt(i);
                    count++;
                    i++;
                }
                if (i > 2) {
                    chancesCount.put(prevChar, chancesCount.getOrDefault(prevChar, 0) + count - 2);
                }
                if (i < colors.length())
                    prevChar = colors.charAt(i);
            } else {
                prevChar = colors.charAt(i);
            }
        }
        return chancesCount.getOrDefault('A', 0) > chancesCount.getOrDefault('B', 0);
    }
}

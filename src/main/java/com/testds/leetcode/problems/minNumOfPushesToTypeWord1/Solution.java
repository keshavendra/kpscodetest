//https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/
package com.testds.leetcode.problems.minNumOfPushesToTypeWord1;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Solution {
    public int minimumPushes(String word) {
        int[] f = new int[26];
        for (int i = 0; i < word.length(); i++) {
            f[word.charAt(i) - 'a']++;
        }
        IntFunction<Integer> s = value -> switch (value / 8) {
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 3;
            default -> 4;
        };
        Arrays.sort(f);
        int cost = 0;
        for (int i = 0; i < 26; i++) {
            if (f[25 - i] == 0)
                break;
            cost += s.apply(i);
        }
        return cost;
    }
}

//https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
package com.testds.leetcode.problems.minNumOfPushesToTypeWord;

import java.util.Arrays;

public class Solution {
    public int minimumPushes(String word) {
        int[] charFrequency = new int[26];
        int index = 0;
        for (; index < word.length(); index++) {
            charFrequency[word.charAt(index) - 'a']++;
        }
        Arrays.sort(charFrequency);
        int pushes = 0;
        index = 25;
        for (; index >= 0; index--) {
            if (charFrequency[index] == 0)
                break;
            pushes += (((25 - index) / 8) + 1) * charFrequency[index];
        }
        return pushes;
    }
}

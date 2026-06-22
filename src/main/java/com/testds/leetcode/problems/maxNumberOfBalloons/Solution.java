//https://leetcode.com/problems/maximum-number-of-balloons
package com.testds.leetcode.problems.maxNumberOfBalloons;

import java.util.stream.IntStream;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        //balloon
        final int[] charFrequency = new int[5];
        IntStream.range(0, text.length()).forEach(i -> {
            switch (text.charAt(i)) {
                case 'b' -> charFrequency[0]++;
                case 'a' -> charFrequency[1]++;
                case 'l' -> charFrequency[2]++;
                case 'o' -> charFrequency[3]++;
                case 'n' -> charFrequency[4]++;
            }
        });

        return IntStream.range(0, 5)
                .map(i -> (
                        switch (i) {
                            case 0, 1, 4 -> charFrequency[i];
                            case 2, 3 -> charFrequency[i] / 2;
                            default -> i;
                        }
                ))
                .min()
                .orElse(0);
    }
}

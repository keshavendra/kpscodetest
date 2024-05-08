//https://leetcode.com/problems/relative-ranks/
package com.testds.leetcode.problems.findRelativeRanks;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        String[] ranks = new String[score.length];
        int i = 0;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (i == 0) {
                ranks[mapEntry.getValue()] = "Gold Medal";
            } else if (i == 1) {
                ranks[mapEntry.getValue()] = "Silver Medal";
            } else if (i == 2) {
                ranks[mapEntry.getValue()] = "Bronze Medal";
            } else {
                ranks[mapEntry.getValue()] = String.valueOf(i + 1);
            }
            i++;
        }
        return ranks;
    }
}

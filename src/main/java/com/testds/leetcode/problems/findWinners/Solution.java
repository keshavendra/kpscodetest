//https://leetcode.com/problems/find-players-with-zero-or-one-losses
package com.testds.leetcode.problems.findWinners;

import java.util.*;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> noLoss = new HashSet<>();
        Set<Integer> singleLost = new HashSet<>();
        Set<Integer> moreThan1Loss = new HashSet<>();
        for (int[] match : matches) {
            Integer winner = match[0];
            Integer loser = match[1];
            if (!moreThan1Loss.contains(winner)) {
                if (!singleLost.contains(winner)) {
                    noLoss.add(winner);
                }
            }
            if (!moreThan1Loss.contains(loser)) {
                if (!singleLost.contains(loser)) {
                    noLoss.remove(loser);
                    singleLost.add(loser);
                } else {
                    singleLost.remove(loser);
                    moreThan1Loss.add(loser);
                }
            }
        }
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> noLossList = new ArrayList<>(noLoss);
        noLossList.sort(Comparator.naturalOrder());

        List<Integer> singleLoss = new ArrayList<>(singleLost);
        singleLoss.sort(Comparator.naturalOrder());
        resultList.add(0, noLossList);
        resultList.add(1, singleLoss);
        return resultList;
    }
}

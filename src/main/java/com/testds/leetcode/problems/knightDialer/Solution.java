//https://leetcode.com/problems/knight-dialer
package com.testds.leetcode.problems.knightDialer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final Integer MOD = 1000000007;

    public int knightDialer(int n) {
        if (n == 1)
            return 10;
        final Map<Integer, List<Integer>> sourceToDestList = new HashMap<>();
        sourceToDestList.put(0, Arrays.asList(4, 6));
        sourceToDestList.put(1, Arrays.asList(8, 6));
        sourceToDestList.put(2, Arrays.asList(7, 9));
        sourceToDestList.put(3, Arrays.asList(4, 8));
        sourceToDestList.put(4, Arrays.asList(3, 9, 0));
        sourceToDestList.put(6, Arrays.asList(1, 7, 0));
        sourceToDestList.put(7, Arrays.asList(6, 2));
        sourceToDestList.put(8, Arrays.asList(1, 3));
        sourceToDestList.put(9, Arrays.asList(4, 2));

        int[] prevNumToCountArray = new int[10];

        for (int numberOfTimes = 2; numberOfTimes <= n; numberOfTimes++) {
            int[] currentNumToCountNumArray = new int[10];
            for (Map.Entry<Integer, List<Integer>> entry : sourceToDestList.entrySet()) {
                for (Integer i : entry.getValue()) {
                    currentNumToCountNumArray[entry.getKey()] = (currentNumToCountNumArray[entry.getKey()] + (prevNumToCountArray[i] == 0 ? 1 : prevNumToCountArray[i])) % MOD;
                }
            }
            prevNumToCountArray = currentNumToCountNumArray;
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = (total + prevNumToCountArray[i]) % MOD;
        }
        return total;

    }
}

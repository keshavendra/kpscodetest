//https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/
package com.testds.leetcode.problems.numOfDistinctColorBalls;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColorNumberMap = new HashMap<>();
        Map<Integer, Integer> colorToCountOfBalls = new HashMap<>();
        int[] result = new int[queries.length];
        int num, color;
        for (int i = 0; i < queries.length; i++) {
            num = queries[i][0];
            if (ballToColorNumberMap.containsKey(num)) {
                color = ballToColorNumberMap.get(num);
                colorToCountOfBalls.put(color, colorToCountOfBalls.get(color) - 1);
                if (colorToCountOfBalls.get(color) == 0) {
                    colorToCountOfBalls.remove(color);
                }
            }
            color = queries[i][1];
            ballToColorNumberMap.put(num, color);
            colorToCountOfBalls.put(color, colorToCountOfBalls.getOrDefault(color, 0) + 1);
            result[i] = colorToCountOfBalls.size();
        }
        return result;
    }

}

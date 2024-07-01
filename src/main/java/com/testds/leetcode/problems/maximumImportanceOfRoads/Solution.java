//https://leetcode.com/problems/maximum-total-importance-of-roads/
package com.testds.leetcode.problems.maximumImportanceOfRoads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public long maximumImportance(int n, int[][] roads) {
        //n = 5
        //roads = [[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
        int[] cityImportance = new int[n];
        for (int[] road : roads) {
            cityImportance[road[0]] += 1;
            cityImportance[road[1]] += 1;
        }
        //cityImprtance = [2,3,4,2,1]
        Map<Integer, List<Integer>> cityImportanceToListOfCities = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list;
            if (!cityImportanceToListOfCities.containsKey(cityImportance[i])) {
                list = new ArrayList<>();
                cityImportanceToListOfCities.put(cityImportance[i], list);
            }
            cityImportanceToListOfCities.get(cityImportance[i]).add(i);
        }
        int importance = 1;
        for (Map.Entry<Integer, List<Integer>> entry : cityImportanceToListOfCities.entrySet()) {
            for (Integer city : entry.getValue()) {
                cityImportance[city] = importance;
                importance++;
            }
        }
        long maxImportance = 0L;
        for (int[] road : roads) {
            maxImportance += cityImportance[road[0]];
            maxImportance += cityImportance[road[1]];
        }
        return maxImportance;
    }
}

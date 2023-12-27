//https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
package com.testds.leetcode.problems.minTime2MkRopeColrful;

public class Solution {
    public int minCost(String colors, int[] neededTime) {
        char prevChar = colors.charAt(0);
        int localMax = neededTime[0];
        int minCost = 0;
        for (int i = 1; i < colors.length(); i++) {
            char currentChar = colors.charAt(i);
            if (currentChar == prevChar) {
                if (neededTime[i] < localMax) {
                    minCost += neededTime[i];
                } else {
                    minCost += localMax;
                    localMax = neededTime[i];
                }
            } else {
                prevChar = currentChar;
                localMax = neededTime[i];
            }
        }
        return minCost;
    }
}

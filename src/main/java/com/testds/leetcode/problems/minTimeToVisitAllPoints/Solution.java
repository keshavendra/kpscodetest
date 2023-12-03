//https://leetcode.com/problems/minimum-time-visiting-all-points
package com.testds.leetcode.problems.minTimeToVisitAllPoints;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        for (int i = 1; i < points.length; i++) {
            minTime += distanceBetweenPoints(points[i - 1][0], points[i - 1][1], points[i][0], points[i][1]);
        }
        return minTime;
    }

    private int distanceBetweenPoints(int sx, int sy, int tx, int ty) {
        int diffX = Math.abs(tx - sx);
        int diffY = Math.abs(ty - sy);
        return Math.min(diffX, diffY) + Math.abs(diffY - diffX);
    }
}

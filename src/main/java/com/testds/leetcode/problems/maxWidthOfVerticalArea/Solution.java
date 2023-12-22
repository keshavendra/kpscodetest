//https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
package com.testds.leetcode.problems.maxWidthOfVerticalArea;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        int maxDiff = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] - points[i - 1][0] > maxDiff)
                maxDiff = points[i][0] - points[i - 1][0];
        }
        return maxDiff;
    }
}

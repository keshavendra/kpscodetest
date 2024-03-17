//https://leetcode.com/problems/insert-interval/
package com.testds.leetcode.problems.insertInterval;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int startTime = newInterval[0];
        int endTime = newInterval[1];
        if (intervals[0][0] > endTime) {
            //no overlapping at start
            int[][] resultArray = new int[intervals.length + 1][2];
            resultArray[0][0] = startTime;
            resultArray[0][1] = endTime;
            for (int i = 1; i < resultArray.length; i++) {
                resultArray[i][0] = intervals[i - 1][0];
                resultArray[i][1] = intervals[i - 1][1];
            }
            return resultArray;
        }

        if (intervals[intervals.length - 1][1] < startTime) {
            //no overlapping at end
            int[][] resultArray = new int[intervals.length + 1][2];
            resultArray[intervals.length][0] = startTime;
            resultArray[intervals.length][1] = endTime;
            for (int i = 0; i < intervals.length; i++) {
                resultArray[i][0] = intervals[i][0];
                resultArray[i][1] = intervals[i][1];
            }
            return resultArray;
        }

        //there is a chance of insertion in between
        int insertIndex = 0;
        for (; insertIndex < intervals.length; insertIndex++) {
            if (intervals[insertIndex][1] < startTime)
                continue;
            break;
        }
        if (intervals[insertIndex][0] > endTime) {
            //there is no overlap
            int[][] resultArray = new int[intervals.length + 1][2];
            resultArray[insertIndex][0] = startTime;
            resultArray[insertIndex][1] = endTime;
            for (int i = 0; i < insertIndex; i++) {
                resultArray[i][0] = intervals[i][0];
                resultArray[i][1] = intervals[i][1];
            }
            for (int i = insertIndex + 1; i < resultArray.length; i++) {
                resultArray[i][0] = intervals[i - 1][0];
                resultArray[i][1] = intervals[i - 1][1];
            }
            return resultArray;
        }
        //there is overlap
        startTime = Math.min(startTime, intervals[insertIndex][0]);
        endTime = Math.max(endTime, intervals[insertIndex][1]);
        int endIndex = insertIndex + 1;
        for (; endIndex < intervals.length; endIndex++) {
            if (intervals[endIndex][0] <= endTime) {
                endTime = Math.max(endTime, intervals[endIndex][1]);
                continue;
            }
            break;
        }
        int[][] resultArray = new int[insertIndex + intervals.length - endIndex + 1][2];
        for (int i = 0; i < insertIndex; i++) {
            resultArray[i][0] = intervals[i][0];
            resultArray[i][1] = intervals[i][1];
        }
        resultArray[insertIndex][0] = startTime;
        resultArray[insertIndex][1] = endTime;
        for (int i = endIndex; i < intervals.length; i++) {
            final int[] ints = resultArray[i - endIndex + insertIndex + 1];
            ints[0] = intervals[i][0];
            ints[1] = intervals[i][1];
        }
        return resultArray;
    }
}

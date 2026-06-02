//https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i
package com.testds.leetcode.problems.earliestFinishTime;

public class Solution {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int leastFinishTime = Integer.MAX_VALUE;
        for (int cand = 0; cand < landStartTime.length; cand++) {
            for (int fin = 0; fin < waterStartTime.length; fin++) {
                //if land is taken first
                if (waterStartTime[fin] >= (landStartTime[cand] + landDuration[cand])) {
                    if (leastFinishTime > waterStartTime[fin] + waterDuration[fin]) {
                        leastFinishTime = waterStartTime[fin] + waterDuration[fin];
                    }
                } else {
                    if (leastFinishTime > (landStartTime[cand] + landDuration[cand] + waterDuration[fin])) {
                        leastFinishTime = landStartTime[cand] + landDuration[cand] + waterDuration[fin];
                    }
                }
            }
        }


        for (int cand = 0; cand < waterStartTime.length; cand++) {
            for (int fin = 0; fin < landStartTime.length; fin++) {
                //if water is taken first
                if (landStartTime[fin] >= (waterStartTime[cand] + waterDuration[cand])) {
                    if (leastFinishTime > landStartTime[fin] + landDuration[fin]) {
                        leastFinishTime = landStartTime[fin] + landDuration[fin];
                    }
                } else {
                    if (leastFinishTime > (waterStartTime[cand] + waterDuration[cand] + landDuration[fin])) {
                        leastFinishTime = (waterStartTime[cand] + waterDuration[cand] + landDuration[fin]);
                    }
                }
            }
        }
        return leastFinishTime;
    }

}

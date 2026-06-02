//https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i
package com.testds.leetcode.problems.earliestFinishTime;

public class Solution {

    public int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration
    ) {
        int minLandFinish = Integer.MAX_VALUE;
        int minWaterFinish = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            minLandFinish = Math.min(minLandFinish, landStartTime[i] + landDuration[i]);
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterFinish = Math.min(minWaterFinish, waterStartTime[i] + waterDuration[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Land first, then water
        for (int i = 0; i < waterStartTime.length; i++) {
            int finish = Math.max(minLandFinish, waterStartTime[i]) + waterDuration[i];
            ans = Math.min(ans, finish);
        }

        // Water first, then land
        for (int i = 0; i < landStartTime.length; i++) {
            int finish = Math.max(minWaterFinish, landStartTime[i]) + landDuration[i];
            ans = Math.min(ans, finish);
        }

        return ans;
    }
}

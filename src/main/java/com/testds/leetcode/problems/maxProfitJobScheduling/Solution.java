//https://leetcode.com/problems/maximum-profit-in-job-scheduling/
package com.testds.leetcode.problems.maxProfitJobScheduling;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int length = startTime.length;
        int[][] jobs = new int[length][3];
        for (int i = 0; i < length; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int val = job[2] + dp.floorEntry(job[0]).getValue();
            if (val > dp.lastEntry().getValue()) {
                dp.put(job[1], val);
            }
        }
        return dp.lastEntry().getValue();
    }
}

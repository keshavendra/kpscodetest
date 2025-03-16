//https://leetcode.com/problems/minimum-time-to-repair-cars/
package com.testds.leetcode.problems.minTimeToRepairCars;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {
    public long repairCars(int[] ranks, int cars) {
        long minTime = 1L;
        OptionalInt optional = Arrays.stream(ranks).max();
        long maxTime = Integer.MAX_VALUE;
        if (optional.isPresent()) {
            minTime = optional.getAsInt();
        }

        while (minTime < maxTime) {
            long mid = (maxTime + minTime) / 2;
            long repair = 0;
            for (int rank : ranks) {
                repair += (int) Math.sqrt((double) mid / rank);
            }
            if (repair >= cars) {
                maxTime = mid;
            } else {
                minTime = mid + 1;
            }
        }
        return minTime;
    }
}

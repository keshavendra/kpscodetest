//https://leetcode.com/problems/minimum-time-difference/
package com.testds.leetcode.problems.minTimeDifference;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Solution {

    private static final Integer MAX_NUM = 24 * 60;

    private static final ToIntFunction<String> INTEGER_MINUTES = (s) ->
            Integer.parseInt(s.substring(0, 2)) * 60 +
                    Integer.parseInt(s.substring(3));

    private static final Comparator<String> COMPARATOR = (o1, o2) -> {
        int o1Minutes = INTEGER_MINUTES.applyAsInt(o1);
        int o2Minutes = INTEGER_MINUTES.applyAsInt(o2);
        return o1Minutes - o2Minutes;
    };


    public int findMinDifference(List<String> timePoints) {
        timePoints.sort(COMPARATOR);
        String prev = timePoints.get(0);
        int minDiff = findDiff(prev, timePoints.get(timePoints.size() - 1));
        int localMin;
        for (int i = 1; i < timePoints.size(); i++) {
            String current = timePoints.get(i);
            localMin = findDiff(current, prev);
            if (localMin < minDiff) {
                minDiff = localMin;
            }
            if (minDiff == 0) {
                break;
            }
            prev = current;
        }
        return minDiff;
    }

    private int findDiff(String first, String second) {
        int min = Math.abs(INTEGER_MINUTES.applyAsInt(first) - INTEGER_MINUTES.applyAsInt(second));
        min = Math.min(min, MAX_NUM - min);
        return min;
    }


}

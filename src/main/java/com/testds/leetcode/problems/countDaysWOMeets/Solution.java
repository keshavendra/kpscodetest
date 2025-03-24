//https://leetcode.com/problems/count-days-without-meetings/

package com.testds.leetcode.problems.countDaysWOMeets;

import java.util.Arrays;

public class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count = meetings[0][0] - 1;
        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] > meetings[i - 1][1]) {
                count += meetings[i][0] - meetings[i - 1][1] - 1;
            } else {
                if (meetings[i][1] < meetings[i - 1][1])
                    meetings[i][1] = meetings[i - 1][1];
            }
        }
        count += days - meetings[meetings.length - 1][1];
        return count;
    }
}

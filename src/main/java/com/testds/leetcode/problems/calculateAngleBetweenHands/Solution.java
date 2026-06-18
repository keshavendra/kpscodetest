//https://leetcode.com/problems/angle-between-hands-of-a-clock
package com.testds.leetcode.problems.calculateAngleBetweenHands;

public class Solution {
    public static final float HOUR_MOVE_PER_MINUTE_HOUR = 0.5f;
    public static final float MINUTE_MOVE_PER_MINUTE = 6.0f;

    public double angleClock(int hour, int minutes) {
        float hourMoved = (((hour == 12 ? 0 : hour) * 60) + minutes) * HOUR_MOVE_PER_MINUTE_HOUR;
        float minuteMoved = minutes * MINUTE_MOVE_PER_MINUTE;
        float diff = Math.abs(hourMoved - minuteMoved);
        if (360 - diff < diff) {
            diff = 360 - diff;
        }
        return diff;
    }
}

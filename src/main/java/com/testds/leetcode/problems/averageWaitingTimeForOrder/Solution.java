//https://leetcode.com/problems/average-waiting-time
package com.testds.leetcode.problems.averageWaitingTimeForOrder;

public class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalWaitingTime = 0, currentTime = 0, waitTime;
        for (int[] customer : customers) {
            if (currentTime <= customer[0]) {
                waitTime = customer[1];
                currentTime = customer[0] + waitTime;
            } else {
                waitTime = (currentTime - customer[0]) + customer[1];
                currentTime += customer[1];
            }
            totalWaitingTime += waitTime;
        }
        return (double) totalWaitingTime / customers.length;
    }
}

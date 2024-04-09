//https://leetcode.com/problems/time-needed-to-buy-tickets
package com.testds.leetcode.problems.timeRequiredToBuyTickets;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeRequired = 0, queueIndex = 0;
        while (tickets[k] > 0) {
            if (tickets[queueIndex] != 0) {
                timeRequired++;
                tickets[queueIndex] -= 1;
            }
            queueIndex++;
            if (queueIndex == tickets.length)
                queueIndex = 0;
        }
        return timeRequired;
    }
}

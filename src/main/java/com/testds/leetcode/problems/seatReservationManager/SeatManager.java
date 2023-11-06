//https://leetcode.com/problems/seat-reservation-manager
package com.testds.leetcode.problems.seatReservationManager;

import java.util.PriorityQueue;
import java.util.Queue;

public class SeatManager {

    private final Queue<Integer> isSeatReserved;

    public SeatManager(int n) {
        isSeatReserved = new PriorityQueue<>(n);
        for (int i = 1; i <= n; i++) {
            isSeatReserved.add(i);
        }
    }

    public int reserve() {
        return isSeatReserved.poll();
    }

    public void unreserve(int seatNumber) {
        isSeatReserved.add(seatNumber);
    }
}

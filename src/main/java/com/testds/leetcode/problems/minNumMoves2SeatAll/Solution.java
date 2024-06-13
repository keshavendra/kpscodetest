//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
package com.testds.leetcode.problems.minNumMoves2SeatAll;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
}

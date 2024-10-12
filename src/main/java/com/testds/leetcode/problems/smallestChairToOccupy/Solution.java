//https://leetcode.com/problems/the-number-of-the-smallest-unoccupied-chair/
package com.testds.leetcode.problems.smallestChairToOccupy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int targetFriendStartTime = times[targetFriend][0];
        final Comparator<int[]> COMPARATOR = Comparator.comparingInt(a -> a[0]);
        Arrays.sort(times, COMPARATOR);
        Queue<Integer> chairsQueue = new PriorityQueue<>();
        Queue<int[]> alreadyChaired = new PriorityQueue<>(COMPARATOR);
        IntStream.range(0, times.length).forEach(chairsQueue::add);
        for (int[] currentFriend : times) {
            while (!alreadyChaired.isEmpty() && alreadyChaired.peek()[0] <= currentFriend[0]) {
                chairsQueue.add(alreadyChaired.poll()[1]);
            }
            if (currentFriend[0] == targetFriendStartTime) {
                return !chairsQueue.isEmpty() ? chairsQueue.poll() : times.length;
            }
            //Now startTime is not required
            currentFriend[0] = currentFriend[1];
            currentFriend[1] = !chairsQueue.isEmpty() ? chairsQueue.poll() : times.length;
            alreadyChaired.add(currentFriend);
        }
        return -1;
    }
}

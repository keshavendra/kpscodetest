//https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/
package com.testds.leetcode.problems.minGroupsForIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minGroups(int[][] intervals) {
        // Sort intervals by their start times
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Min-heap (priority queue) to track end times of the current groups
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] interval : intervals) {
            // If the current interval's start is greater than or equal to the smallest end time
            if (!pq.isEmpty() && pq.peek() < interval[0]) {
                pq.poll(); // Remove the interval with the smallest end time
            }

            // Add the current interval's end time to the heap
            pq.offer(interval[1]);
        }

        // The size of the heap is the number of groups required
        return pq.size();
    }
}

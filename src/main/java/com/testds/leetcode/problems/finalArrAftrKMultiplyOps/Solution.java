//https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/
package com.testds.leetcode.problems.finalArrAftrKMultiplyOps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        final Comparator<int[]> numComparator = (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        };

        Queue<int[]> queue = new PriorityQueue<>(numComparator);
        for (int i = 0; i < nums.length; i++) {
            queue.add(new int[]{nums[i], i});
        }
        while (k > 0 && !queue.isEmpty()) {
            int[] pair = queue.poll();
            pair[0] *= multiplier;
            queue.add(pair);
            k--;
        }
        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            nums[pair[1]] = pair[0];
        }
        return nums;
    }
}

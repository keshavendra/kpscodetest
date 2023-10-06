//https://leetcode.com/problems/kth-largest-element-in-an-array/
package com.testds.leetcode.problems.findKthLargest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k + 1, Comparator.naturalOrder());
        Arrays.stream(nums)
                .forEach(x -> {
                    queue.add(x);
                    if (queue.size() > k)
                        queue.poll();
                });
        return queue.poll();
    }
}

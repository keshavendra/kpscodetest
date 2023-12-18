//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
package com.testds.leetcode.problems.maxProductDifference;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int maxProductDifference(int[] nums) {
        Queue<Integer> maxQueue = new PriorityQueue<>();
        Queue<Integer> minQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            maxQueue.add(num);
            minQueue.add(num);
            if (maxQueue.size() > 2) {
                maxQueue.poll();
                minQueue.poll();
            }
        }
        //noinspection DataFlowIssue
        return (maxQueue.poll() * maxQueue.poll()) - (minQueue.poll() * minQueue.poll());
    }
}

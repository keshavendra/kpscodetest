//https://leetcode.com/problems/most-profit-assigning-work/
package com.testds.leetcode.problems.mostProfitAssigningWork;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((o1, o2) -> {
            if (o1.profit != o2.profit) {
                return o2.profit - o1.profit;
            } else {
                return o2.difficulty - o1.difficulty;
            }
        });
        for (int i = 0; i < profit.length; i++) {
            minHeap.add(new Pair(profit[i], difficulty[i]));
        }

        Arrays.sort(worker);
        for (int i = worker.length - 1; i >= 0; i--) {
            while (!minHeap.isEmpty() && minHeap.peek().difficulty > worker[i]) {
                minHeap.poll();
            }
            if (minHeap.isEmpty()) {
                break;
            }
            maxProfit += minHeap.peek().profit;
        }

        return maxProfit;
    }

    private final static class Pair {

        private final int profit;
        private final int difficulty;

        public Pair(int profit, int difficulty) {
            this.profit = profit;
            this.difficulty = difficulty;
        }
    }
}

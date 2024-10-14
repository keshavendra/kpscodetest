//https://leetcode.com/problems/maximal-score-after-applying-k-operations/
package com.testds.leetcode.problems.maxSumAfterKIteration;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    private static final int DIVISOR = 3;

    public long maxKelements(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(nums).forEach(queue::add);
        long result = 0L;
        int num;
        while (k > 0 && !queue.isEmpty()) {
            num = queue.poll();
            result += num;
            num = (num / DIVISOR) + (num % DIVISOR == 0 ? 0 : 1);
            queue.offer(num);
            k--;
        }
        return result;
    }
}

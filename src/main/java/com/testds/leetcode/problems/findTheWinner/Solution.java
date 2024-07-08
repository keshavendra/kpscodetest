//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
package com.testds.leetcode.problems.findTheWinner;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            int i = 1;
            while (i < k) {
                queue.offer(queue.poll());
                i++;
            }
            queue.poll();
        }
        return queue.isEmpty() ? -1 : queue.poll();
    }
}

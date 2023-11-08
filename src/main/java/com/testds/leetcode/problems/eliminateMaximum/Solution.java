//https://leetcode.com/problems/eliminate-maximum-number-of-monsters
package com.testds.leetcode.problems.eliminateMaximum;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        Queue<Integer> timeQueue = new PriorityQueue<>(dist.length);
        for (int i = 0; i < dist.length; i++) {
            int time = dist[i] / speed[i];
            if (dist[i] % speed[i] != 0) {
                time += 1;
            }
            timeQueue.add(time);
        }
        int lapsedTime = 0;
        int count = 0;
        while (!timeQueue.isEmpty()) {
            int time = timeQueue.poll();
            if (lapsedTime >= time)
                break;
            lapsedTime++;
            count++;
        }
        return count;
    }
}

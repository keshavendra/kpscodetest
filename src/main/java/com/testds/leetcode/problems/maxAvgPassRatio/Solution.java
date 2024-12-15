//https://leetcode.com/problems/maximum-average-pass-ratio
package com.testds.leetcode.problems.maxAvgPassRatio;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[][] classes = new int[][]{{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        System.out.println(new Solution().maxAverageRatio(classes, extraStudents));
        classes = new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}};
        extraStudents = 4;
        System.out.println(new Solution().maxAverageRatio(classes, extraStudents));
    }

    private static final int PRECISION = 5;

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int totalClasses = classes.length;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            double changeInO1Ratio = ((double) (o1[0] + 1) / (o1[1] + 1)) - ((double) (o1[0]) / (o1[1]));
            double changeInO2Ratio = ((double) (o2[0] + 1) / (o2[1] + 1)) - ((double) (o2[0]) / (o2[1]));
            return Double.compare(changeInO2Ratio, changeInO1Ratio);
        });
        for (int[] clazz : classes) {
            if (clazz[0] != clazz[1]) {
                priorityQueue.add(clazz);
            }
        }

        if (priorityQueue.isEmpty()) {
            return 1;
        }

        while (extraStudents > 0 && !priorityQueue.isEmpty()) {
            int[] clazz = priorityQueue.poll();
            clazz[0] += 1;
            clazz[1] += 1;
            priorityQueue.add(clazz);
            extraStudents--;
        }

        double ratio = totalClasses - priorityQueue.size();
        while (!priorityQueue.isEmpty()) {
            int[] clazz = priorityQueue.poll();
            ratio += (double) clazz[0] / clazz[1];
        }
        ratio /= totalClasses;
        return Math.floor(ratio * Math.pow(10.0F, PRECISION) + (double) 0.5F) / Math.pow(10.0F, PRECISION);
    }
}

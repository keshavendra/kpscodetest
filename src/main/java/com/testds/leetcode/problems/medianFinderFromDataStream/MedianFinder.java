//https://leetcode.com/problems/find-median-from-data-stream/
package com.testds.leetcode.problems.medianFinderFromDataStream;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    private final PriorityQueue<Integer> leftHeap;
    private final PriorityQueue<Integer> rightHeap;

    public MedianFinder() {
        leftHeap = new PriorityQueue<>(Comparator.reverseOrder());
        rightHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (leftHeap.isEmpty() || num <= leftHeap.peek()) {
            leftHeap.offer(num);
        } else {
            rightHeap.offer(num);
        }

        if (leftHeap.size() > rightHeap.size() + 1) {
            rightHeap.offer(leftHeap.poll());
        } else if (rightHeap.size() > leftHeap.size()) {
            leftHeap.offer(rightHeap.poll());
        }
    }

    public double findMedian() {
        if (leftHeap.isEmpty()) {
            return -1;
        }
        if (leftHeap.size() == rightHeap.size()) {
            return (leftHeap.peek() + rightHeap.peek()) / 2.0;
        } else {
            return leftHeap.peek();
        }
    }
}

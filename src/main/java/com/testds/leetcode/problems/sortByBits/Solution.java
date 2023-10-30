//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits
package com.testds.leetcode.problems.sortByBits;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, Queue<Integer>> map = new TreeMap<>();
        for (int num : arr) {
            int val = findNumOf1s(num);
            if (!map.containsKey(val))
                map.put(val, new PriorityQueue<>());
            map.get(val).add(num);
        }
        int index = 0;
        for (Map.Entry<Integer, Queue<Integer>> entry : map.entrySet()) {
            Queue<Integer> queue = entry.getValue();
            while (!queue.isEmpty()) {
                arr[index++] = queue.poll();
            }
        }
        return arr;
    }

    private int findNumOf1s(int num) {
        int ANDer = 1;
        int count = 0;
        while (ANDer != 0) {
            count += (num & ANDer) == ANDer ? 1 : 0;
            ANDer <<= 1;
        }
        return count;
    }
}

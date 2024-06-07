//https://leetcode.com/problems/hand-of-straights/
package com.testds.leetcode.problems.handOfStraights;

import java.util.Iterator;
import java.util.TreeMap;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int j : hand) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        while (!map.isEmpty()) {
            int prev = -1;
            int count = 0;
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                int current = iterator.next();
                if (map.get(current) > 1) {
                    map.put(current, map.get(current) - 1);
                } else {
                    iterator.remove();
                }
                if (prev != -1) {
                    if (current - prev != 1)
                        return false;
                }
                prev = current;
                count++;
                if (!iterator.hasNext() && count != groupSize) {
                    return false;
                }
                if (count == groupSize) {
                    break;
                }
            }
        }
        return true;
    }
}

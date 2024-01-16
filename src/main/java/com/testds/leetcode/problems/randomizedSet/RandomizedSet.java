//https://leetcode.com/problems/insert-delete-getrandom-o1/
package com.testds.leetcode.problems.randomizedSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomizedSet {
    private static final Random random = new Random();
    private final HashSet<Integer> entries;

    public RandomizedSet() {
        entries = new HashSet<>();
    }

    public boolean insert(int val) {
        return entries.add(val);
    }

    public boolean remove(int val) {
        return entries.remove(val);
    }

    public int getRandom() {
        int randomNum = random.nextInt(entries.size());
        int count = 0;
        Iterator<Integer> iterator = entries.iterator();
        while (count < randomNum) {
            iterator.next();
            count++;
        }
        return iterator.next();
    }
}

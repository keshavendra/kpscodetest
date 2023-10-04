//https://leetcode.com/problems/design-hashmap
package com.testds.leetcode.problems.designMyHashMap;

import java.util.stream.IntStream;

public class MyHashMap {
    private final int[] array;
    private static final int MAX_SIZE = 1000000 + 1;

    public MyHashMap() {
        this.array = new int[MAX_SIZE];
        IntStream.range(0, MAX_SIZE)
                .forEach(x -> array[x] = -1);
    }

    public void put(int key, int value) {
        array[key] = value;
    }

    public int get(int key) {
        return array[key];
    }

    public void remove(int key) {
        array[key] = -1;
    }
}

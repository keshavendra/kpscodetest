package com.testds.ds.heap;


import java.util.logging.Logger;

public class Heap {

    int[] arr;
    int size;

    public static final Logger log = Logger.getLogger(String.valueOf(Heap.class));

    public Heap(int capacity) {
        assert capacity > 0;
        arr = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(int item) {
        if (size == arr.length) {
            log.fine("Heap is full");
            return false;
        }
        arr[size++] = item;
        heapify();
        return true;
    }

    private void heapify() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            if (arr[i] < arr[2 * i + 1]) {
                arr[i] ^= arr[2 * i + 1];
                arr[2 * i + 1] ^= arr[i];
                arr[i] ^= arr[2 * i + 1];
            }
            if (arr[i] < arr[2 * i + 2]) {
                arr[i] ^= arr[2 * i + 2];
                arr[2 * i + 2] ^= arr[i];
                arr[i] ^= arr[2 * i + 2];
            }
        }
    }
}

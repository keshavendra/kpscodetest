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

    public int top() {
        if (size == 0) {
            log.fine("Heap is empty");
            return -1;
        }
        return arr[0];
    }

    public int remove() {
        if (isEmpty()) {
            log.fine("Heap is empty");
            return -1;
        }
        int value = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        percolateDown();
        return value;
    }

    private void heapify() {
        boolean noChange;
        for (int i = size / 2 - 1; i >= 0; i--) {
            noChange = true;
            if (arr[i] < arr[2 * i + 1]) {
                arr[i] ^= arr[2 * i + 1];
                arr[2 * i + 1] ^= arr[i];
                arr[i] ^= arr[2 * i + 1];
                noChange = false;
            }
            if (arr[i] < arr[2 * i + 2]) {
                arr[i] ^= arr[2 * i + 2];
                arr[2 * i + 2] ^= arr[i];
                arr[i] ^= arr[2 * i + 2];
                noChange = false;
            }
            if (noChange) {
                break;
            }
        }
    }

    private void percolateDown() {
        int index = 0;
        boolean flag;
        while (index < size) {
            flag = false;
            if (2 * index + 1 < size && 2 * index + 2 < size) {
                if (arr[2 * index + 1] > arr[2 * index + 2]
                        && arr[2 * index + 1] > arr[index]) {
                    arr[2 * index + 1] ^= arr[index];
                    arr[index] ^= arr[2 * index + 1];
                    arr[2 * index + 1] ^= arr[index];
                    index = 2 * index + 1;
                    flag = true;
                } else if (arr[2 * index + 1] < arr[2 * index + 2]
                        && arr[2 * index + 2] > arr[index]) {
                    arr[index] ^= arr[2 * index + 2];
                    arr[2 * index + 2] ^= arr[index];
                    arr[index] ^= arr[2 * index + 2];
                    index = 2 * index + 2;
                    flag = true;
                }
            } else if (2 * index + 1 < size && arr[index] < arr[2 * index + 1]) {
                arr[index] ^= arr[2 * index + 1];
                arr[2 * index + 1] ^= arr[index];
                arr[index] ^= arr[2 * index + 1];
                index = 2 * index + 1;
                flag = true;
            }
            if (!flag) {
                break;
            }
        }
    }
}

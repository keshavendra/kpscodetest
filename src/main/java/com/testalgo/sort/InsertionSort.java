package com.testalgo.sort;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] arr) {
        int[] resultArray = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < arr.length; i++) {
            int key = resultArray[i];
            int j = i - 1;
            while (j >= 0 && resultArray[j] > key) {
                resultArray[j + 1] = resultArray[j];
                j--;
            }
            resultArray[j + 1] = key;
        }
        return resultArray;
    }
}

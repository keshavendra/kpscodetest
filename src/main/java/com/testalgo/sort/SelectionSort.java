package com.testalgo.sort;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] arr) {
        int[] resultArray = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (resultArray[j] < resultArray[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                resultArray[minIndex] ^= resultArray[i];
                resultArray[i] ^= resultArray[minIndex];
                resultArray[minIndex] ^= resultArray[i];
            }
        }
        return resultArray;
    }

}

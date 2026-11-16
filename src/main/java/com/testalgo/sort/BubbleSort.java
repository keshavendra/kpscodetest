package com.testalgo.sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int[] resultArray = Arrays.copyOf(arr, arr.length);
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    resultArray[j + 1] ^= resultArray[j];
                    resultArray[j] ^= resultArray[j + 1];
                    resultArray[j + 1] ^= resultArray[j];
                }
            }
        }
        return resultArray;
    }
}

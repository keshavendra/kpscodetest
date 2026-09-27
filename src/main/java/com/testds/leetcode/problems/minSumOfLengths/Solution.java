//https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/
package com.testds.leetcode.problems.minSumOfLengths;

public class Solution {

    public int minSumOfLengths(int[] arr, int target) {
        int leftRight = 0, start = 0;
        int sum = 0;
        int[] leftArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            leftArr[i] = leftRight;
            sum += arr[i];
            if (sum >= target) {
                if (sum == target) {
                    if (leftRight == 0 || i - start + 1 < leftRight) {
                        leftRight = i - start + 1;
                    }
                }
                while (sum >= target) {
                    sum -= arr[start++];
                    if (sum == target) {
                        if (leftRight == 0 || i - start + 1 < leftRight) {
                            leftRight = i - start + 1;
                        }
                    }
                }
            }
        }
        int[] rightArr = new int[arr.length];
        int end = arr.length - 1;
        sum = 0;
        leftRight = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            rightArr[i] = leftRight;
            if (sum >= target) {
                if (sum == target) {
                    if (leftRight == 0 || end - i + 1 < leftRight) {
                        leftRight = end - i + 1;
                        rightArr[i] = end - i + 1;
                    }
                }
                while (sum >= target) {
                    sum -= arr[end--];
                    if (sum == target) {
                        if (leftRight == 0 || end - i + 1 < leftRight) {
                            leftRight = end - i + 1;
                            rightArr[i] = end - i + 1;
                        }
                    }
                }
            }

        }
        int min = -1;
        for (int i = 0; i < rightArr.length; i++) {
            if (!(leftArr[i] == 0 || rightArr[i] == 0)) {
                if (min == -1 || leftArr[i] + rightArr[i] < min) {
                    min = leftArr[i] + rightArr[i];
                }
            }
        }
        return min;
    }
}

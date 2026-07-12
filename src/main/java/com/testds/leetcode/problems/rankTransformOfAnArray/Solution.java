//https://leetcode.com/problems/rank-transform-of-an-array
package com.testds.leetcode.problems.rankTransformOfAnArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] resultArray = new int[arr.length];
        System.arraycopy(arr, 0, resultArray, 0, arr.length);
        Arrays.sort(resultArray);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int j : resultArray) {
            if (!map.containsKey(j)) {
                map.put(j, rank++);
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = map.get(arr[i]);
        }
        return resultArray;
    }
}

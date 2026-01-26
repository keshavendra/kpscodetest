//https://leetcode.com/problems/minimum-absolute-difference/
package com.testds.leetcode.problems.minimumAbsoluteDifference;

import java.util.*;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr != null && arr.length > 0) {
            Arrays.sort(arr);
            int minDiff = Integer.MAX_VALUE, absoluteDiff;
            for (int i = 1; i < arr.length; i++) {
                absoluteDiff = Math.abs(arr[i] - arr[i - 1]);
                if (absoluteDiff == minDiff) {
                    res.add(Arrays.asList(arr[i - 1], arr[i]));
                } else {
                    if (minDiff > absoluteDiff) {
                        minDiff = absoluteDiff;
                        res = new ArrayList<>();
                        res.add(Arrays.asList(arr[i - 1], arr[i]));
                    }
                }
            }
        }
        return res;
    }
}

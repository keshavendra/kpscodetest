//https://leetcode.com/problems/height-checker/
package com.testds.leetcode.problems.heightChecker;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        int num = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] != heights[i]) {
                num++;
            }
        }
        return num;
    }
}

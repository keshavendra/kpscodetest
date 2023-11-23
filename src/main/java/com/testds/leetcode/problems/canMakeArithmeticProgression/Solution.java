//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
package com.testds.leetcode.problems.canMakeArithmeticProgression;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 2)
            return true;
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != arr[1] - arr[0])
                return false;
        }
        return true;
    }
}

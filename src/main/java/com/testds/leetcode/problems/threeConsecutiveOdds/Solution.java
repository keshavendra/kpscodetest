//https://leetcode.com/problems/three-consecutive-odds/
package com.testds.leetcode.problems.threeConsecutiveOdds;

public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length <= 2)
            return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] * arr[i + 1] * arr[i + 2]) % 2 != 0)
                return true;
        }
        return false;
    }
}

//https://leetcode.com/problems/find-missing-observations/
package com.testds.leetcode.problems.missingRolls;

public class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int existingSum = 0;
        for (int num : rolls) {
            existingSum += num;
        }

        int remainingSum = mean * (rolls.length + n) - existingSum;

        if (remainingSum > 0 && ((remainingSum / 6 == n && remainingSum % 6 == 0) || (remainingSum / n < 6 && remainingSum / n > 0))) {
            //possible to break it.
            int[] list = new int[n];
            while (n > 1) {
                list[n - 1] = remainingSum / n;
                remainingSum -= remainingSum / n;
                n--;
            }
            list[0] = remainingSum;
            return list;
        } else {
            return new int[0];
        }
    }
}

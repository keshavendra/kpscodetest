//https://leetcode.com/problems/ugly-number-ii/
package com.testds.leetcode.problems.uglyNumber2;

public class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        int[] ugly = new int[n];
        ugly[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int next2 = ugly[i2] * 2;
            int next3 = ugly[i3] * 3;
            int next5 = ugly[i5] * 5;
            int min = Math.min(next2, Math.min(next3, next5));
            ugly[i] = min;
            if (min == next2) i2++;
            if (min == next3) i3++;
            if (min == next5) i5++;
        }
        return ugly[n - 1];
    }
}

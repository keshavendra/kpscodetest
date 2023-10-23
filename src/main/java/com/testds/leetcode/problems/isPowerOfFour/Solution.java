//https://leetcode.com/problems/power-of-four
package com.testds.leetcode.problems.isPowerOfFour;

public class Solution {
    public boolean isPowerOfFour(int num) {
        boolean isPower = false;
        if (num > 0 && (num & (num - 1)) == 0) {
            // It confirms if it is a power of 2.
            double logValue = Math.log(num) / Math.log(2);
            if ((int) logValue % 2 == 0) // only even powers are the power of 4.
                isPower = true;
        }
        return isPower;
    }
}

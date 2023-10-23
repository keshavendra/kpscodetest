//https://leetcode.com/problems/power-of-three/
package com.testds.leetcode.problems.isPowerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 0 || n % 2 == 0)
            return false;
        if (n == 1)
            return true;
        while (n > 3) {
            if (n % 3 != 0)
                return false;
            n /= 3;
        }
        return n % 3 == 0;
    }
}

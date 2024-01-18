//https://leetcode.com/problems/climbing-stairs
package com.testds.leetcode.problems.climbStairs;

public class Solution {
    public int climbStairs(int n) {
        int[] waysToClimb = new int[n + 1];
        waysToClimb[n] = 1;
        waysToClimb[n - 1] = 2;
        for (int i = n - 2; i >= 0; i--) {
            waysToClimb[i] = waysToClimb[i + 1] + waysToClimb[i + 2];
        }
        return waysToClimb[1];
    }
}

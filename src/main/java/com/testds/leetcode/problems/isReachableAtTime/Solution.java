//https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time
package com.testds.leetcode.problems.isReachableAtTime;

public class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        //base case
        if (sx == fx && sy == fy && t == 1)
            return false;
        int fDist = Math.abs(fy - sy);
        int xDist = Math.abs(fx - sx);
        int dist = Math.min(fDist, xDist);
        dist += Math.max(fDist, xDist) - dist;
        return dist <= t;
    }
}

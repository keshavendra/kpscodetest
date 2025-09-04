//https://leetcode.com/problems/find-closest-person
package com.testds.leetcode.problems.findClosestPerson;

public class Solution {
    public int findClosest(int x, int y, int z) {
        int val = Math.abs(x - z) - Math.abs(y - z);
        if (val == 0) return 0;
        if (val < 0) return 1;
        return 2;
    }
}

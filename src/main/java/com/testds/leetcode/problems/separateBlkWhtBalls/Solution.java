//https://leetcode.com/problems/separate-black-and-white-balls/
package com.testds.leetcode.problems.separateBlkWhtBalls;

public class Solution {
    public long minimumSteps(String s) {
        long count = 0L;
        int count0 = 0;
        int i = s.length() - 1;
        for (; i >= 0; i--) {
            if (s.charAt(i) == '0')
                count0++;
            else
                count += count0;
        }
        return count;
    }
}

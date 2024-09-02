//https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/
package com.testds.leetcode.problems.chalkReplacer;

public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if (k < chalk[0])
            return 0;
        k-=chalk[0];
        for (int i = 1; i < chalk.length; i++) {
            if (k < chalk[i])
                return i;
            k-=chalk[i];
            chalk[i]+=chalk[i-1];
        }
        return binarySearch(chalk, 0, chalk.length - 1, k % chalk[chalk.length - 1]);
    }

    private int binarySearch(int[] chalk, int start, int end, long k) {
        int mid = (start + end) / 2;
        if (k < chalk[mid] && (mid == 0 || k >= chalk[mid - 1]))
            return mid;
        if (k < chalk[mid])
            return binarySearch(chalk, start, mid - 1, k);
        else
            return binarySearch(chalk, mid + 1, end, k);
    }
}

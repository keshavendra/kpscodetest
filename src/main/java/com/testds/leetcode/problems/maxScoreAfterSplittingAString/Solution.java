//https://leetcode.com/problems/maximum-score-after-splitting-a-string/
package com.testds.leetcode.problems.maxScoreAfterSplittingAString;

public class Solution {
    public int maxScore(String s) {
        int numOf1s = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                numOf1s++;
        }
        int zerosInLeft = 0;
        int onesInRight = numOf1s;
        if (s.charAt(0) == '0')
            zerosInLeft++;
        else
            onesInRight--;
        int maxSum = zerosInLeft + onesInRight;
        for (int takeIthInLeft = 1; takeIthInLeft < s.length() - 1; takeIthInLeft++) {
            if (s.charAt(takeIthInLeft) == '0') {
                zerosInLeft++;
            } else {
                onesInRight--;
            }
            if (maxSum < zerosInLeft + onesInRight) {
                maxSum = zerosInLeft + onesInRight;
            }
        }
        return maxSum;
    }
}

//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
package com.testds.leetcode.problems.minOperationsToMakeAll1s;

public class Solution {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];

        int left1 = 0, right1 = 0, leftDistance = 0, rightDistance = 0;

        for (int i = 0; i < boxes.length(); i++) {
            result[i] += leftDistance;
            left1 += boxes.charAt(i) == '1' ? 1 : 0;
            leftDistance += left1;

            int j = boxes.length() - 1 - i;
            result[j] += rightDistance;
            right1 += boxes.charAt(j) == '1' ? 1 : 0;
            rightDistance += right1;
        }

        return result;
    }
}

//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
package com.testds.leetcode.problems.minOperationsToMakeAll1s;

import java.util.Arrays;

public class Solution {
    public int[] minOperations(String boxes) {
        int[] leftDistance = new int[boxes.length()];
        int[] _1s = new int[boxes.length()];
        for (int i = 1; i < boxes.length(); i++) {
            _1s[i] = (boxes.charAt(i - 1) == '1' ? 1 : 0) + _1s[i - 1];
            leftDistance[i] = (boxes.charAt(i - 1) == '1' ? 1 : 0)
                    + leftDistance[i - 1]
                    + _1s[i - 1];
        }

        int[] rightDistance = new int[boxes.length()];
        Arrays.fill(_1s, 0);

        for (int i = boxes.length() - 2; i >= 0; i--) {
            _1s[i] = (boxes.charAt(i + 1) == '1' ? 1 : 0) + _1s[i + 1];
            rightDistance[i] = (boxes.charAt(i + 1) == '1' ? 1 : 0)
                    + rightDistance[i + 1]
                    + _1s[i + 1];
        }

        for (int i = 0; i < boxes.length(); i++) {
            rightDistance[i] += leftDistance[i];
        }

        return rightDistance;
    }
}

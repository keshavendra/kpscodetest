//https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
package com.testds.leetcode.problems.minChangesToMakeAltBinString;

public class Solution {
    public int minOperations(String s) {

        int minAltStartWt1 = 0, minAltStartWt0 = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean isEven = i % 2 == 0;
            switch (s.charAt(i)) {
                case '0':
                    minAltStartWt1 += (isEven ? 1 : 0);
                    minAltStartWt0 += (isEven ? 0 : 1);
                    break;
                case '1':
                    minAltStartWt1 += (isEven ? 0 : 1);
                    minAltStartWt0 += (isEven ? 1 : 0);
            }
        }
        return Math.min(minAltStartWt0, minAltStartWt1);
    }
}

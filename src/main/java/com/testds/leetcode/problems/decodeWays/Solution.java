//https://leetcode.com/problems/decode-ways/
package com.testds.leetcode.problems.decodeWays;

public class Solution {
    public int numDecodings(String s) {
        int[] memOfWays = new int[2];
        memOfWays[0] = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int numWays = 0;
            if (s.charAt(i) != '0') {
                //single character ways
                numWays = memOfWays[0];
                if (i < s.length() - 1) {
                    //doubling characters ways
                    switch (s.charAt(i)) {
                        case '1':
                            numWays += memOfWays[1];
                            break;
                        case '2':
                            switch (s.charAt(i + 1)) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                    numWays += memOfWays[1];
                                default:
                            }
                            break;
                        default:
                    }
                }
            }
            memOfWays[1] = memOfWays[0];
            memOfWays[0] = numWays;
        }
        return memOfWays[0];
    }
}

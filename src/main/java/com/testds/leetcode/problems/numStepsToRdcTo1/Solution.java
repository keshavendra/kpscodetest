//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
package com.testds.leetcode.problems.numStepsToRdcTo1;

public class Solution {
    public int numSteps(String s) {
        int carry = 0, count = 0, num;
        for (int i = s.length() - 1; i > 0; i--) {
            num = s.charAt(i) - '0' + carry;
            if (num % 2 == 0) {
                carry = num / 2;
            } else {
                carry = 1;
                count++;
            }
            count++;
        }
        if (s.charAt(0) == '1' && carry == 1) {
            count += 1;
        }
        return count;
    }
}

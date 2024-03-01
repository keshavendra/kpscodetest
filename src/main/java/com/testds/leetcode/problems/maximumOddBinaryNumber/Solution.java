//https://leetcode.com/problems/maximum-odd-binary-number/
package com.testds.leetcode.problems.maximumOddBinaryNumber;

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int count0 = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '1':
                    count1++;
                    break;
                case '0':
                    count0++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (count1 > 1) {
            sb.append('1');
            count1--;
        }
        while (count0 > 0) {
            sb.append('0');
            count0--;
        }
        sb.append('1');
        return sb.toString();
    }
}

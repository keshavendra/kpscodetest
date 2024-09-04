//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
package com.testds.leetcode.problems.sumOfDigitsOfString;

public class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += ((c - 'a' + 1) / 10) + ((c - 'a' + 1) % 10);
        }

        for (int i = 2; i <= k; i++) {
            if (sum / 10 == 0) {
                break;
            }
            sum = sumup(sum);
        }
        return sum;
    }

    private int sumup(int a) {
        int num = 0;
        while (a > 0) {
            num += a % 10;
            a /= 10;
        }
        return num;
    }
}

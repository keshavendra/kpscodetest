//https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/
package com.testds.leetcode.problems.totalWaviness;

public class Solution {

    public int totalWaviness(int num1, int num2) {
        if (num2 <= 100) {
            return 0;
        }

        int count = 0;
        for (int num = Math.max(101, num1); num <= num2; num++) {
            count += getWavinessCount(num);
        }

        return count;
    }

    private int getWavinessCount(int num) {
        int count = 0;

        int temp = num % 1_000;
        if (isWavyThreeDigitNumber(temp)) {
            count++;
        }

        if (num < 1_000) {
            return count;
        }

        temp = (num % 10_000) / 10;
        if (isWavyThreeDigitNumber(temp)) {
            count++;
        }

        if (num < 10_000) {
            return count;
        }

        temp = num / 100;
        if (isWavyThreeDigitNumber(temp)) {
            count++;
        }

        return count;
    }

    private boolean isWavyThreeDigitNumber(int temp) {
        int hundredPlaceDigit = temp / 100;
        int decimalPlaceDigit = (temp % 100) / 10;
        int unitPlaceDigit = temp % 10;

        return (decimalPlaceDigit > hundredPlaceDigit && decimalPlaceDigit > unitPlaceDigit)
                || (decimalPlaceDigit < hundredPlaceDigit && decimalPlaceDigit < unitPlaceDigit);
    }
}
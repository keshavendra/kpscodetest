//https://leetcode.com/problems/calculate-money-in-leetcode-bank
package com.testds.leetcode.problems.totalMoneyInLeetcodeBank;

public class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;
        int division = n / 7;
        int remainder = n % 7;
        for (int i = 1; i <= remainder; i++) {
            totalMoney += i + division;
        }
        totalMoney += division * 28;

        for (int divisionCounter = 0; divisionCounter < division; divisionCounter++) {
            totalMoney += divisionCounter * 7;
        }

        return totalMoney;
    }
}

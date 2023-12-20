//https://leetcode.com/problems/buy-two-chocolates/

package com.testds.leetcode.problems.buy2Chocolates;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        //taking initialValue as 101 as the range of numbers in prices is 1-100 and size will be >=2
        int lowest = 101;
        int secondLowest = 101;
        for (int price : prices) {
            if (price < lowest) {
                secondLowest = lowest;
                lowest = price;
            } else if (price < secondLowest) {
                secondLowest = price;
            }
        }
        if (lowest + secondLowest <= money)
            return money - lowest - secondLowest;
        else
            return money;

    }
}

//https://leetcode.com/problems/water-bottles/
package com.testds.leetcode.problems.numWaterBottles;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            total += (numBottles) / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return total;
    }
}

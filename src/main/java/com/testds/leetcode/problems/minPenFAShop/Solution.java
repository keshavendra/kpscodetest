//https://leetcode.com/problems/minimum-penalty-for-a-shop/
package com.testds.leetcode.problems.minPenFAShop;

public class Solution {

    public int bestClosingTime(String customers) {
        int totalYCountInRight = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y')
                totalYCountInRight++;
        }
        int totalNCountInLeft = 0;
        int minPenalty = totalYCountInRight;
        int closingIndex = 0;
        for (int i = 0; i < customers.length(); i++) {
            char currentChar = customers.charAt(i);
            //if we close at the current index what will be penalty now?
            if (totalYCountInRight + totalNCountInLeft < minPenalty) {
                minPenalty = totalYCountInRight + totalNCountInLeft;
                closingIndex = i;
            }
            if (currentChar == 'N')
                totalNCountInLeft++;
            else
                totalYCountInRight--;
        }
        //one final attempt
        if (totalYCountInRight + totalNCountInLeft < minPenalty) {
            closingIndex = customers.length();
        }
        return closingIndex;
    }
}

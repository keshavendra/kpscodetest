//https://leetcode.com/problems/minimum-penalty-for-a-shop/
package com.test.leetcode.problems.minPenFAShop;

public class Solution {

    public static void main(String[] args) {

        String str1 = "YYNY";
        String str2 = "NNNNN";
        String str3 = "YYYY";
        Solution sol = new Solution();
        System.out.println("for " + str1 + "\tExpected is 2, actual is " + sol.bestClosingTime(str1));
        System.out.println("for " + str2 + "\tExpected is 0, actual is " + sol.bestClosingTime(str2));
        System.out.println("for " + str3 + "\tExpected is 4, actual is " + sol.bestClosingTime(str3));
    }

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

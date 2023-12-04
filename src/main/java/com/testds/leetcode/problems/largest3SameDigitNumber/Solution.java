//https://leetcode.com/problems/largest-3-same-digit-number-in-string
package com.testds.leetcode.problems.largest3SameDigitNumber;

public class Solution {
    public String largestGoodInteger(String num) {
        char[] charArray = num.toCharArray();
        String answerNum = "";
        for (int i = 1; i < charArray.length - 1; i++) {
            if (charArray[i - 1] == charArray[i] && charArray[i + 1] == charArray[i]) {
                //got a num
                String currentNum = num.substring(i - 1, i + 2);
                if (answerNum.isEmpty() || Integer.parseInt(currentNum) > Integer.parseInt(answerNum))
                    answerNum = currentNum;
            }
        }
        return answerNum;
    }
}

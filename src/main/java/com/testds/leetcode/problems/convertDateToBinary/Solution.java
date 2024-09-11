//https://leetcode.com/problems/convert-date-to-binary/
package com.testds.leetcode.problems.convertDateToBinary;

public class Solution {
    public String convertDateToBinary(String date) {
        String[] yearMonthDate = date.split("-");
        return convertToBinary(yearMonthDate[0]) +
                "-" +
                convertToBinary(yearMonthDate[1]) +
                "-" +
                convertToBinary(yearMonthDate[2]);

    }

    private String convertToBinary(String s) {
        StringBuilder builder = new StringBuilder();
        int num = Integer.parseInt(s);
        while (num > 0) {
            builder.append(num % 2);
            num /= 2;
        }
        return builder.reverse().toString();
    }
}

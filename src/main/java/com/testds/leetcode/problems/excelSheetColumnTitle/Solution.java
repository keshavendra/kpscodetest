package com.testds.leetcode.problems.excelSheetColumnTitle;

public class Solution {

    private static final int NUMBER_OF_CHARACTERS = 26;

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = (columnNumber) % NUMBER_OF_CHARACTERS;
            sb.append((char) ('A' + rem));
            columnNumber /= NUMBER_OF_CHARACTERS;
        }
        return sb.reverse().toString();
    }
}

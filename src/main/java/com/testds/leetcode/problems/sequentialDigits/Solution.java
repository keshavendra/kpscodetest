//https://leetcode.com/problems/sequential-digits/
package com.testds.leetcode.problems.sequentialDigits;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int minDigits = (int) (Math.floor(Math.log10(low)) + 1);
        int maxDigits = (int) (Math.floor(Math.log10(high)) + 1);
        List<Integer> resultList = new ArrayList<>();
        for (int i = minDigits; i <= maxDigits; i++) {
            for (int j = 1; j <= (10 - i); j++) {
                int num = getSequencialNumWithDigits(j, i);
                if (num >= low && num <= high) {
                    resultList.add(num);
                }
            }
        }
        return resultList;
    }

    private int getSequencialNumWithDigits(int startDigit, int numberOfDigits) {
        int num = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            num = num * 10 + startDigit + i;
        }
        return num;
    }
}

//https://leetcode.com/problems/fraction-to-recurring-decimal/
package com.testds.leetcode.problems.fractionToDecimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String fractionToDecimal(int numerator1, int denominator1) {
        StringBuilder sb = new StringBuilder();
        if (numerator1 == 0) {
            return "0";
        }
        int sign = (numerator1 < 0 ? -1 : 1) * (denominator1 < 0 ? -1 : 1);
        long numerator = numerator1;
        long denominator = denominator1;
        numerator = numerator < 0 ? -numerator : numerator;
        denominator = denominator < 0 ? -denominator : denominator;
        sb.append(sign == -1 ? "-" : "")
                .append(numerator / denominator);
        numerator = numerator % denominator;
        Map<Long, Integer> set = new HashMap<>();
        StringBuilder sb1 = new StringBuilder();
        int index = 0;
        while (numerator % denominator != 0 && !set.containsKey(numerator)) {
            set.put(numerator, index++);
            while (numerator < denominator) {
                numerator *= 10;
                if (numerator < denominator) {
                    sb1.append("0");
                    set.put(numerator, index++);
                }
            }
            sb1.append(numerator / denominator);
            numerator = numerator % denominator;
        }
        if (sb1.length() != 0) {
            sb.append(".");
            if (numerator % denominator != 0) {
                index = set.get(numerator);
                sb.append(sb1, 0, index).append("(").append(sb1.substring(index)).append(")");
            } else {
                sb.append(sb1);
            }
        }
        return sb.toString();
    }

}

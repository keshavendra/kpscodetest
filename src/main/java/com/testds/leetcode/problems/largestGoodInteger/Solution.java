//https://leetcode.com/problems/largest-3-same-digit-number-in-string/
package com.testds.leetcode.problems.largestGoodInteger;

import java.util.stream.IntStream;

public class Solution {
    public String largestGoodInteger(String num) {
        return IntStream.range(2, num.length())
                .filter(i -> num.charAt(i) == num.charAt(i - 1))
                .filter(i -> num.charAt(i) == num.charAt(i - 2))
                .mapToObj(i -> String.valueOf(num.charAt(i)))
                .max(String::compareTo)
                .map(i -> i + i + i)
                .orElse("");
    }
}

//https://leetcode.com/problems/largest-number/
package com.testds.leetcode.problems.largestNumberInStringFormat;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    private static final Comparator<Integer> COMPARATOR = (o1, o2) -> {
        if (o1.equals(o2))
            return 0;
        String str1 = o1.toString();
        String str2 = o2.toString();
        int len = 0;
        while (len < 2 * Math.max(str1.length(), str2.length()) &&
                str1.charAt(len % str1.length()) == str2.charAt(len % str2.length())) {
            len++;
        }
        if (str1.charAt(len % str1.length()) != str2.charAt(len % str2.length())) {
            return str1.charAt(len % str1.length())
                    - str2.charAt(len % str2.length());
        }
        return str1.length() - str2.length();
    };

    public String largestNumber(int[] nums) {
        System.arraycopy(
                Arrays
                        .stream(nums)
                        .boxed()
                        .sorted(COMPARATOR)
                        .mapToInt(i -> i)
                        .toArray(),
                0,
                nums,
                0,
                nums.length);

        StringBuilder result = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            result.append(nums[i]);
        }
        if (result.toString().startsWith("0")) {
            result.replace(0, result.length(), "0");
        }
        return result.toString();
    }
}

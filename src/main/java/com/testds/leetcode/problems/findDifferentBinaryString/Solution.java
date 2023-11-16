//https://leetcode.com/problems/find-unique-binary-string
package com.testds.leetcode.problems.findDifferentBinaryString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    Set<String> stringSet = new HashSet<>();

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        stringSet.addAll(Arrays.asList(nums));
        return findDifferentBinaryString(n, "");
    }

    private String findDifferentBinaryString(int n, String s) {
        String zeroString = s + "0";
        String oneString = s + "1";
        if (n == 1) {
            //last in loop
            if (stringSet.add(zeroString))
                return zeroString;
            if (stringSet.add(oneString))
                return oneString;
            return "";
        }
        String str = findDifferentBinaryString(n - 1, zeroString);
        if ("".equals(str))
            str = findDifferentBinaryString(n - 1, oneString);
        return str;
    }
}

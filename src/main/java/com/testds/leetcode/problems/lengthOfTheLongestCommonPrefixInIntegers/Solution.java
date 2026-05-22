//https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix
package com.testds.leetcode.problems.lengthOfTheLongestCommonPrefixInIntegers;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixes = buildPrefixes(arr1);
        int maxPrefixLength = 0;

        for (int num : arr2) {
            maxPrefixLength = Math.max(maxPrefixLength, longestMatchingPrefixLength(num, prefixes));
        }

        return maxPrefixLength;
    }

    private Set<Integer> buildPrefixes(int[] nums) {
        Set<Integer> prefixes = new HashSet<>();

        for (int num : nums) {
            int current = num;
            while (current > 0) {
                prefixes.add(current);
                current /= 10;
            }
        }

        return prefixes;
    }

    private int longestMatchingPrefixLength(int num, Set<Integer> prefixes) {
        int current = num;

        while (current > 0) {
            if (prefixes.contains(current)) {
                return digitCount(current);
            }
            current /= 10;
        }

        return 0;
    }

    private int digitCount(int num) {
        int digits = 0;
        int current = num;

        while (current > 0) {
            digits++;
            current /= 10;
        }

        return digits;
    }
}

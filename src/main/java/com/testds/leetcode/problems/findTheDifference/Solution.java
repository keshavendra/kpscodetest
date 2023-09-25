//https://leetcode.com/problems/find-the-difference
package com.testds.leetcode.problems.findTheDifference;

import java.util.stream.IntStream;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] charArray = new int[26];
        IntStream.range(0, t.length()).forEach(x -> charArray[t.charAt(x) - 'a'] += 1);
        IntStream.range(0, s.length()).forEach(x -> charArray[s.charAt(x) - 'a'] -= 1);
        return (char) ('a' + (IntStream.range(0, 26).filter(x -> charArray[x] > 0).findAny().getAsInt()));
    }
}

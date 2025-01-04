//https://leetcode.com/problems/unique-length-3-palindromic-subsequences/
package com.testds.leetcode.problems.countUniqueSubsequencesLen3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "aabca";
//        s = "bbcbaba";
        System.out.println(new Solution().countPalindromicSubsequence(s));
    }

    public int countPalindromicSubsequence(String s) {
        int[] firstOccurrences = new int[26];
        int[] lastOccurrences = new int[26];
        Arrays.fill(firstOccurrences, -1);
        Arrays.fill(lastOccurrences, -1);
        int index;
        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            if (firstOccurrences[index] == -1) {
                firstOccurrences[index] = i;
            }
            lastOccurrences[index] = i;
        }

        int count = 0;
        boolean[] uniques = new boolean[26];
        for (int i = 0; i < 26; i++) {
            if (firstOccurrences[i] != lastOccurrences[i]) {
                Arrays.fill(uniques, false);
                for (int j = firstOccurrences[i] + 1; j < lastOccurrences[i]; j++) {
                    index = s.charAt(j) - 'a';
                    if (!uniques[index]) {
                        uniques[index] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

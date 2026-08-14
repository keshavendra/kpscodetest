//https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence
package com.testds.leetcode.problems.validSequenceForWords;

public class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // right[i] = a position where word2[i] can be matched while
        // still allowing word2[i + 1..] after it.
        int[] right = new int[m];
        java.util.Arrays.fill(right, -1);

        int target = m - 1;
        for (int source = n - 1; source >= 0 && target >= 0; source--) {
            if (word1.charAt(source) == word2.charAt(target)) {
                right[target--] = source;
            }
        }

        int[] answer = new int[m];
        int i = 0;
        boolean mismatchUsed = false;

        for (int source = 0; source < n && i < m; source++) {
            if (word1.charAt(source) == word2.charAt(i)) {
                // Exact match: always take the earliest possible index.
                answer[i++] = source;
            } else if (!mismatchUsed
                    && (i == m - 1 || right[i + 1] > source)) {
                // Use the one replacement here only if the remaining
                // target suffix can still be matched later.
                answer[i++] = source;
                mismatchUsed = true;
            }
        }

        return i == m ? answer : new int[0];
    }
}

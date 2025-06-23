//https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/
package com.testds.leetcode.problems.longestSubsequenceInBinaryString;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int longestSubsequence(String s, int k) {
        int number = 0, largest = 0;
        char numberChar;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
             numberChar = s.charAt(i);
            if (numberChar == '1') {
                queue.offer(i);
            }
            number = (number << 1) + (numberChar - '0');
            if (number <= k)
                largest++;
            else {
                if (!queue.isEmpty()) {
                    number -= (1 << (i - queue.poll()));
                }
            }
        }
        return largest;
    }
}

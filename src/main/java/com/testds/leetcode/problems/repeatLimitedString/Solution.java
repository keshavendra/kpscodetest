//https://leetcode.com/problems/construct-string-with-repeat-limit/
package com.testds.leetcode.problems.repeatLimitedString;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        String s = "cczazcc";
        int repeatLimit = 3;
        System.out.println(new Solution().repeatLimitedString(s, repeatLimit));
        s = "aababab";
        repeatLimit = 2;
        System.out.println(new Solution().repeatLimitedString(s, repeatLimit));
    }

    public String repeatLimitedString(String s, int repeatLimit) {
        int[] letters = new int[26];

        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        Queue<Character> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < 26; i++) {
            if (letters[i] > 0) {
                queue.add((char) (i + 'a'));
            }
        }

        Character prev = null;
        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {

            Character c = queue.poll();

            if (c == prev && queue.isEmpty()) {
                break;
            }

            if (c == prev) {
                c = queue.poll();
                sb.append(c);
                letters[c - 'a']--;
                if (letters[c - 'a'] > 0) {
                    queue.add(c);
                }
                queue.add(prev);
                prev = c;
                continue;
            }

            int min = Math.min(letters[c - 'a'], repeatLimit);
            letters[c - 'a'] -= min;
            while (min > 0) {
                sb.append(c);
                min--;
            }

            if (letters[c - 'a'] > 0) {
                queue.add(c);
            }

            prev = c;
        }
        return sb.toString();
    }
}

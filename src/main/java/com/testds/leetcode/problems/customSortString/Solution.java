//https://leetcode.com/problems/custom-sort-string/
package com.testds.leetcode.problems.customSortString;

import java.util.Arrays;

public class Solution {
    public String customSortString(String order, String s) {
        int[] sortOrder = new int[26];
        Arrays.fill(sortOrder, 25);
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            sortOrder[ch - 'a'] = i;
        }
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars, (o1, o2) -> {
            if (sortOrder[o1 - 'a'] != sortOrder[o2 - 'a']) {
                return sortOrder[o1 - 'a'] - sortOrder[o2 - 'a'];
            } else {
                return o1.compareTo(o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

//https://leetcode.com/problems/reverse-words-in-a-string/
package com.testds.leetcode.problems.reverseWords;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public String reverseWords(String s) {
        String[] split = split(s);
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, split.length)
                .map(index -> split.length - index - 1)
                .forEach(index -> {
                    sb.append(split[index]);
                    sb.append(' ');
                });
        return sb.toString().trim();
    }

    private String[] split(String s) {
        int indexS = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (indexS < s.length()) {
            if (s.charAt(indexS) != ' ') {
                sb.append(s.charAt(indexS));
                indexS++;
            } else {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                }
                sb.setLength(0);
                while (indexS < s.length() && s.charAt(indexS) == ' ') {
                    indexS++;
                }
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        return list.toArray(new String[0]);
    }
}

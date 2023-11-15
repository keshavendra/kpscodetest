//https://leetcode.com/problems/sort-vowels-in-a-string
package com.testds.leetcode.problems.sortVowels;

import java.util.*;

public class Solution {

    public String sortVowels(String s) {
        Set<Character> characterSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        Queue<Character> characterQueue = new PriorityQueue<>();
        for (char ch : s.toCharArray()) {
            if (characterSet.contains(ch))
                characterQueue.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (characterSet.contains(ch))
                sb.append(characterQueue.poll());
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}

//https://leetcode.com/problems/remove-duplicate-letters/
package com.testds.leetcode.problems.removeDuplicateLetters;

import java.util.Stack;
import java.util.stream.IntStream;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> characterStack = new Stack<>();
        boolean[] charVisited = new boolean[26];
        int[] characterCount = new int[26];
        IntStream.range(0, s.length()).forEach(x -> characterCount[s.charAt(x) - 'a'] += 1);
        IntStream.range(0, s.length()).forEach(x -> {
            char ch = s.charAt(x);
            //ch is visited, reducing the frequency
            characterCount[ch - 'a'] -= 1;
            if (!charVisited[ch - 'a']) {
                while (!characterStack.isEmpty() && ch < characterStack.peek() && characterCount[characterStack.peek() - 'a'] > 0) {
                    charVisited[characterStack.pop() - 'a'] = false;
                }
                characterStack.push(ch);
                charVisited[ch - 'a'] = true;
            }
        });
        final StringBuilder sb = new StringBuilder();
        while (!characterStack.isEmpty())
            sb.append(characterStack.pop());
        return sb.reverse().toString();
    }
}

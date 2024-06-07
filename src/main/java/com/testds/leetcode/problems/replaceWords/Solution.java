//https://leetcode.com/problems/replace-words/
package com.testds.leetcode.problems.replaceWords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Map<Character, Object> trie = prepareTrie(dictionary);
        final String[] s = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(searchFirstWordInTrie(trie, str)).append(" ");
        }

        return sb.toString().trim();
    }

    public String searchFirstWordInTrie(Map<Character, Object> trie, String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (trie.containsKey('/'))
                return sb.toString();
            if (!trie.containsKey(ch)) {
                return str;
            }
            sb.append(ch);
            //noinspection unchecked
            trie = (Map<Character, Object>) trie.get(ch);
        }
        if (trie.containsKey('/')) {
            return sb.toString();
        }
        return str;
    }

    public Map<Character, Object> prepareTrie(List<String> dictionary) {
        Map<Character, Object> trie = new HashMap<>();
        for (String str : dictionary) {
            createTrie(str, trie);
        }
        return trie;
    }

    private void createTrie(String str, Map<Character, Object> trie) {
        for (char ch : str.toCharArray()) {
            if (!trie.containsKey(ch)) {
                trie.put(ch, new HashMap<>());
            }
            //noinspection unchecked
            trie = (Map<Character, Object>) trie.get(ch);
        }
        trie.put('/', null);
    }
}

//https://leetcode.com/problems/vowel-spellchecker/
package com.testds.leetcode.problems.vowelSpellChecker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> vowels = new HashSet<>();
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelsMap = new HashMap<>();
        String keyWord;
        for (String word : wordlist) {
            vowels.add(word);
            if (!caseInsensitiveMap.containsKey(word.toLowerCase())) {
                caseInsensitiveMap.put(word.toLowerCase(), word);
            }

            keyWord = getKeyWord(word);
            if (!vowelsMap.containsKey(keyWord)) {
                vowelsMap.put(keyWord, word);
            }
        }
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            keyWord = getKeyWord(queries[i]);
            if (vowels.contains(queries[i])) {
                result[i] = queries[i];
            } else if (caseInsensitiveMap.containsKey(queries[i].toLowerCase())) {
                result[i] = caseInsensitiveMap.get(queries[i].toLowerCase());
            } else {
                result[i] = vowelsMap.getOrDefault(keyWord, "");
            }
        }
        return result;
    }

    private String getKeyWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    sb.append('a');
                    break;
                default:
                    sb.append(c);
            }
        }
        return sb.toString().toLowerCase();
    }

}

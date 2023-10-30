//https://leetcode.com/problems/group-anagrams/
package com.testds.leetcode.problems.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramToListOfStrings = new HashMap<>();
        for (String str : strs) {
            String anagram = getAnagramCode(str);
            if (!anagramToListOfStrings.containsKey(anagram))
                anagramToListOfStrings.put(anagram, new ArrayList<>());
            anagramToListOfStrings.get(anagram).add(str);
        }
        return new ArrayList<>(anagramToListOfStrings.values());
    }

    private String getAnagramCode(String str) {
        char[] chArray = new char[26];
        for (char ch : str.toCharArray()) {
            chArray[ch - 'a'] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] > 0)
                sb.append('a' + i).append(chArray[i]);
        }
        return sb.toString();
    }
}

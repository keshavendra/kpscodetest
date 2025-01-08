//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/
package com.testds.leetcode.problems.countPrefixSuffixPairs;


public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPrefixAndSuffix(String word, String target) {
        return isPrefix(word, target) && isSuffix(word, target);
    }

    private boolean isPrefix(String prefix, String target) {
        if (prefix == null && target == null) {
            return true;
        }
        if (prefix == null || target == null) {
            return false;
        }

        if (prefix.length() > target.length()) {
            return false;
        }

        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) != target.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSuffix(String suffix, String target) {
        if (suffix == null && target == null) {
            return true;
        }
        if (suffix == null || target == null) {
            return false;
        }

        if (suffix.length() > target.length()) {
            return false;
        }

        for (int i = 0; i < suffix.length(); i++) {
            if (suffix.charAt(suffix.length() - i - 1) != target.charAt(target.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}

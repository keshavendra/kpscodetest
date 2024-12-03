//https://leetcode.com/problems/longest-substring-without-repeating-characters/
package com.testds.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        int[] repeatedIndex = new int[128];
        int lastRepeatedIndex = 0;
        for (int index = 0; index < s.length(); index++) {
            //char ch = s.charAt(index);
            lastRepeatedIndex = Math.max(lastRepeatedIndex, repeatedIndex[s.charAt(index)]);
            longestSubstringLength = Math.max(longestSubstringLength, index - lastRepeatedIndex + 1);
            repeatedIndex[s.charAt(index)] = index + 1;
        }
        return longestSubstringLength;
    }
}

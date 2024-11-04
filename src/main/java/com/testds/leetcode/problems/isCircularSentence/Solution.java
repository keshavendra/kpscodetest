//https://leetcode.com/problems/circular-sentence/
package com.testds.leetcode.problems.isCircularSentence;

public class Solution {

    public boolean isCircularSentence(String sentence) {
        int currentIndex = 0;
        if (sentence.charAt(currentIndex) == sentence.charAt(sentence.length() - 1)) {
            while (currentIndex < sentence.length()) {
                if (sentence.charAt(currentIndex) == ' ') {
                    if (sentence.charAt(currentIndex - 1) != sentence.charAt(currentIndex + 1)) {
                        return false;
                    }
                }
                currentIndex++;
            }
            return true;
        }

        return false;
    }
}

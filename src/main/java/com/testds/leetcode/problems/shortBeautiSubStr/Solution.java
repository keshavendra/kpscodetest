//https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string
package com.testds.leetcode.problems.shortBeautiSubStr;

public class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int shortestBeautifulStringLength = -1, localLength;
        int count1 = 0, startIndex = 0, endIndex = 0;
        String shortestBeautifulString = "", temp;
        if (s.length() < k) {
            return shortestBeautifulString;
        } else {
            char ch;
            while (endIndex < s.length()) {
                ch = s.charAt(endIndex);
                if (ch == '1')
                    count1++;
                if (count1 == k) {
                    while (s.charAt(startIndex) != '1') {
                        startIndex++;
                    }
                    if (shortestBeautifulStringLength == -1) {
                        shortestBeautifulString = s.substring(startIndex, endIndex + 1);
                        shortestBeautifulStringLength = endIndex - startIndex + 1;
                    } else {
                        localLength = endIndex - startIndex + 1;
                        if (localLength < shortestBeautifulStringLength) {
                            shortestBeautifulString = s.substring(startIndex, endIndex + 1);
                            shortestBeautifulStringLength = localLength;
                        } else if (localLength == shortestBeautifulStringLength) {
                            temp = s.substring(startIndex, endIndex + 1);
                            if (shortestBeautifulString.compareTo(temp) > 0) {
                                shortestBeautifulString = temp;
                            }
                        }
                    }
                    if (shortestBeautifulStringLength == k) {
                        break;
                    }
                    count1--;
                    do {
                        startIndex++;
                    } while (s.charAt(startIndex) != '1');
                }
                endIndex++;
            }
        }

        return shortestBeautifulString;
    }
}

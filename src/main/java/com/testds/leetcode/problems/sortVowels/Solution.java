//https://leetcode.com/problems/sort-vowels-in-a-string
package com.testds.leetcode.problems.sortVowels;

public class Solution {

    public String sortVowels(String s) {
        int[] chars = new int[10];
        int index;
        for (char ch : s.toCharArray()) {
            if ((index = getIndex(ch)) != -1) {
                chars[index]++;
            }
        }
        index = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (getIndex(ch) != -1) {
                while (chars[index] == 0) {
                    index++;
                }
                ch = getCharacter(index);
                chars[index]--;
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    private char getCharacter(int index) {
        switch (index) {
            case 0:
                return 'A';
            case 1:
                return 'E';
            case 2:
                return 'I';
            case 3:
                return 'O';
            case 4:
                return 'U';
            case 5:
                return 'a';
            case 6:
                return 'e';
            case 7:
                return 'i';
            case 8:
                return 'o';
            case 9:
                return 'u';
            default:
                return ' ';

        }
    }

    private int getIndex(char ch) {
        switch (ch) {
            case 'A':
                return 0;
            case 'E':
                return 1;
            case 'I':
                return 2;
            case 'O':
                return 3;
            case 'U':
                return 4;
            case 'a':
                return 5;
            case 'e':
                return 6;
            case 'i':
                return 7;
            case 'o':
                return 8;
            case 'u':
                return 9;
            default:
                return -1;
        }
    }
}

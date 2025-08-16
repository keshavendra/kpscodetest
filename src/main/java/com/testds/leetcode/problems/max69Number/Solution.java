//https://leetcode.com/problems/maximum-69-number/
package com.testds.leetcode.problems.max69Number;

public class Solution {

    public int maximum69Number(int num) {
        switch (num) {
            case 9:
            case 99:
            case 999:
            case 9999:
                return num;
            default:
                return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
        }
    }

}

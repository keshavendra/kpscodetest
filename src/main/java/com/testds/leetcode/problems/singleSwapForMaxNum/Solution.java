//https://leetcode.com/problems/maximum-swap/
package com.testds.leetcode.problems.singleSwapForMaxNum;

import java.util.Arrays;

public class Solution {

    public int maximumSwap(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int i = len - 1;
        for (; i >= 0; i--) {
            if (chars[i] != str.charAt(len - 1 - i)) {
                break;
            }
        }
        if (i < 0)
            return num;
        int lastIndexOfBigNum = str.lastIndexOf(chars[i]);
        int firstIndexOfSmallNum = str.indexOf(str.charAt(len - 1 - i));
        StringBuilder sb = new StringBuilder(str.substring(0, firstIndexOfSmallNum));
        sb.append(chars[i])
                .append(str, firstIndexOfSmallNum + 1, lastIndexOfBigNum)
                .append(str.charAt(firstIndexOfSmallNum));
        if (lastIndexOfBigNum < str.length() - 1)
            sb.append(str.substring(lastIndexOfBigNum + 1));
        return Integer.parseInt(sb.toString());
    }
}

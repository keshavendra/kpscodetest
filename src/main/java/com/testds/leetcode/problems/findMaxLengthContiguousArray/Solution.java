//https://leetcode.com/problems/contiguous-array/
package com.testds.leetcode.problems.findMaxLengthContiguousArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findMaxLength(int[] nums) {
        int numOf1s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numOf1s--;
            } else {
                numOf1s++;
            }
            if (numOf1s == 0) {
                maxLength = i + 1;
                continue;
            }
            if (!map.containsKey(numOf1s)) {
                map.put(numOf1s, i);
            } else {
                temp = map.get(numOf1s);
                if (i - temp > maxLength) {
                    maxLength = i - temp;
                }
            }
        }
        return maxLength;
    }
}

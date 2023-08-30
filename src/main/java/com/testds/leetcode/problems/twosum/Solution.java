//https://leetcode.com/problems/two-sum/submissions/
package com.testds.leetcode.problems.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] resultArray = new int[2];
        numMap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (numMap.containsKey(target - num)) {
                resultArray[0] = numMap.get(target - num);
                resultArray[1] = i;
                break;
            }
            numMap.put(num, i);
        }
        return resultArray;
    }
}

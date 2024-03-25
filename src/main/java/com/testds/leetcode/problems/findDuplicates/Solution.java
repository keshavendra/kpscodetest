//https://leetcode.com/problems/find-all-duplicates-in-an-array/
package com.testds.leetcode.problems.findDuplicates;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int count = nums.length;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int num = nums[i];
            if (num < 0) {
                num = -num;
            }
            num %= count;
            if (nums[num] < 0) {
                if (num != 0)
                    resultList.add(num);
                else
                    resultList.add(count);
            }
            nums[num] *= -1;
        }

        return resultList;
    }
}

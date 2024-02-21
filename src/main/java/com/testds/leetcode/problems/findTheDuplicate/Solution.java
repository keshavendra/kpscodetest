//https://leetcode.com/problems/find-the-duplicate-number/
package com.testds.leetcode.problems.findTheDuplicate;

public class Solution {
    public int findDuplicate(int[] nums) {
        int dup = 0, i = 0;
        for (; i < nums.length; i++) {
            int index = nums[i]<0?-nums[i]:nums[i];
            if (nums[index] < 0) {
                dup = index;
                break;
            }
            nums[index] *= -1;
        }
        for(i=0;i<nums.length;i++){
            nums[i]=nums[i]<0?-nums[i]:nums[i];
        }
        return dup;
    }
}

//https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/
package com.testds.leetcode.problems.minimumPairRemoval;

import java.util.TreeMap;

public class Solution {
    public int minimumPairRemoval(int[] nums) {
        int numOfOperations = 0, lastIndex = nums.length - 1;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (!isSorted(nums, lastIndex)) {
            for (int i = lastIndex; i > 0; i--) {
                map.put(nums[i] + nums[i - 1], i);
                if (map.size() > 1) {
                    map.remove(map.lastKey());
                }
            }
            adjustArray(nums, map.firstEntry().getValue(), lastIndex);
            map.clear();
            lastIndex--;
            numOfOperations++;
        }
        return numOfOperations;
    }

    private void adjustArray(int[] nums, Integer index, int lastIndex) {
        nums[index - 1] += nums[index];
        for (int i = index; i < lastIndex; i++) {
            nums[i] = nums[i + 1];
        }
    }

    private boolean isSorted(int[] nums, int lastIndex) {
        for (int i = lastIndex; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

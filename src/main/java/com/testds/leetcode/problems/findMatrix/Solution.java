//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions
package com.testds.leetcode.problems.findMatrix;
/*
Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= nums.length

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] numFreq = new int[nums.length + 1];
        Map<Integer, List<Integer>> mapOfLists = new HashMap<>();
        for (int num : nums) {
            if (!mapOfLists.containsKey(numFreq[num])) {
                mapOfLists.put(numFreq[num], new ArrayList<>());
            }
            mapOfLists.get(numFreq[num]).add(num);
            numFreq[num] += 1;
        }
        return new ArrayList<>(mapOfLists.values());
    }
}

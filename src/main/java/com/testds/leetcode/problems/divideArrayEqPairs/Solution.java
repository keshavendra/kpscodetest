//https://leetcode.com/problems/divide-array-into-equal-pairs
package com.testds.leetcode.problems.divideArrayEqPairs;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return set.isEmpty();
    }
}

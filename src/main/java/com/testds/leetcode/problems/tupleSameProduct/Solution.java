//https://leetcode.com/problems/tuple-with-same-product/
package com.testds.leetcode.problems.tupleSameProduct;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> numToFrequencyCount = new HashMap<>();
        int product;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                product = nums[i] * nums[j];
                numToFrequencyCount.put(product,
                        numToFrequencyCount.getOrDefault(product, 0) + 1);
            }
        }
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : numToFrequencyCount.entrySet()) {
            if (entry.getValue() > 1) {
                count += (combinations(entry.getValue()) * 8);
            }
        }

        return count;
    }

    private int combinations(Integer value) {
        return value * (value - 1) / 2;
    }
}

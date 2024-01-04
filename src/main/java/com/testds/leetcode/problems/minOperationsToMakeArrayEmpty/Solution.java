//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty
package com.testds.leetcode.problems.minOperationsToMakeArrayEmpty;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int numOfOperations = 0;
        for (Integer frequency : frequencyMap.values()) {
            if (frequency % 3 == 0) {
                numOfOperations += frequency / 3;
            } else {
                int numOf3CanBeRemoved = 0;
                while (frequency >= 2) {
                    //create one group of 3
                    //if number is even then we need to remove 6 i.e 2*3
                    if (frequency % 2 == 0) {
                        if ((frequency - 6) >= 2) {
                            numOf3CanBeRemoved += 2;
                            frequency -= 6;
                        } else {
                            numOf3CanBeRemoved += frequency / 2;
                            frequency = 0;
                        }
                    } else {
                        if (frequency >= 5) {
                            numOf3CanBeRemoved += 1;
                            frequency -= 3;
                        } else {
                            return -1;
                        }
                    }
                }
                if (frequency != 0)
                    return -1;
                numOfOperations += numOf3CanBeRemoved;
            }
        }
        return numOfOperations;
    }
}

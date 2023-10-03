//https://leetcode.com/problems/number-of-good-pairs
/*
Constraints:

        1 <= nums.length <= 100
        1 <= nums[i] <= 100
*/

package com.testds.leetcode.problems.numberOfGoodPairs;

import java.util.stream.IntStream;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        short[] numFrequency = new short[101];
        for (int num : nums) {
            numFrequency[num] += 1;
        }

        return IntStream
                .rangeClosed(0, 100)
                .filter(x -> numFrequency[x] > 1)
                .map(x -> ((numFrequency[x] - 1) * (numFrequency[x])) / 2)
                .sum();
    }
}

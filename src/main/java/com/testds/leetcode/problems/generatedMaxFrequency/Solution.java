//https://leetcode.com/problems/frequency-of-the-most-frequent-element
package com.testds.leetcode.problems.generatedMaxFrequency;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    private int[] numArray;
    Set<Integer> numToFreqMap = new HashSet<>();

    public int maxFrequency(int[] nums, int k) {
        //sorting array
        numArray = nums;
        Arrays.sort(numArray);
        int maxFrequency = 0;
        for (int i = numArray.length - 1; i >= 0; i--) {
            int num = numArray[i];
            if (numToFreqMap.contains(num))
                continue;
            int count = 1 + countNum(num, i - 1, k);
            numToFreqMap.add(num);
            if (count > maxFrequency)
                maxFrequency = count;
        }
        return maxFrequency;
    }

    private int countNum(int target, int index, int valueForAddition) {
        if (index < 0 || valueForAddition < 0)
            return 0;
        if (numArray[index] + valueForAddition < target)
            return 0;
        return 1 + countNum(target, index - 1, valueForAddition - target + numArray[index]);
    }
}

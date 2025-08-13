//https://leetcode.com/problems/3sum/
package com.testds.leetcode.problems.sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfSetOfNumbers = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i] * (-1);
            int lower = 0, upper = nums.length - 1;
            while (lower < i && upper > i) {
                if (nums[lower] + nums[upper] == number) {
                    String str = nums[lower] + "#" + (number * (-1)) + "#" + nums[upper];
                    if (set.add(str)) {
                        listOfSetOfNumbers
                                .add(Arrays.asList(nums[lower], number * (-1), nums[upper]));
                    }
                    lower++;
                    upper--;
                } else if (nums[lower] + nums[upper] < number) {
                    lower++;
                } else {
                    upper--;
                }
            }
        }
        return listOfSetOfNumbers;
    }
}

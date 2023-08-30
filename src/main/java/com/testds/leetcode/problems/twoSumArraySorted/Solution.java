//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
package com.testds.leetcode.problems.twoSumArraySorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int front = 0, back = numbers.length - 1;
        while (front < back) {
            int sum = numbers[front] + numbers[back];
            if (sum == target) {
                result[0] = front + 1;
                result[1] = back + 1;
                break;
            } else if (sum < target)
                front++;
            else
                back--;
        }
        return result;
    }
}

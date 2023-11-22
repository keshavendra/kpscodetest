//https://leetcode.com/problems/diagonal-traverse-ii
package com.testds.leetcode.problems.diagonalTraverse2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, Stack<Integer>> mapOfSumOfRowAndColToNum = new HashMap<>();
        int count = 0;
        for (int rowIndex = 0; rowIndex < nums.size(); rowIndex++) {
            for (int colIndex = 0; colIndex < nums.get(rowIndex).size(); colIndex++) {
                int sum = rowIndex + colIndex;
                if (!mapOfSumOfRowAndColToNum.containsKey(sum))
                    mapOfSumOfRowAndColToNum.put(sum, new Stack<>());
                mapOfSumOfRowAndColToNum.get(sum).push(nums.get(rowIndex).get(colIndex));
                count++;
            }
        }
        int[] resultArray = new int[count];
        count = 0;
        int curr = 0;
        while (mapOfSumOfRowAndColToNum.containsKey(curr)) {
            Stack<Integer> stack = mapOfSumOfRowAndColToNum.get(curr++);
            while (!stack.isEmpty()) {
                resultArray[count++] = stack.pop();
            }
        }
        return resultArray;
    }
}

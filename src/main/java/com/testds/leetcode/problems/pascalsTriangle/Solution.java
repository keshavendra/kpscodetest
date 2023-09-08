//https://leetcode.com/problems/pascals-triangle/
package com.testds.leetcode.problems.pascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> firstList = Collections.singletonList(1);
        resultList.add(firstList);
        List<Integer> previousList = firstList;

        for (int i = 1; i < numRows; i++) {
            Integer[] newListArray = new Integer[i + 1];
            newListArray[0] = 1;
            for (int j = 1; j < i; j++) {
                newListArray[j] = previousList.get(j - 1) + previousList.get(j);
            }
            newListArray[i] = 1;
            resultList.add(Arrays.asList(newListArray));
            previousList = resultList.get(resultList.size() - 1);
        }

        return resultList;
    }
}

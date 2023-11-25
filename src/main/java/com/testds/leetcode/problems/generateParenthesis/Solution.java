//https://leetcode.com/problems/generate-parentheses
package com.testds.leetcode.problems.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int limit = 0;

    public List<String> generateParenthesis(int n) {
        limit = n;
        return getAll(0, 0, new ArrayList<>(), "");
    }

    private List<String> getAll(int left, int right, List<String> resultList, String resultString) {
        if (left < limit)
            getAll(left + 1, right, resultList, resultString + "(");
        if (right < left) {
            getAll(left, right + 1, resultList, resultString + ")");
        }
        if (left == right && left == limit)
            resultList.add(resultString);
        return resultList;
    }
}

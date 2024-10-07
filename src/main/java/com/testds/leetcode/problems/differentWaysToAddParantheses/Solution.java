//https://leetcode.com/problems/different-ways-to-add-parentheses/
package com.testds.leetcode.problems.differentWaysToAddParantheses;

import java.util.*;

public class Solution {

    private static final Set<Character> OPERATORS = new HashSet<>(Arrays.asList('+', '-', '*', '/'));
    private static final Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if (map.containsKey(expression)) {
            return map.get(expression);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if (OPERATORS.contains(expression.charAt(i))) {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (Integer leftValue : left) {
                    for (Integer rightValue : right) {
                        int result = 0;
                        switch (expression.charAt(i)) {
                            case '+':
                                result = leftValue + rightValue;
                                break;
                            case '-':
                                result = leftValue - rightValue;
                                break;
                            case '*':
                                result = leftValue * rightValue;
                                break;
                            case '/':
                                result = leftValue / rightValue;
                        }
                        res.add(result);
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.valueOf(expression));
        }
        map.put(expression, res);
        return res;
    }
}

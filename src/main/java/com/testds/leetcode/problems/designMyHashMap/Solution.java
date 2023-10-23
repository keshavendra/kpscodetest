package com.testds.leetcode.problems.designMyHashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    public static List<Integer> runTest(List<String> operationsList, int[][] valuesArray) {
        List<List<Integer>> valuesList = new ArrayList<>();
        for (int[] arr : valuesArray) {
            List<Integer> valueList = new ArrayList<>();
            for (int i : arr) {
                valueList.add(i);
            }
            valuesList.add(valueList);
        }
        return runTest(operationsList, valuesList);
    }

    public static List<Integer> runTest(List<String> operationsList, List<List<Integer>> valuesList) {
        MyHashMap myHashMap = null;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < operationsList.size(); i++) {
            String operation = operationsList.get(i);
            List<Integer> values = valuesList.get(i);
            Integer result = null;
            switch (operation) {
                case "MyHashMap":
                    myHashMap = new MyHashMap();
                    break;
                case "put":
                    Objects.requireNonNull(myHashMap).put(values.get(0), values.get(1));
                    break;
                case "remove":
                    Objects.requireNonNull(myHashMap).remove(values.get(0));
                    break;
                case "get":
                    result = Objects.requireNonNull(myHashMap).get(values.get(0));
            }
            resultList.add(result);
        }
        return resultList;
    }
}

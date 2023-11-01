//https://leetcode.com/problems/find-mode-in-binary-search-tree
package com.testds.leetcode.problems.findMode;

import com.testds.leetcode.utils.TreeNode;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public int[] findMode(TreeNode root) {
        Queue<TreeNode> queuedNodes = new LinkedList<>();
        queuedNodes.add(root);
        Map<Integer, Integer> valueToCountMap = new HashMap<>();
        while (!queuedNodes.isEmpty()) {
            TreeNode tempNode = queuedNodes.poll();
            valueToCountMap.put(tempNode.val, valueToCountMap.getOrDefault(tempNode.val, 0) + 1);
            if (tempNode.left != null)
                queuedNodes.add(tempNode.left);
            if (tempNode.right != null)
                queuedNodes.add(tempNode.right);
        }

        Map<Integer, List<Integer>> frequencyToValMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> mapEntry : valueToCountMap.entrySet()) {
            if (!frequencyToValMap.containsKey(mapEntry.getValue()))
                frequencyToValMap.put(mapEntry.getValue(), new ArrayList<>());
            frequencyToValMap.get(mapEntry.getValue()).add(mapEntry.getKey());
        }

        List<Integer> list = Objects.requireNonNull(frequencyToValMap
                        .entrySet()
                        .stream()
                        .max(Comparator.comparingInt(Map.Entry::getKey))
                        .orElse(null))
                .getValue();

        int[] resultArray = new int[list.size()];
        IntStream.range(0, resultArray.length).forEach(x -> resultArray[x] = list.get(x));
        return resultArray;
    }
}

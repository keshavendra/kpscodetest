//https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
package com.testds.leetcode.problems.amountOfTime;

import com.testds.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> neighboursMap = createAdjacencyMap(root);
        return findMaxDistanceNode(neighboursMap, start);
    }

    private int findMaxDistanceNode(Map<Integer, Set<Integer>> neighboursMap, int start) {
        int distance = 0;
        if (neighboursMap.containsKey(start) && neighboursMap.size() > 1) {
            Queue<Integer> neighbours = new LinkedList<>(neighboursMap.remove(start));
            neighbours.add(null);
            List<Integer> nextNeighbours = new ArrayList<>();
            while (!neighbours.isEmpty()) {
                Integer num = neighbours.poll();
                if (num == null) {
                    distance++;
                    if (nextNeighbours.isEmpty()) {
                        break;
                    } else {
                        neighbours.addAll(nextNeighbours);
                        neighbours.add(null);
                        nextNeighbours=new ArrayList<>();
                    }
                } else {
                    if (neighboursMap.containsKey(num)) {
                        for (Integer in : neighboursMap.get(num)) {
                            if (neighboursMap.containsKey(in))
                                nextNeighbours.add(in);
                        }
                        neighboursMap.remove(num);
                    }
                }
            }
        }
        return distance;
    }

    private Map<Integer, Set<Integer>> createAdjacencyMap(TreeNode node) {
        Map<Integer, Set<Integer>> adjacencyMap = new HashMap<>();
        if (node != null) {
            adjacencyMap.put(node.val, new HashSet<>());
        }
        //creating queue for BFS
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()) {
            node = nodeQueue.poll();
            if (!adjacencyMap.containsKey(node.val)) {
                adjacencyMap.put(node.val, new HashSet<>());
            }
            if (node.left != null) {
                adjacencyMap.get(node.val).add(node.left.val);
                if (!adjacencyMap.containsKey(node.left.val))
                    adjacencyMap.put(node.left.val, new HashSet<>());
                adjacencyMap.get(node.left.val).add(node.val);
                nodeQueue.add(node.left);
            }
            if (node.right != null) {
                adjacencyMap.get(node.val).add(node.right.val);
                if (!adjacencyMap.containsKey(node.right.val))
                    adjacencyMap.put(node.right.val, new HashSet<>());
                adjacencyMap.get(node.right.val).add(node.val);
                nodeQueue.add(node.right);
            }
        }
        return adjacencyMap;
    }
}

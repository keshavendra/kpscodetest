package com.testds.ds.trees.problems;

import com.testds.leetcode.utils.TreeNode;

import java.util.*;

public class VerticalSumInBinaryTree {

    public List<Integer> verticalSum(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            Queue<NodeWithIndex> queue = new LinkedList<>();
            queue.add(new NodeWithIndex(0, root));
            while (!queue.isEmpty()) {
                NodeWithIndex nodeWithIndex = queue.poll();
                map.put(nodeWithIndex.index,
                        map.getOrDefault(nodeWithIndex.index, 0) + nodeWithIndex.node.val);
                if (nodeWithIndex.node.left != null) {
                    queue.add(new NodeWithIndex(nodeWithIndex.index - 1, nodeWithIndex.node.left));
                }
                if (nodeWithIndex.node.right != null) {
                    queue.add(new NodeWithIndex(nodeWithIndex.index + 1, nodeWithIndex.node.right));
                }
            }
            result.addAll(map.values());
        }
        return result;
    }

    private static class NodeWithIndex {
        int index;
        TreeNode node;

        public NodeWithIndex(int index, TreeNode node) {
            this.index = index;
            this.node = node;
        }
    }

}

//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
package com.testds.leetcode.problems.verticalTraversal;

import com.testds.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            TreeMap<Integer, PriorityQueue<VerticalTraversalClass>> map = new TreeMap<>();
            Queue<VerticalTraversalClass> queue = new LinkedList<>();
            queue.add(new VerticalTraversalClass(0, root, 0));
            while (!queue.isEmpty()) {
                VerticalTraversalClass temp = queue.poll();
                if (!map.containsKey(temp.index)) {
                    map.put(temp.index, new PriorityQueue<>());
                }
                map.get(temp.index).add(temp);
                if (temp.node.left != null) {
                    queue.add(new VerticalTraversalClass(temp.index - 1, temp.node.left, temp.level + 1));
                }
                if (temp.node.right != null) {
                    queue.add(new VerticalTraversalClass(temp.index + 1, temp.node.right, temp.level + 1));
                }
            }
            for (PriorityQueue<VerticalTraversalClass> pQueue : map.values()) {
                List<Integer> list = new ArrayList<>();
                while (!pQueue.isEmpty()) {
                    list.add(pQueue.poll().node.val);
                }
                result.add(list);
            }
        }
        return result;
    }

    private static class VerticalTraversalClass implements Comparable<VerticalTraversalClass> {
        int index;
        TreeNode node;
        int level;

        public VerticalTraversalClass(int index, TreeNode node, int level) {
            this.index = index;
            this.node = node;
            this.level = level;
        }

        @Override
        public int compareTo(VerticalTraversalClass o) {
            if (this.level != o.level) {
                return this.level - o.level;
            }
            return this.node.val - o.node.val;
        }
    }
}

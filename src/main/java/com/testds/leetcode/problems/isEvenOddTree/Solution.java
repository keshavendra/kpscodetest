//https://leetcode.com/problems/even-odd-tree/
package com.testds.leetcode.problems.isEvenOddTree;

import com.testds.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        int index = 0;
        Queue<TreeNode> queueTreeNode = new LinkedList<>();
        queueTreeNode.add(root);
        queueTreeNode.add(null);
        Queue<TreeNode> nodes = new LinkedList<>();
        while (!queueTreeNode.isEmpty()) {
            TreeNode node = queueTreeNode.poll();
            if (node == null) {
                if (index % 2 == 0) {
                    if (!strictIncreasingOddValueOrder(nodes)) {
                        return false;
                    }
                } else {
                    if (!strictDecreasingEvenValueOrder(nodes)) {
                        return false;
                    }
                }
                nodes = new LinkedList<>();
                index++;
                if (!queueTreeNode.isEmpty()) {
                    queueTreeNode.add(null);
                }
            } else {
                nodes.add(node);
                if (node.left != null)
                    queueTreeNode.add(node.left);
                if (node.right != null)
                    queueTreeNode.add(node.right);
            }
        }
        return true;
    }

    private boolean strictDecreasingEvenValueOrder(Queue<TreeNode> value) {
        TreeNode prev = value.poll();
        assert prev != null;
        if (prev.val % 2 != 0)
            return false;
        while (!value.isEmpty()) {
            TreeNode currentNode = value.poll();
            if (currentNode.val >= prev.val || currentNode.val % 2 != 0) {
                return false;
            }
            prev = currentNode;
        }
        return true;
    }

    private boolean strictIncreasingOddValueOrder(Queue<TreeNode> value) {
        TreeNode prev = value.poll();
        assert prev != null;
        if (prev.val % 2 != 1)
            return false;
        while (!value.isEmpty()) {
            TreeNode currentNode = value.poll();
            if (currentNode.val <= prev.val || currentNode.val % 2 != 1) {
                return false;
            }
            prev = currentNode;
        }
        return true;
    }
}

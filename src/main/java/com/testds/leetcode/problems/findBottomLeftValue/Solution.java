//https://leetcode.com/problems/find-bottom-left-tree-value/
package com.testds.leetcode.problems.findBottomLeftValue;

import com.testds.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.add(null);
        int lastNode = root.val;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            if (node == null) {
                if (!nodeQueue.isEmpty()) {
                    lastNode = nodeQueue.peek().val;
                    nodeQueue.add(null);
                }
            } else {
                if (node.left != null) {
                    nodeQueue.add(node.left);
                }
                if (node.right != null) {
                    nodeQueue.add(node.right);
                }
            }
        }
        return lastNode;
    }
}

//https://leetcode.com/problems/leaf-similar-trees/
package com.testds.leetcode.problems.leafSimilar;

import com.testds.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        Queue<TreeNode> leafNodes1 = getLeafQueue(root1);
        return checkLeafOrder(leafNodes1, root2);
    }

    private Queue<TreeNode> getLeafQueue(TreeNode root) {
        Queue<TreeNode> leafNodesQueue = new LinkedList<>();
        if (root != null) {
            if (root.left == null && root.right == null) {
                leafNodesQueue.add(root);
            } else {
                Stack<TreeNode> nodesQueue = new Stack<>();
                nodesQueue.add(root);
                while (!nodesQueue.isEmpty()) {
                    TreeNode temp = nodesQueue.pop();
                    if (temp.left != null || temp.right != null) {
                        if (temp.right != null)
                            nodesQueue.add(temp.right);
                        if (temp.left != null)
                            nodesQueue.add(temp.left);
                    } else {
                        leafNodesQueue.add(temp);
                    }

                }
            }
        }
        return leafNodesQueue;
    }

    private boolean checkLeafOrder(Queue<TreeNode> leafNodeQueue1, TreeNode root) {
        if (root != null) {
            if (leafNodeQueue1.isEmpty())
                return false;
            Stack<TreeNode> secondStack = new Stack<>();
            secondStack.add(root);
            while (!secondStack.isEmpty()) {
                root = secondStack.pop();
                if (root.left == null && root.right == null) {
                    if (leafNodeQueue1.isEmpty()) {
                        return false;
                    }
                    if (root.val != leafNodeQueue1.poll().val) {
                        return false;
                    }
                } else {
                    if (root.right != null)
                        secondStack.add(root.right);
                    if (root.left != null)
                        secondStack.add(root.left);
                }
            }
        } else {
            if (!leafNodeQueue1.isEmpty())
                return false;
        }
        return leafNodeQueue1.isEmpty();
    }
}

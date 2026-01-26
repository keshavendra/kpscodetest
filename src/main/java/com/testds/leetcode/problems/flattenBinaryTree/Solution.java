//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
package com.testds.leetcode.problems.flattenBinaryTree;

import com.testds.leetcode.utils.TreeNode;

public class Solution {

    private TreeNode lastVisited;

    public void flatten(TreeNode root) {
        performPreOrderTraversal(root);
    }

    private void performPreOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        if (lastVisited == null) {
            lastVisited = root;
        } else {
            lastVisited.right = root;
            lastVisited = root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left != null) {
            performPreOrderTraversal(left);
        }

        if (right != null) {
            performPreOrderTraversal(right);
        }
        root.left = null;
    }
}

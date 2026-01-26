package com.testds.ds.trees.problems;

import com.testds.leetcode.utils.TreeNode;

public class ConvertBSTToDLL {

    TreeNode lastVisited;
    TreeNode head = null;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBSTToDll(root);
        return head;
    }

    private void convertBSTToDll(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (root.left != null) {
            convertBSTToDll(left);
        }

        if (lastVisited != null) {
            lastVisited.right = root;
            root.left = lastVisited;
        } else {
            head = root;
        }
        lastVisited = root;
        if (right != null) {
            convertBSTToDll(right);
        }
    }

}

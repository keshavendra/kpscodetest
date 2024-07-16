package com.testds.leetcode.utils;

import com.testds.utils.annotation.Generated;

@Generated
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTree(Integer[] nodes) {
        if (nodes != null && nodes.length > 0) {
            TreeNode[] nodesArray = new TreeNode[nodes.length];
            for (int i = nodes.length - 1; i >= 0; i--) {
                if (nodes[i] != null) {
                    nodesArray[i] = new TreeNode(nodes[i]);
                    nodesArray[i].left = i * 2 + 1 < nodesArray.length ? nodesArray[i * 2 + 1] : null;
                    nodesArray[i].right = i * 2 + 2 < nodesArray.length ? nodesArray[i * 2 + 2] : null;
                }
            }
            return nodesArray[0];
        }
        return null;
    }

    public static boolean treesAreEqual(TreeNode root1, TreeNode root2) {
        if ((root1 != null && root2 == null) || (root1 == null && root2 != null))
            return false;
        if (root1 == null && root2 == null)
            return true;
        if (root1.val != root2.val)
            return false;
        return treesAreEqual(root1.left, root2.left) && treesAreEqual(root1.right, root2.right);
    }
}
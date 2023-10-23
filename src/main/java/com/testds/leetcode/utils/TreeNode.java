package com.testds.leetcode.utils;

import com.testds.utils.annotation.Generated;

@Generated
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
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
}
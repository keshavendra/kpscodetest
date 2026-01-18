package com.testds.ds.trees.problems;

import com.testds.ds.trees.TreeNode;

/*
Given a tree with a special property where leaves are represented with 'L'
and internal node with 'I'.
Also, assume that each node has eaither 0 or 2 children.
Given preorder traversal of this tree, construct the tree.
Example
PreOrder String => ILILL
            I
           / \
          /   \
          L    I
              / \
             /   \
            L     L
 */
public class BuildTreeFromPreOrderTraversalString {

    private int index = 0;

    public TreeNode buildTree(String preorder) {
        if (preorder == null || preorder.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(preorder.charAt(index++));
        if (preorder.charAt(index - 1) == 'I') {
            root.setLeft(buildTree(preorder));
            root.setRight(buildTree(preorder));
        }
        return root;
    }
}

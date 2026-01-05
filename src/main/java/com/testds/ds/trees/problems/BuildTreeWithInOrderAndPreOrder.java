package com.testds.ds.trees.problems;

import com.testds.ds.trees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeWithInOrderAndPreOrder {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null
                || preorder.length == 0
                || inorder == null
                || inorder.length == 0) {
            return null;
        }
        buildMapForInOrderAndIndex(inorder);
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    private void buildMapForInOrderAndIndex(int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
    }

    private TreeNode buildTree(int[] preOrder,
                               int[] inOrder,
                               int inOrderStart,
                               int inOrderEnd,
                               int preOrderStart,
                               int preOrderEnd) {
        TreeNode root = new TreeNode(preOrder[preOrderStart]);
        if (inOrderStart < inOrderEnd) {
            int indexOfNode = map.get(root.getValue());
            int nodesInLeft = indexOfNode - inOrderStart;
            if (nodesInLeft > 0) {
                root.setLeft(buildTree(
                        preOrder,
                        inOrder,
                        inOrderStart,
                        indexOfNode - 1,
                        preOrderStart + 1,
                        preOrderStart + nodesInLeft
                ));
            }
            if (indexOfNode < inOrderEnd) {
                root.setRight(buildTree(
                        preOrder,
                        inOrder,
                        indexOfNode + 1,
                        inOrderEnd,
                        preOrderStart + nodesInLeft + 1,
                        preOrderEnd
                ));
            }
        }
        return root;
    }

}

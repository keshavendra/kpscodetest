package com.testds.ds.trees.problems;

import com.testds.ds.trees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeWithInOrderAndLevelOrder {

    Map<Integer, Integer> valueToLevelIndex = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] levelOrder) {
        if (inorder == null || inorder.length == 0 || levelOrder == null || levelOrder.length == 0) {
            return null;
        }

        for (int i = 0; i < levelOrder.length; i++) {
            valueToLevelIndex.put(levelOrder[i], i);
        }

        return buildTree(inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootIndex = findLowestLevelIndexFromInOrder(inorder, left, right);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        root.setLeft(buildTree(inorder, left, rootIndex - 1));
        root.setRight(buildTree(inorder, rootIndex + 1, right));
        return root;
    }

    private int findLowestLevelIndexFromInOrder(int[] inorder, int left, int right) {
        int minIndex = left, minLevelIndex = right + 1;
        for (int i = left; i <= right; i++) {
            if (valueToLevelIndex.getOrDefault(inorder[i], 0) < minLevelIndex) {
                minIndex = i;
                minLevelIndex = valueToLevelIndex.getOrDefault(inorder[i], 0);
            }
        }
        return minIndex;
    }

}

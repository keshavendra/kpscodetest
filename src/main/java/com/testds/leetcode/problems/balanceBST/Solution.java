//https://leetcode.com/problems/balance-a-binary-search-tree/
package com.testds.leetcode.problems.balanceBST;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<TreeNode> inOrderNodeList;

    public TreeNode balanceBST(TreeNode root) {
        inOrderNodeList = new ArrayList<>();
        inOrderTraverse(root);
        return generateBalancedTree(0, inOrderNodeList.size() - 1);
    }

    private TreeNode generateBalancedTree(int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        TreeNode node = inOrderNodeList.get(mid);
        node.left = generateBalancedTree(startIndex, mid - 1);
        node.right = generateBalancedTree(mid + 1, endIndex);
        return node;
    }

    private void inOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        inOrderNodeList.add(node);
        inOrderTraverse(node.right);
    }
}

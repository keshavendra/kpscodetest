//https://leetcode.com/problems/binary-tree-paths
package com.testds.leetcode.problems.binaryTreePaths;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) {
            binaryTreePaths(root, new int[256], 0);
        }
        return result;
    }

    private void binaryTreePaths(TreeNode node, int[] path, int level) {
        if (node == null) {
            return;
        }
        path[level] = node.val;
        if (node.left == null && node.right == null) {
            addResultToArray(path, level);
            return;
        }

        if (node.left != null) {
            binaryTreePaths(node.left, path, level + 1);
        }
        if (node.right != null) {
            binaryTreePaths(node.right, path, level + 1);
        }
    }

    private void addResultToArray(int[] path, int level) {
        StringBuilder sb = new StringBuilder();
        if (level >= 0) {
            sb.append(path[0]);
            for (int i = 1; i <= level; i++) {
                sb.append("->")
                        .append(path[i]);
            }
        }
        result.add(sb.toString());
    }
}

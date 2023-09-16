//https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
package com.testds.leetcode.problems.maxDepthOfBinaryTree;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(
                (root.left == null ? 0 : maxDepth(root.left)),
                (root.right == null ? 0 : maxDepth(root.right))
        ) + 1;
    }
}

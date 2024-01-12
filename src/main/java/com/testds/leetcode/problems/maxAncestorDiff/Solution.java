//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
package com.testds.leetcode.problems.maxAncestorDiff;

import com.testds.leetcode.utils.TreeNode;

public class Solution {

    private int maxDiff = -1;

    public int maxAncestorDiff(TreeNode root) {
        calculateMinMaxAndDiff(root);
        return maxDiff;
    }

    private int[] calculateMinMaxAndDiff(TreeNode root) {
        if (root.left == null && root.right == null)
            return new int[]{root.val, root.val};

        int[] minMaxFromLeftSubTree = root.left != null ? calculateMinMaxAndDiff(root.left) : null;
        int[] minMaxFromRightSubTree = root.right != null ? calculateMinMaxAndDiff(root.right) : null;

        int[] minMaxResult = new int[]{root.val, root.val};
        if (minMaxFromLeftSubTree != null) {
            minMaxResult[0] = Math.min(minMaxFromLeftSubTree[0], minMaxResult[0]);
            minMaxResult[1] = Math.max(minMaxFromLeftSubTree[1], minMaxResult[1]);
        }
        if (minMaxFromRightSubTree != null) {
            minMaxResult[0] = Math.min(minMaxFromRightSubTree[0], minMaxResult[0]);
            minMaxResult[1] = Math.max(minMaxFromRightSubTree[1], minMaxResult[1]);
        }
        maxDiff = Math.max(maxDiff, Math.abs(root.val - minMaxResult[0]));
        maxDiff = Math.max(maxDiff, Math.abs(root.val - minMaxResult[1]));
        return minMaxResult;
    }
}

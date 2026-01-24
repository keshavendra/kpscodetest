//https://leetcode.com/problems/balanced-binary-tree/
package com.testds.leetcode.problems.isBalancedBinaryTree;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    private boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        checkAndUpdateBalanced(root);
        return balanced;
    }

    private int checkAndUpdateBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(!balanced){
            return 0;
        }
        int left = checkAndUpdateBalanced(root.left);
        if(!balanced){
            return 0;
        }
        int right = checkAndUpdateBalanced(root.right);
        if (Math.abs(left - right) > 1) {
            balanced = false;
        }
        return Math.max(left, right) + 1;
    }
}

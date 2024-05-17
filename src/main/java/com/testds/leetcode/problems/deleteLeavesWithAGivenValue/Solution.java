//https://leetcode.com/problems/delete-leaves-with-a-given-value/
package com.testds.leetcode.problems.deleteLeavesWithAGivenValue;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }
        if (root.left == null && root.right == null && root.val == target)
            root = null;
        return root;
    }
}

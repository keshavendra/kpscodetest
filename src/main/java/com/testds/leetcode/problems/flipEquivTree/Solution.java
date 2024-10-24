//https://leetcode.com/problems/flip-equivalent-binary-trees/
package com.testds.leetcode.problems.flipEquivTree;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;
        if (root1.left == null
                && root2.left == null
                && root1.right == null
                && root2.right == null)
            return true;

        TreeNode root1Left = root1.left;
        TreeNode root1Right = root1.right;
        TreeNode root2Left = root2.left;
        TreeNode root2Right = root2.right;

        //check if root1left matches root2left
        if (root1Left != null && root2Left != null && root1Left.val == root2Left.val)
            return flipEquiv(root1Left, root2Left) && flipEquiv(root1Right, root2Right);
        if (root1Left != null && root2Right != null && root1Left.val == root2Right.val)
            return flipEquiv(root1Left, root2Right) && flipEquiv(root1Right, root2Left);
        if (root1Right != null && root2Left != null && root1Right.val == root2Left.val)
            return flipEquiv(root1Right, root2Left) && flipEquiv(root1Left, root2Right);
        if (root1Right != null && root2Right != null && root1Right.val == root2Right.val)
            return flipEquiv(root1Right, root2Right) && flipEquiv(root1Left, root2Left);
        return false;
    }
}

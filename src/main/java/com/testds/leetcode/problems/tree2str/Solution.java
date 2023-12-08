//https://leetcode.com/problems/construct-string-from-binary-tree/
package com.testds.leetcode.problems.tree2str;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    public String tree2str(TreeNode root) {
        if (root.left == null && root.right == null)
            return String.valueOf(root.val);
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("(");
        if (root.left != null) {
            sb.append(tree2str(root.left));
        }
        sb.append(")");
        if (root.right != null) {
            sb.append("(").append(tree2str(root.right)).append(")");
        }
        return sb.toString();
    }
}

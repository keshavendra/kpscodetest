//https://leetcode.com/problems/binary-tree-inorder-traversal/
package com.testds.leetcode.problems.inorderTraversal;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root != null) {
            if (root.left != null)
                resultList.addAll(inorderTraversal(root.left));
            resultList.add(root.val);
            if (root.right != null)
                resultList.addAll(inorderTraversal(root.right));
        }
        return resultList;
    }
}

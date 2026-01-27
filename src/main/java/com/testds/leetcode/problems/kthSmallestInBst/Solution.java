//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package com.testds.leetcode.problems.kthSmallestInBst;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return -1;
        int left = kthSmallest(root.left, k);
        if (left != -1)
            return left;
        if (++count == k)
            return root.val;
        return kthSmallest(root.right, k);
    }
}

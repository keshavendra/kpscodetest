//https://leetcode.com/problems/range-sum-of-bst/
package com.testds.leetcode.problems.rangeSumBST;

import com.testds.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<>();
        int rangeSum = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp.val >= low && temp.val <= high) {
                rangeSum += temp.val;
            }
            if (temp.left != null && temp.val > low) {
                queue.add(temp.left);
            }
            if (temp.val < high && temp.right != null) {
                queue.add(temp.right);
            }
        }
        return rangeSum;
    }
}

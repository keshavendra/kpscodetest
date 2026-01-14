//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
package com.testds.leetcode.problems.maxLevelSumOfABinaryTree;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        // Edge case – empty tree (LeetCode returns 0 for this input)
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int maxSum = Integer.MIN_VALUE;
        int answerLevel = 1;   // level numbers are 1‑based
        int level = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();   // number of nodes on this level
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();   // never null here
                levelSum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // Keep the smallest level index when sums are equal (as per problem statement)
            if (levelSum > maxSum) {
                maxSum = levelSum;
                answerLevel = level;
            }

            level++;
        }

        return answerLevel;
    }
}

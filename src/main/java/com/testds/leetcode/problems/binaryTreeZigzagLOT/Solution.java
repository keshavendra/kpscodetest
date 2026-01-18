//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
package com.testds.leetcode.problems.binaryTreeZigzagLOT;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> currentLevel = new Stack<>();
            Stack<TreeNode> nextLevel = new Stack<>();
            Stack<TreeNode> temp;
            boolean leftToRight = true;
            List<Integer> level = new ArrayList<>();
            currentLevel.push(root);
            while (!currentLevel.isEmpty()) {
                TreeNode current = currentLevel.pop();
                level.add(current.val);
                if (leftToRight) {
                    if (current.left != null) {
                        nextLevel.push(current.left);
                    }
                    if (current.right != null) {
                        nextLevel.push(current.right);
                    }
                } else {
                    if (current.right != null) {
                        nextLevel.push(current.right);
                    }
                    if (current.left != null) {
                        nextLevel.push(current.left);
                    }
                }
                if (currentLevel.isEmpty()) {
                    result.add(level);
                    level = new ArrayList<>();
                    leftToRight = !leftToRight;
                    temp = currentLevel;
                    currentLevel = nextLevel;
                    nextLevel = temp;
                }
            }
        }
        return result;
    }
}

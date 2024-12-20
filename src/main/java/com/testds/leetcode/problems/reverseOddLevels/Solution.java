//https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/
package com.testds.leetcode.problems.reverseOddLevels;

import com.testds.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode temp;
        boolean isOddLevel = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        Stack<Integer> valueStack = new Stack<>();
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp != null) {
                if (temp.left != null) {
                    queue.add(temp.left);
                    if (!isOddLevel) {
                        valueStack.push(temp.left.val);
                    }
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                    if (!isOddLevel) {
                        valueStack.push(temp.right.val);
                    }
                }
                if (isOddLevel) {
                    temp.val = valueStack.pop();
                }
            } else {
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                isOddLevel = !isOddLevel;
            }
        }
        return root;
    }

}

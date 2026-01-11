//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
package com.testds.leetcode.problems.binaryTreeLevelOrderTraversal2;

import com.testds.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultantList = new ArrayList<>();
        if (root != null) {
            Stack<List<Integer>> resultList = new Stack<>();
            Queue<TreeNode> queue = new LinkedList<>();
            List<Integer> innerList = new ArrayList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root != null) {
                    if (root.left != null)
                        queue.add(root.left);
                    if (root.right != null)
                        queue.add(root.right);
                    innerList.add(root.val);
                } else {
                    if (!queue.isEmpty()) {
                        queue.add(null);
                    }
                    resultList.push(innerList);
                    innerList = new ArrayList<>();
                }
            }
            while (!resultList.isEmpty())
                resultantList.add(resultList.pop());
        }
        return resultantList;
    }
}

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/
package com.testds.leetcode.problems.largestValuesInEachTreeRow;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root != null) {
            TreeNode temp = root;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(temp);
            queue.add(null);
            int localMin = Integer.MIN_VALUE;
            while (!queue.isEmpty()) {
                temp = queue.poll();
                if (temp != null) {
                    if (temp.val > localMin) {
                        localMin = temp.val;
                    }
                    if (temp.left != null)
                        queue.add(temp.left);
                    if (temp.right != null)
                        queue.add(temp.right);
                } else {
                    resultList.add(localMin);
                    localMin = Integer.MIN_VALUE;
                    if (!queue.isEmpty())
                        queue.add(null);
                }
            }
        }
        return resultList;
    }
}

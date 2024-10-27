//https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/
package com.testds.leetcode.problems.kthLargestLevelSumInTree;

import com.testds.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long localSum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                pq.add(localSum);
                if (pq.size() > k) {
                    pq.poll();
                }
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                localSum = 0;
            } else {
                localSum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        long result = -1L;
        if (!pq.isEmpty() && pq.size() >= k) result = pq.peek();
        return result;
    }

}

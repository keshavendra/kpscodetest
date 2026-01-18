//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
package com.testds.leetcode.problems.populateNextRightPointer;

import com.testds.leetcode.utils.binaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node connect(Node root) {
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {

                Node node = queue.poll();
                if (node == null) {
                    if (!queue.isEmpty()) {
                        queue.add(null);
                    }
                } else {
                    node.next = queue.peek();
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
        }
        return root;
    }
}

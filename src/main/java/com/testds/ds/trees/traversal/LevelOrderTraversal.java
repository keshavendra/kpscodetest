package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                root = queue.poll();
                result.add(root.getValue());
                if (root.getLeft() != null) {
                    queue.add(root.getLeft());
                }
                if (root.getRight() != null) {
                    queue.add(root.getRight());
                }
            }
        }
        return result;
    }

}

package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public List<Integer> preOrderTraversalWithRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            result.add(root.getValue());

            if (root.getLeft() != null) {
                result.addAll(this.preOrderTraversalWithRecursion(root.getLeft()));
            }

            if (root.getRight() != null) {
                result.addAll(this.preOrderTraversalWithRecursion(root.getRight()));
            }
        }
        return result;
    }

    public List<Integer> preOrderTraversalWithoutRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (true) {
                if (root != null) {
                    result.add(root.getValue());
                    stack.push(root);
                    root = root.getLeft();
                } else {
                    if (stack.isEmpty()) {
                        break;
                    }
                    root = stack.pop();
                    root = root.getRight();
                }
            }
        }
        return result;
    }

}

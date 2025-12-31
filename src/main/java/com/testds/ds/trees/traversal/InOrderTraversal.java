package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public List<Integer> inOrderTraversalWithRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            if (root.getLeft() != null) {
                result.addAll(inOrderTraversalWithRecursion(root.getLeft()));
            }
            result.add(root.getValue());
            if (root.getRight() != null) {
                result.addAll(inOrderTraversalWithRecursion(root.getRight()));
            }
        }
        return result;
    }

    public List<Integer> inOrderTraversalWithoutRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (true) {
                if (root != null) {
                    if (root.getLeft() != null) {
                        stack.push(root);
                        root = root.getLeft();
                    } else {
                        result.add(root.getValue());
                        root = root.getRight();
                    }
                } else {
                    if (stack.isEmpty()) {
                        break;
                    }
                    root = stack.pop();
                    result.add(root.getValue());
                    root = root.getRight();
                }
            }
        }
        return result;
    }

}

package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public List<Integer> postOrderTraversalWithRecursion(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(postOrderTraversalWithRecursion(root.getLeft()));
        result.addAll(postOrderTraversalWithRecursion(root.getRight()));
        result.add(root.getValue());
        return result;
    }

    public List<Integer> postOrderTraversalWithoutRecursion(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (root != null) {
                if (root.getRight() != null) {
                    stack.push(root.getRight());
                }
                stack.push(root);
                root = root.getLeft();
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                root = stack.pop();
                if (root.getRight() == null) {
                    list.add(root.getValue());
                    root = null;
                } else {
                    if (stack.isEmpty()) {
                        list.add(root.getValue());
                        break;
                    } else {
                        if (root.getRight() == stack.peek()) {
                            TreeNode right = stack.pop();
                            stack.push(root);
                            root = right;
                        } else {
                            list.add(root.getValue());
                            root = null;
                        }
                    }
                }
            }
        }
        return list;
    }

}

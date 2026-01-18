package com.testds.leetcode.utils.binaryTree;


/*
this is special node for problems where TreeNode has left, right and pointer to sibling
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static Node createTree(Integer[] nodes) {
        if (nodes != null && nodes.length > 0) {
            Node[] nodesArray = new Node[nodes.length];
            for (int i = nodes.length - 1; i >= 0; i--) {
                if (nodes[i] != null) {
                    nodesArray[i] = new Node(nodes[i]);
                    nodesArray[i].left = i * 2 + 1 < nodesArray.length ? nodesArray[i * 2 + 1] : null;
                    nodesArray[i].right = i * 2 + 2 < nodesArray.length ? nodesArray[i * 2 + 2] : null;
                }
            }
            return nodesArray[0];
        }
        return null;
    }
}

//https://leetcode.com/problems/delete-node-in-a-bst
package com.testds.leetcode.problems.deleteNodeInABST;

import com.testds.leetcode.utils.TreeNode;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        TreeNode[] nodeAndParent = findNodeAndParentToBeDeleted(root, key, null);
        if (nodeAndParent == null)
            return root;

        if (nodeAndParent[0].left == null && nodeAndParent[0].right == null) {
            if (nodeAndParent[1] == null)
                return null;
            else {
                if (nodeAndParent[1].left == nodeAndParent[0]) {
                    nodeAndParent[1].left = null;
                } else {
                    nodeAndParent[1].right = null;
                }
                return root;
            }
        }

        //If node to be deleted, the left is not null, find the predecessor
        if (nodeAndParent[0].left != null) {
            TreeNode[] theInOrderPredecessorAndParent = findTheInOrderPredecessorAndParent(nodeAndParent[0].left, nodeAndParent[0]);
            if (theInOrderPredecessorAndParent == null)
                return null;
            //replace the node's value to predecessor's value
            nodeAndParent[0].val = theInOrderPredecessorAndParent[0].val;

            //a predecessor could be a node with left child only
            //it is it's parent's left child only in case it is immediate child of the node to be deleted.
            //else it will be right child of it's parent
            if (theInOrderPredecessorAndParent[1].left == theInOrderPredecessorAndParent[0]) {
                //reference to the predecessor node is removed.
                theInOrderPredecessorAndParent[1].left = theInOrderPredecessorAndParent[0].left;
            } else {
                //reference to the predecessor node is removed
                theInOrderPredecessorAndParent[1].right = theInOrderPredecessorAndParent[0].left;
            }
            return root;
        } else {
            if (nodeAndParent[1] == null) {
                //root node itself
                return nodeAndParent[0].right;
            } else {
                if (nodeAndParent[1].left == nodeAndParent[0]) {
                    nodeAndParent[1].left = nodeAndParent[0].right;
                } else {
                    nodeAndParent[1].right = nodeAndParent[0].right;
                }
                return root;
            }
        }
    }

    private TreeNode[] findTheInOrderPredecessorAndParent(TreeNode child, TreeNode parent) {
        if (child == null)
            return null;
        if (child.right == null)
            return new TreeNode[]{child, parent};
        return findTheInOrderPredecessorAndParent(child.right, child);
    }

    private TreeNode[] findNodeAndParentToBeDeleted(TreeNode root, int key, TreeNode parent) {
        if (root == null)
            return null;
        if (root.val == key) {
            return new TreeNode[]{root, parent};
        }
        if (key < root.val)
            return findNodeAndParentToBeDeleted(root.left, key, root);
        return findNodeAndParentToBeDeleted(root.right, key, root);
    }
}

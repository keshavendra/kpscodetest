//https://leetcode.com/problems/create-binary-tree-from-descriptions/
package com.testds.leetcode.problems.makeBinaryTreeWithParentChildInfo;

import com.testds.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> possibleRoot = new HashSet<>();
        TreeNode parent,child;
        for (int[] description : descriptions) {
            parent = map.get(description[0]);
            child = map.get(description[1]);
            if (parent == null) {
                parent = new TreeNode(description[0]);
                map.put(description[0], parent);
                possibleRoot.add(description[0]);
            }
            if (child == null) {
                child = new TreeNode(description[1]);
                map.put(description[1], child);
            }
            possibleRoot.remove(child.val);
            if (description[2] == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }
        return map.get(possibleRoot.iterator().next());
    }
}

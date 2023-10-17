//https://leetcode.com/problems/validate-binary-tree-nodes
package com.testds.leetcode.problems.validateBinaryTreeNodes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Queue<Integer> bfsQueue = new LinkedList<>();
        int parentOfAll = 0;
        for (int i = 0; i < leftChild.length; i++) {
            parentOfAll ^= i;
            if (leftChild[i] != -1)
                parentOfAll ^= leftChild[i];
            if (rightChild[i] != -1)
                parentOfAll ^= rightChild[i];
        }
        bfsQueue.add(parentOfAll);
        Set<Integer> visitedNodes = new HashSet<>();
        while (!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            if (!visitedNodes.add(node) || node >= n) {
                return false;
            }
            if (leftChild[node] != -1)
                bfsQueue.add(leftChild[node]);
            if (rightChild[node] != -1)
                bfsQueue.add(rightChild[node]);
        }
        return visitedNodes.size() == n;
    }
}

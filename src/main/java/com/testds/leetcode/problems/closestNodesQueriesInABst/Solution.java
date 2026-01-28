//https://leetcode.com/problems/closest-nodes-queries-in-a-binary-search-tree/
package com.testds.leetcode.problems.closestNodesQueriesInABst;

import com.testds.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution {
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        performInOrderTraversal(root, current);
        for (Integer query : queries) {
            performBinarySearchToFindFloor(result, current, query);
        }
        return result;
    }

    private void performBinarySearchToFindFloor(List<List<Integer>> result, List<Integer> current, Integer query) {
        int start = 0, end = current.size() - 1, mid, floor = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (Objects.equals(query, current.get(mid))) {
                result.add(Arrays.asList(query, query));
                return;
            }
            if (current.get(mid) < query) {
                start = mid + 1;
                if (floor == -1) {
                    floor = mid;
                } else if (current.get(mid) > current.get(floor)) {
                    floor = mid;
                }
            } else {
                end = mid - 1;
            }
        }
        if (floor == -1) {
            result.add(Arrays.asList(-1, current.get(0)));
        } else if (floor == current.size() - 1) {
            result.add(Arrays.asList(current.get(floor), -1));
        } else {
            result.add(Arrays.asList(current.get(floor), current.get(floor + 1)));
        }
    }

    private void performInOrderTraversal(TreeNode root, List<Integer> current) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            current.add(root.val);
            return;
        }
        if (root.left != null) {
            performInOrderTraversal(root.left, current);
        }
        current.add(root.val);
        if (root.right != null) {
            performInOrderTraversal(root.right, current);
        }
    }
}

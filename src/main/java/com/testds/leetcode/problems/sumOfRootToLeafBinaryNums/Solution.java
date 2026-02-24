//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
package com.testds.leetcode.problems.sumOfRootToLeafBinaryNums;

import com.testds.leetcode.utils.TreeNode;

public class Solution {

    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        sumRootToLeaf(root, 0);
        return sum;
    }

    private void sumRootToLeaf(TreeNode root, int numTillNow) {
        numTillNow *= 2;
        numTillNow += root.val;
        if (root.left == null && root.right == null) {
            sum += numTillNow;
        } else {
            if (root.left != null) {
                sumRootToLeaf(root.left, numTillNow);
            }
            if (root.right != null) {
                sumRootToLeaf(root.right, numTillNow);
            }
        }
    }
}

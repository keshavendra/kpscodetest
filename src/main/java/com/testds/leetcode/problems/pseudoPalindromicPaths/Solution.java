//https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
package com.testds.leetcode.problems.pseudoPalindromicPaths;

import com.testds.leetcode.utils.TreeNode;

public class Solution {

    private int palindromicPaths = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        calculatePalindromPaths(root, new int[10]);
        return palindromicPaths;
    }

    private void calculatePalindromPaths(TreeNode root, int[] frequency) {
        int num = root.val;
        //updating the frequency of the number
        frequency[num] += 1;
        if (root.left == null && root.right == null) {
            //base case
            boolean found1OddFrequency = false;
            boolean isPalindrom = true;
            for (int i = 1; i < 10; i++) {
                if (frequency[i] % 2 != 0) {
                    if (found1OddFrequency) {
                        isPalindrom = false;
                        break;
                    }
                    found1OddFrequency = true;
                }
            }
            if (isPalindrom) {
                palindromicPaths += 1;
            }
        } else {
            //middle element
            if (root.left != null) {
                calculatePalindromPaths(root.left, frequency);
            }
            if (root.right != null) {
                calculatePalindromPaths(root.right, frequency);
            }
        }
        //clearing the frequencies at the end
        frequency[num] -= 1;
    }
}

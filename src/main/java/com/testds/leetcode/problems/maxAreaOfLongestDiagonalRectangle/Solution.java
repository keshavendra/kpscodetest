//https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
package com.testds.leetcode.problems.maxAreaOfLongestDiagonalRectangle;

public class Solution {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0, maxDiagonalSquare = 0, localDiagonal;
        for (int[] dimension : dimensions) {
            localDiagonal = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            if (localDiagonal > maxDiagonalSquare) {
                maxDiagonalSquare = localDiagonal;
                maxArea = dimension[0] * dimension[1];
            } else if (localDiagonal == maxDiagonalSquare) {
                if (dimension[0] * dimension[1] > maxArea) {
                    maxArea = dimension[0] * dimension[1];
                }
            }
        }
        return maxArea;
    }

}

//https://leetcode.com/problems/image-smoother/

package com.testds.leetcode.problems.imageSmoother;

public class Solution {

    private int[][] img;

    private int numRows;

    private int numCols;

    public int[][] imageSmoother(int[][] img) {
        this.img = img;
        numRows = img.length;
        numCols = img[0].length;
        int[][] imageSmootherMatrix = new int[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                imageSmootherMatrix[row][col] = calculateAvgAtRowCol(row, col);
            }
        }
        return imageSmootherMatrix;
    }

    private int calculateAvgAtRowCol(int row, int col) {
        int numOfRecords = 0;
        int sum = 0;
        //Upper Left
        if (row - 1 >= 0 && col - 1 >= 0) {
            sum += img[row - 1][col - 1];
            numOfRecords++;
        }
        //Upper
        if (row - 1 >= 0) {
            sum += img[row - 1][col];
            numOfRecords++;
        }
        //Upper Right
        if (row - 1 >= 0 && col + 1 < numCols) {
            sum += img[row - 1][col + 1];
            numOfRecords++;
        }
        //Right
        if (col + 1 < numCols) {
            sum += img[row][col + 1];
            numOfRecords++;
        }
        //Bottom Right
        if (row + 1 < numRows && col + 1 < numCols) {
            sum += img[row + 1][col + 1];
            numOfRecords++;
        }
        //Bottom
        if (row + 1 < numRows) {
            sum += img[row + 1][col];
            numOfRecords++;
        }
        //Bottom Left
        if (row + 1 < numRows && col - 1 >= 0) {
            sum += img[row + 1][col - 1];
            numOfRecords++;
        }
        //Left
        if (col - 1 >= 0) {
            sum += img[row][col - 1];
            numOfRecords++;
        }
        //Current Record
        sum+=img[row][col];
        numOfRecords++;
        return sum / numOfRecords;
    }
}

//https://leetcode.com/problems/image-overlap/
package com.testds.leetcode.problems.imageOverlap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final String SEPARATOR = "##";

    public int largestOverlap(int[][] img1, int[][] img2) {

        int row = img1.length;
        int col = img1[0].length;
        List<Cell> img1List = new ArrayList<>();
        List<Cell> img2List = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (img1[i][j] == 1)
                    img1List.add(new Cell(i, j));
                if (img2[i][j] == 1)
                    img2List.add(new Cell(i, j));
            }
        }

        return getMax(img1List, img2List);
    }

    private static int getMax(List<Cell> img1List, List<Cell> img2List) {
        Map<String, Integer> cellShiftMap = new HashMap<>();
        int rowShift, colShift;
        String temp;
        int max = 0;
        for (Cell cell1 : img1List) {
            for (Cell cell2 : img2List) {
                rowShift = cell1.row - cell2.row;
                colShift = cell1.col - cell2.col;
                temp = rowShift + SEPARATOR + colShift;
                cellShiftMap.put(temp, cellShiftMap.getOrDefault(temp, 0) + 1);
                max = Math.max(max, cellShiftMap.get(temp));
            }
        }
        return max;
    }

    record Cell(int row, int col) {
    }
}

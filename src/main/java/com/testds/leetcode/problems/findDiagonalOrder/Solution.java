//https://leetcode.com/problems/diagonal-traverse/
package com.testds.leetcode.problems.findDiagonalOrder;

public class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;

        int[] result = new int[rows * cols];

        int row = 0, col = 0;
        Direction direction = Direction.RIGHT;
        int resultIndex = 0;
        while (row < rows && col < cols) {
            result[resultIndex++] = mat[row][col];
            row = row + direction.row;
            col = col + direction.col;
            if (row < 0 || col < 0 || row >= rows || col >= cols) {
                row = row - direction.row;
                col = col - direction.col;
                if (direction == Direction.RIGHT) {
                    if (col + 1 < cols) {
                        col++;
                    } else {
                        row++;
                    }
                } else {
                    if (row + 1 < rows) {
                        row++;
                    } else {
                        col++;
                    }
                }
                direction = direction.getOpposite();
            }
        }
        return result;
    }

    enum Direction {
        RIGHT(-1, 1), LEFT(1, -1);

        final int row;
        final int col;

        Direction(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public Direction getOpposite() {
            return this.getRow() < 1 ? Direction.LEFT : Direction.RIGHT;
        }
    }
}

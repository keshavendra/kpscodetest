//https://leetcode.com/problems/find-the-safest-path-in-a-grid/
package com.testds.leetcode.problems.maxSafenessFactor;

import java.util.*;

public class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        if (grid.getFirst().getFirst() == 1 ||
                grid.getLast().getLast() == 1) {
            return 0;
        }
        int[][] minDistanceGrid = findMinDistanceGrid(grid);
        return findMaxSafeDistance(minDistanceGrid, grid);
    }

    private int findMaxSafeDistance(final int[][] minDistanceGrid, List<List<Integer>> grid) {
        Comparator<Cell> comparator = (o1, o2) -> {
            if (minDistanceGrid[o1.row][o1.col] != minDistanceGrid[o2.row][o2.col])
                return -1 * Integer.compare(minDistanceGrid[o1.row][o1.col], minDistanceGrid[o2.row][o2.col]);
            if (o1.row != o2.row)
                return o1.row - o2.row;
            return o1.col - o2.col;
        };
        int maxSafeDistance = Integer.MAX_VALUE;
        PriorityQueue<Cell> pq = new PriorityQueue<>(comparator);
        pq.offer(new Cell(0, 0));
        Set<Cell> visited = new HashSet<>();
        visited.add(new Cell(0, 0));
        Cell upCell, rightCell, downCell, leftCell;
        while (!pq.isEmpty()) {
            Cell cell = pq.poll();
            maxSafeDistance = Math.min(maxSafeDistance, minDistanceGrid[cell.row][cell.col]);
            if ((cell.row == grid.size() - 1) && cell.col == (grid.getFirst().size() - 1)) {
                break;
            }
            //up
            upCell = new Cell(cell.row - 1, cell.col);
            if (cell.row != 0 && !visited.contains(upCell)) {
                pq.offer(upCell);
                visited.add(upCell);
            }
            //right
            rightCell = new Cell(cell.row, cell.col + 1);
            if (rightCell.col < grid.getFirst().size() && !visited.contains(rightCell)) {
                pq.offer(rightCell);
                visited.add(rightCell);
            }
            //down
            downCell = new Cell(cell.row + 1, cell.col);
            if (downCell.row < grid.size() && !visited.contains(downCell)) {
                pq.offer(downCell);
                visited.add(downCell);
            }
            //leftCell
            leftCell = new Cell(cell.row, cell.col - 1);
            if (leftCell.col >= 0 && !visited.contains(leftCell)) {
                pq.offer(leftCell);
                visited.add(leftCell);
            }
        }
        return maxSafeDistance;
    }

    private record Cell(int row, int col) {
    }

    private int[][] findMinDistanceGrid(List<List<Integer>> grid) {
        int rows = grid.size();
        int cols = grid.getFirst().size();
        int[][] minDistanceGrid = new int[rows][cols];
        Queue<Cell> queue = new LinkedList<>();
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.getFirst().size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    Cell cell = new Cell(i, j);
                    queue.add(cell);
                    minDistanceGrid[i][j] = 0;
                } else {
                    minDistanceGrid[i][j] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            //check adjacent cells
            //right cell
            Cell temp;
            if (cell.col != (cols - 1)) {
                temp = new Cell(cell.row, cell.col + 1);
                if (minDistanceGrid[temp.row][temp.col] == -1) {
                    minDistanceGrid[temp.row][temp.col] = minDistanceGrid[cell.row][cell.col] + 1;
                    queue.add(temp);
                }
            }
            //down
            if (cell.row != (rows - 1)) {
                temp = new Cell(cell.row + 1, cell.col);
                if (minDistanceGrid[temp.row][temp.col] == -1) {
                    minDistanceGrid[temp.row][temp.col] = minDistanceGrid[cell.row][cell.col] + 1;
                    queue.add(temp);
                }
            }
            //left
            if (cell.col != 0) {
                temp = new Cell(cell.row, cell.col - 1);
                if (minDistanceGrid[temp.row][temp.col] == -1) {
                    minDistanceGrid[temp.row][temp.col] = minDistanceGrid[cell.row][cell.col] + 1;
                    queue.add(temp);
                }
            }
            //up
            if (cell.row != 0) {
                temp = new Cell(cell.row - 1, cell.col);
                if (minDistanceGrid[temp.row][temp.col] == -1) {
                    minDistanceGrid[temp.row][temp.col] = minDistanceGrid[cell.row][cell.col] + 1;
                    queue.add(temp);
                }
            }
        }
        return minDistanceGrid;
    }
}

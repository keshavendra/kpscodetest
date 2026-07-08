package com.testds.leetcode.problems.maxSafenessFactor;

import java.util.Arrays;
import java.util.List;

public class Solution1 {
    private static final int[] DIRECTIONS = {-1, 0, 1, 0, -1};
    private static final int INACTIVE = Integer.MIN_VALUE;

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int rows = grid.size();
        int cols = grid.get(0).size();
        if (grid.get(0).get(0) == 1 || grid.get(rows - 1).get(cols - 1) == 1) {
            return 0;
        }

        int[] links = new int[rows * cols];
        int[] distances = findMinDistances(grid, rows, cols, links);
        return findMaxSafeDistance(distances, links, rows, cols);
    }

    private int[] findMinDistances(List<List<Integer>> grid, int rows, int cols, int[] queue) {
        int[] distances = new int[rows * cols];
        Arrays.fill(distances, -1);

        int head = 0;
        int tail = 0;
        for (int row = 0; row < rows; row++) {
            List<Integer> gridRow = grid.get(row);
            for (int col = 0; col < cols; col++) {
                if (gridRow.get(col) == 1) {
                    int cell = row * cols + col;
                    distances[cell] = 0;
                    queue[tail++] = cell;
                }
            }
        }

        while (head < tail) {
            int cell = queue[head++];
            int row = cell / cols;
            int col = cell % cols;
            for (int direction = 0; direction < 4; direction++) {
                int nextRow = row + DIRECTIONS[direction];
                int nextCol = col + DIRECTIONS[direction + 1];
                if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols) {
                    continue;
                }

                int nextCell = nextRow * cols + nextCol;
                if (distances[nextCell] == -1) {
                    distances[nextCell] = distances[cell] + 1;
                    queue[tail++] = nextCell;
                }
            }
        }
        return distances;
    }

    private int findMaxSafeDistance(int[] state, int[] next, int rows, int cols) {
        int maxDistance = 0;
        for (int distance : state) {
            maxDistance = Math.max(maxDistance, distance);
        }

        int[] bucketHeads = new int[maxDistance + 1];
        Arrays.fill(bucketHeads, -1);
        for (int cell = 0; cell < state.length; cell++) {
            int distance = state[cell];
            next[cell] = bucketHeads[distance];
            bucketHeads[distance] = cell;
        }

        // Distances are no longer needed after bucketing. Reuse the array for
        // disjoint-set storage; negative roots contain component sizes.
        Arrays.fill(state, INACTIVE);
        int destination = state.length - 1;
        for (int distance = maxDistance; distance >= 0; distance--) {
            for (int cell = bucketHeads[distance]; cell != -1; cell = next[cell]) {
                state[cell] = -1;
                int row = cell / cols;
                int col = cell % cols;
                for (int direction = 0; direction < 4; direction++) {
                    int nextRow = row + DIRECTIONS[direction];
                    int nextCol = col + DIRECTIONS[direction + 1];
                    if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols) {
                        continue;
                    }

                    int neighbour = nextRow * cols + nextCol;
                    if (state[neighbour] != INACTIVE) {
                        union(state, cell, neighbour);
                    }
                }
            }

            if (state[0] != INACTIVE
                    && state[destination] != INACTIVE
                    && find(state, 0) == find(state, destination)) {
                return distance;
            }
        }
        return 0;
    }

    private int find(int[] disjointSet, int cell) {
        int root = cell;
        while (disjointSet[root] >= 0) {
            root = disjointSet[root];
        }
        while (cell != root) {
            int parent = disjointSet[cell];
            disjointSet[cell] = root;
            cell = parent;
        }
        return root;
    }

    private void union(int[] disjointSet, int first, int second) {
        int firstRoot = find(disjointSet, first);
        int secondRoot = find(disjointSet, second);
        if (firstRoot == secondRoot) {
            return;
        }

        if (disjointSet[firstRoot] > disjointSet[secondRoot]) {
            int temp = firstRoot;
            firstRoot = secondRoot;
            secondRoot = temp;
        }
        disjointSet[firstRoot] += disjointSet[secondRoot];
        disjointSet[secondRoot] = firstRoot;
    }
}

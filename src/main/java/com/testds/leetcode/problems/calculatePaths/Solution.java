//https://leetcode.com/problems/out-of-boundary-paths
package com.testds.leetcode.problems.calculatePaths;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    int ROWS = 0;
    int COLS = 0;
    final int MOD = 1000000007;

    Map<Integer, Map<Integer, Map<Integer, Integer>>> rowToColToNumOfMoveMap = new HashMap<>();

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        ROWS = m;
        COLS = n;
        return calculatePaths(maxMove, startRow, startColumn);
    }

    private int calculatePaths(int maxMove, int startRow, int startColumn) {
        long numOfPathsLocal = 0;
        if (maxMove <= 0 || startRow < 0 || startColumn < 0 || startRow >= ROWS || startColumn >= COLS) {
            return 0;
        } else {
            if (!rowToColToNumOfMoveMap.containsKey(startRow)) {
                rowToColToNumOfMoveMap.put(startRow, new HashMap<>());
                rowToColToNumOfMoveMap.get(startRow).put(startColumn, new HashMap<>());
                rowToColToNumOfMoveMap.get(startRow).get(startColumn).put(maxMove, -1);
            } else if (!rowToColToNumOfMoveMap.get(startRow).containsKey(startColumn)) {
                rowToColToNumOfMoveMap.get(startRow).put(startColumn, new HashMap<>());
                rowToColToNumOfMoveMap.get(startRow).get(startColumn).put(maxMove, -1);
            } else if (!rowToColToNumOfMoveMap.get(startRow).get(startColumn).containsKey(maxMove)) {
                rowToColToNumOfMoveMap.get(startRow).get(startColumn).put(maxMove, -1);
            }
            if (rowToColToNumOfMoveMap.get(startRow).get(startColumn).get(maxMove) == -1) {
                if (startRow == 0)
                    numOfPathsLocal++;
                if (startColumn == 0)
                    numOfPathsLocal++;
                if (startRow == ROWS - 1)
                    numOfPathsLocal++;
                if (startColumn == COLS - 1)
                    numOfPathsLocal++;
                //left
                numOfPathsLocal += calculatePaths(maxMove - 1, startRow, startColumn - 1);
                //up
                numOfPathsLocal += calculatePaths(maxMove - 1, startRow - 1, startColumn);
                //right
                numOfPathsLocal += calculatePaths(maxMove - 1, startRow, startColumn + 1);
                //down
                numOfPathsLocal += calculatePaths(maxMove - 1, startRow + 1, startColumn);
                rowToColToNumOfMoveMap.get(startRow).get(startColumn).put(maxMove, (int) (numOfPathsLocal % MOD));
            }
            return rowToColToNumOfMoveMap.get(startRow).get(startColumn).get(maxMove);
        }
    }
}

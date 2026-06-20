//https://leetcode.com/problems/maximum-building-height/
package com.testds.leetcode.problems.maxBuilding;

import java.util.Comparator;

public class Solution {

    /**
     * This method calculates the maximum building height given certain restrictions.
     * <p>
     * Example from test case:
     * n = 10, restrictions = [[5, 3], [2, 5], [7, 4], [10, 3]]
     * Here, n is the number of buildings, and restrictions specify the maximum height for certain buildings.
     * The method returns the maximum possible height for any building.
     * <p>
     * Step-by-step explanation for the 3rd test case:
     * 1. Initialize r with restrictions and additional restrictions for first and last buildings.
     * r = [[1, 0], [2, 5], [5, 3], [7, 4], [10, 3], [10, 9]] after sorting.
     * 2. Forward pass: Ensure heights are consistent with previous restrictions.
     * r = [[1, 0], [2, 1], [5, 3], [7, 4], [10, 3], [10, 3]] after forward pass.
     * 3. Backward pass: Ensure heights are consistent with next restrictions.
     * r = [[1, 0], [2, 1], [5, 3], [7, 4], [10, 3], [10, 3]] after backward pass.
     * 4. Calculate maximum height between consecutive restrictions.
     * Maximum height = max(1, 3, 4, 5, 3) = 5.
     */
    public int maxBuilding(int n, int[][] restrictions) {
        // Handle null restrictions
        if (restrictions == null) {
            restrictions = new int[0][2];
        }
        int m = restrictions.length;
        // Create a new array r by copying restrictions and adding two additional "restrictions" for the first and last buildings
        int[][] r = new int[m + 2][2];
        System.arraycopy(restrictions, 0, r, 0, m);
        r[m] = new int[]{1, 0}; // First building restriction
        r[m + 1] = new int[]{n, n - 1}; // Last building restriction

        // Sort r based on building index
        java.util.Arrays.sort(r, Comparator.comparingInt(a -> a[0]));
        m += 2;

        // Forward pass to ensure heights are consistent with previous restrictions
        for (int i = 1; i < m; i++) {
            r[i][1] = Math.min(r[i][1], r[i - 1][1] + (r[i][0] - r[i - 1][0]));
        }

        // Backward pass to ensure heights are consistent with next restrictions
        for (int i = m - 2; i >= 0; i--) {
            r[i][1] = Math.min(r[i][1], r[i + 1][1] + (r[i + 1][0] - r[i][0]));
        }

        // Calculate the maximum possible height between each pair of consecutive "restrictions"
        int ans = 0;
        for (int i = 0; i < m - 1; i++) {
            int best = ((r[i + 1][0] - r[i][0]) + r[i][1] + r[i + 1][1]) / 2;
            ans = Math.max(ans, best);
        }
        return ans;
    }

}

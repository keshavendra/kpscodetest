//https://leetcode.com/problems/minimum-moves-to-make-array-complementary/
package com.testds.leetcode.problems.minMovesToMakeArrayComplementary;

public class Solution {
    public int minMoves(int[] nums, int limit) {
        /*
         * Valid target sums are [2, 2 * limit].
         * We build a difference array where prefix value at sum 's' = total moves needed
         * to make all mirrored pairs sum to 's'.
         *
         * For one pair (a, b):
         *   - 2 moves for all sums by default
         *   - 1 move for sums in [min(a,b)+1, max(a,b)+limit]
         *   - 0 move exactly at sum = a + b
         *
         * We encode this with range updates in O(1) per pair and do one prefix scan.
         */
        int[] difference = new int[2 * limit + 2];

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int a = nums[left];
            int b = nums[right];

            int lowerOneMoveBound = Math.min(a, b) + 1;
            int upperOneMoveBound = Math.max(a, b) + limit;
            int exactZeroMoveSum = a + b;

            // Start with +2 moves for the whole domain [2, 2*limit]
            difference[2] += 2;

            // [lowerOneMoveBound, upperOneMoveBound] : reduce 2 -> 1 (subtract 1)
            difference[lowerOneMoveBound] -= 1;
            difference[upperOneMoveBound + 1] += 1;

            // exactZeroMoveSum : reduce 1 -> 0 only at this point (subtract 1 at sum, add back at sum+1)
            difference[exactZeroMoveSum] -= 1;
            difference[exactZeroMoveSum + 1] += 1;

            left++;
            right--;
        }

        int minimumMoves = Integer.MAX_VALUE;
        int runningMoves = 0;
        for (int targetSum = 2; targetSum <= 2 * limit; targetSum++) {
            runningMoves += difference[targetSum];
            minimumMoves = Math.min(minimumMoves, runningMoves);
        }

        return minimumMoves;
    }
}

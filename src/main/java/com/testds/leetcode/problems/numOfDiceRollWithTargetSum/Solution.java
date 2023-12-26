//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum
package com.testds.leetcode.problems.numOfDiceRollWithTargetSum;

public class Solution {

    public int numRollsToTarget(int dices, int faces, int target) {

        if (faces * dices < target || target < dices)
            return 0;

        int[][] mem = new int[dices + 1][faces * dices + 1];
        for (int i = 1; i <= faces; i++) {
            mem[1][i] = 1;
        }
        for (int dice = 2; dice <= dices; dice++) {
            for (int targetSum = dice; targetSum <= faces * dice; targetSum++) {
                for (int faceVal = 1; faceVal <= faces; faceVal++) {
                    if (targetSum - faceVal < 1)
                        break;
                    mem[dice][targetSum] += mem[dice - 1][targetSum - faceVal];
                    mem[dice][targetSum] %= (1000_000_000 + 7);
                }
            }
        }
        return mem[dices][target] % (1000_000_000 + 7);
    }
}

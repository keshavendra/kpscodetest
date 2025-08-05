//https://leetcode.com/problems/fruits-into-baskets-ii
package com.testds.leetcode.problems.numOfUnplacedFruits;

public class Solution {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int placed = 0;
        int indexFruits = 0, indexBaskets;

        for (; indexFruits < fruits.length; indexFruits++) {
            for (indexBaskets = 0; indexBaskets < baskets.length; indexBaskets++) {
                if (fruits[indexFruits] <= baskets[indexBaskets]) {
                    placed++;
                    baskets[indexBaskets] = 0;
                    break;
                }
            }
        }

        return fruits.length - placed;
    }
}

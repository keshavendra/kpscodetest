//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
package com.testds.leetcode.problems.minimumRecolors;

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int numberOfBlack = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'B') {
                numberOfBlack++;
            }
        }
        int replacement = k - numberOfBlack;
        for (int i = k; i < blocks.length(); i++) {
            numberOfBlack -= (blocks.charAt(i - k) == 'B' ? 1 : 0);
            numberOfBlack += (blocks.charAt(i) == 'B' ? 1 : 0);
            if (replacement > (k - numberOfBlack)) {
                replacement = k - numberOfBlack;
            }
        }
        return replacement;
    }
}

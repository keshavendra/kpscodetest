//https://leetcode.com/problems/minimum-array-end/
package com.testds.leetcode.problems.minArrayEnd;

public class Solution {
    public long minEnd(int n, int x) {
        int[] numBitsArray = new int[64];
        populateNumArray(x, numBitsArray);
        n -= 1;
        if (n > 0) {
            int[] nArray = new int[32];
            populateNumArray(n, nArray);
            int numArrayIndex = 0, longBitsArrayIndex = 0;
            while (longBitsArrayIndex < numBitsArray.length
                    && numArrayIndex < nArray.length) {
                while (longBitsArrayIndex < numBitsArray.length
                        && numBitsArray[longBitsArrayIndex] == 1) {
                    longBitsArrayIndex++;
                }
                numBitsArray[longBitsArrayIndex++] = nArray[numArrayIndex++];
            }
        }
        return convertLongArrayToNumber(numBitsArray);
    }

    private long convertLongArrayToNumber(int[] longBitsArray) {
        long result = 0L;
        for (int i = 0; i < longBitsArray.length; i++) {
            if (longBitsArray[i] == 1) {
                result |= (1L << i);
            }
        }
        return result;
    }

    private void populateNumArray(int x, int[] numBitsArray) {
        for (int i = 0; i < 32; i++) {
            numBitsArray[i] = (x & (1 << i)) != 0 ? 1 : 0;
        }
    }
}

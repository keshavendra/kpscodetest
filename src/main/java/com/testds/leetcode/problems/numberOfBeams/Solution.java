//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
package com.testds.leetcode.problems.numberOfBeams;

public class Solution {
    public int numberOfBeams(String[] bank) {
        int[] numOfDevices = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            String binaryString = bank[i];
            for (char ch : binaryString.toCharArray()) {
                if (ch == '1')
                    numOfDevices[i] += 1;
            }
        }
        int numOfBeams = 0;
        int i = 0;
        for (; i < numOfDevices.length; i++) {
            if (numOfDevices[i] > 0)
                break;
        }
        if (i < numOfDevices.length) {
            int prevLineDevices = numOfDevices[i++];
            for (; i < numOfDevices.length; i++) {
                if (numOfDevices[i] > 0) {
                    numOfBeams += (numOfDevices[i] * prevLineDevices);
                    prevLineDevices = numOfDevices[i];
                }
            }
        }
        return numOfBeams;
    }
}

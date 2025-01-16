//https://leetcode.com/problems/minimize-xor/
package com.testds.leetcode.problems.minimizeXor;

public class Solution {

    public int minimizeXor(int num1, int num2) {
        int countNum1 = countSetBits(num1);
        int countNum2 = countSetBits(num2);
        if (countNum1 == countNum2) {
            return num1;
        }


        //increase the 1s at lowest possible place.
        if (countNum2 > countNum1) {
            for (int i = 0; i < countNum2 - countNum1; i++) {
                num1 = findAndSetLUB(num1);
            }
        } else {
            for (int i = 0; i < (countNum1 - countNum2); i++) {
                num1 = findAndUnSetLUB(num1);
            }
        }
        return num1;
    }

    private int findAndSetLUB(int num1) {
        for (int i = 0; i < 32; i++) {
            if ((num1 & (1 << i)) == 0) {
                return num1 | (1 << i);
            }
        }
        return 0;
    }

    private int findAndUnSetLUB(int num1) {
        for (int i = 0; i < 31; i++) {
            if ((num1 & (1 << i)) != 0) {
                return ((num1 >> (i + 1)) << (i + 1));
            }
        }
        return 0;
    }

    private int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1)
                count++;
            num >>= 1;
        }
        return count;
    }

}

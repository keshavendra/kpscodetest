//https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/
package com.testds.leetcode.problems.waysToDivideLongCorridor;

public class Solution {

    public static final int MODULO = 1000_000_000 + 7;

    public int numberOfWays(String corridor) {
        int index = 0;
        long numOfWays = 0;
        for (char ch : corridor.toCharArray()) {
            if (ch == 'S')
                numOfWays++;
        }
        if (numOfWays == 0 || numOfWays % 2 == 1)
            return 0;
        numOfWays = 1;
        while (true) {
            //find first S
            while (index < corridor.length() && corridor.charAt(index) == 'P')
                index++;
            if (index < corridor.length()) {
                //found first 'S'
                index++;
                while (index < corridor.length() && corridor.charAt(index) == 'P')
                    index++;
                if (index < corridor.length()) {
                    //found second S

                    int numOfSeats = 1;
                    index++;
                    while (index < corridor.length() && corridor.charAt(index) == 'P') {
                        index++;
                        numOfSeats++;
                    }
                    if (index < corridor.length()) {
                        numOfWays *= numOfSeats;
                        numOfWays %= MODULO;
                    } else {
                        break;
                    }

                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return (int) (numOfWays % MODULO);
    }
}

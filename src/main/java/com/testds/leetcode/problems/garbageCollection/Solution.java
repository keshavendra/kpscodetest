//https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage
package com.testds.leetcode.problems.garbageCollection;

public class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int metalTime = 0, paperTime = 0, garbageTime = 0;
        boolean metalFound = false, paperFound = false, garbageFound = false;
        for (int i = garbage.length - 1; i > 0; i--) {
            String garbageString = garbage[i];
            for (char ch : garbageString.toCharArray()) {
                switch (ch) {
                    case 'M':
                        metalTime += 1;
                        metalFound = true;
                        break;
                    case 'P':
                        paperTime += 1;
                        paperFound = true;
                        break;
                    case 'G':
                        garbageTime += 1;
                        garbageFound = true;
                }
            }
            if (metalFound)
                metalTime += travel[i - 1];
            if (paperFound)
                paperTime += travel[i - 1];
            if (garbageFound)
                garbageTime += travel[i - 1];
        }
        for (char ch : garbage[0].toCharArray()) {
            switch (ch) {
                case 'M':
                    metalTime += 1;
                    break;
                case 'P':
                    paperTime += 1;
                    break;
                case 'G':
                    garbageTime += 1;
            }
        }
        return metalTime + paperTime + garbageTime;
    }
}

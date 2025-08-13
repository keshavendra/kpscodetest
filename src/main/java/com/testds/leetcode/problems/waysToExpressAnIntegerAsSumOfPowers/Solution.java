//https://leetcode.com/problems/ways-to-express-an-integer-as-sum-of-powers/
package com.testds.leetcode.problems.waysToExpressAnIntegerAsSumOfPowers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    private static final int MODULO = 1_000_000_000 + 7;
    private final long[][] mapNtoItoWays = new long[301][301];

    public int numberOfWays(int n, int x) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        IntStream.range(0, 301).forEach(i -> Arrays.fill(mapNtoItoWays[i], -1));
        return (int) (numberOfWays(n, 1, x) % MODULO);
    }

    private long numberOfWays(int n, int i, int x) {

        if (n == 0) {
            mapNtoItoWays[n][i] = 1;
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (mapNtoItoWays[n][i] != -1) {
            return mapNtoItoWays[n][i];
        }

        if (Math.pow(i, x) > n) {
            mapNtoItoWays[n][i] = 0;
            return 0;
        }

        long numOfWaysIncluded = numberOfWays((int) (n - Math.pow(i, x)), i + 1, x) % MODULO;
        long numOfWaysExcluded = numberOfWays(n, i + 1, x) % MODULO;
        mapNtoItoWays[n][i] = (numOfWaysIncluded + numOfWaysExcluded) % MODULO;
        return mapNtoItoWays[n][i];
    }

}

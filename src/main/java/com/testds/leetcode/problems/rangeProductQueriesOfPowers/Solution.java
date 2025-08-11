//https://leetcode.com/problems/range-product-queries-of-powers/
package com.testds.leetcode.problems.rangeProductQueriesOfPowers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static final int MODULO = 1_000_000_000 + 7;

    public int[] productQueries(int n, int[][] queries) {
        if (n <= 0)
            throw new IllegalArgumentException("n must be greater than zero");
        List<Integer> arr = getNumsArrays(n);
        int[] res = new int[queries.length];
        Arrays.fill(res, 1);
        IntStream.range(0, queries.length)
                .forEach(i ->
                        IntStream.rangeClosed(queries[i][0], queries[i][1])
                                .forEach(j -> res[i] = (int) ((res[i] * (long) arr.get(j)) % MODULO)));
        return res;
    }

    List<Integer> getNumsArrays(int n) {
        return IntStream.range(0, 32)
                .filter(i -> ((n >> i) & 1) == 1)
                .map(i -> (int) Math.pow(2, i))
                .boxed()
                .collect(Collectors.toList());
    }
}

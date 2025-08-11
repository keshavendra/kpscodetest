package com.testds.leetcode.problems.rangeProductQueriesOfPowers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void testGetNumsArray() {
        Assert.assertEquals(Arrays.asList(1, 2, 4), solution.getNumsArrays(7));
        Assert.assertEquals(Collections.singletonList(8), solution.getNumsArrays(8));
        Assert.assertEquals(Arrays.asList(1, 16), solution.getNumsArrays(17));
    }

    @Test
    public void testProductQueries_SimpleCase() {
        int n = 15;
        int[][] queries = {{0, 1}, {2, 2}, {0, 3}};
        int[] expected = {(int) ((solution.getNumsArrays(n).get(0) * (long) solution.getNumsArrays(n).get(1)) % Solution.MODULO),
                solution.getNumsArrays(n).get(2),
                (int) ((solution.getNumsArrays(n).get(0) * (long) solution.getNumsArrays(n).get(1) * (long) solution.getNumsArrays(n).get(2) * (long) solution.getNumsArrays(n).get(3)) % Solution.MODULO)};
        Assert.assertArrayEquals(expected, solution.productQueries(n, queries));
    }

    @Test
    public void testProductQueries_MultipleQueries() {
        int n = 10;
        int[][] queries = {{0, 0}, {1, 1}, {0, 1}};
        int[] expected = {solution.getNumsArrays(n).get(0),
                solution.getNumsArrays(n).get(1),
                (int) ((solution.getNumsArrays(n).get(0) * (long) solution.getNumsArrays(n).get(1)) % Solution.MODULO)};
        Assert.assertArrayEquals(expected, solution.productQueries(n, queries));
    }

    @Test
    public void testProductQueries_EmptyQueries() {
        int n = 10;
        int[][] queries = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, solution.productQueries(n, queries));
    }

    @Test(expected = NullPointerException.class)
    public void testProductQueries_NullQueries() {
        int n = 10;
        int[][] queries = null;
        solution.productQueries(n, queries);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProductQueries_NegativeN() {
        int n = -10;
        int[][] queries = {{0, 0}};
        solution.productQueries(n, queries);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testProductQueries_OutOfRangeQuery() {
        int n = 10;
        int[][] queries = {{0, 10}};
        solution.productQueries(n, queries);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.numOfDistinctColorBalls;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int limit;

    @Parameterized.Parameter(1)
    public int[][] queries;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}}, new int[]{1, 2, 2, 3}},
                        {4, new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}}, new int[]{1, 2, 2, 3, 4}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testNumOfDistinctColorBalls() {
        int[] actualResult = solution.queryResults(limit, queries);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

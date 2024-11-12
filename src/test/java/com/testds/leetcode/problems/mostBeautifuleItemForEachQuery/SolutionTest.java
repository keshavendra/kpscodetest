package com.testds.leetcode.problems.mostBeautifuleItemForEachQuery;

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

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public int[][] items;

    @Parameterized.Parameter(1)
    public int[] queries;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}}, new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 4, 5, 5, 6, 6}},
                {new int[][]{{1, 2}, {1, 2}, {1, 3}, {1, 4}}, new int[]{1}, new int[]{4}},
                {new int[][]{{10, 1000}}, new int[]{5}, new int[]{0}}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @org.junit.Test
    public void testMostBeautifuleItemForEachQuery() {
        int[] actualResult = solution.maximumBeauty(items, queries);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.maxXor4EachQuery;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int maximumBit;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{0, 1, 1, 3}, 2, new int[]{0, 3, 2, 3}},
                        {new int[]{2, 3, 4, 7}, 3, new int[]{5, 2, 6, 5}},
                        {new int[]{0, 1, 2, 2, 5, 7}, 3, new int[]{4, 3, 6, 4, 6, 7}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxXor4EachQuery() {
        int[] actualResult = solution.getMaximumXor(nums, maximumBit);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

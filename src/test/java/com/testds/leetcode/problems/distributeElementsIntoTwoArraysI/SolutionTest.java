package com.testds.leetcode.problems.distributeElementsIntoTwoArraysI;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[] expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 1, 3}, new int[]{2, 3, 1}},
                {new int[]{5, 4, 3, 8}, new int[]{5, 3, 4, 8}}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testResultArray() {
        Assert.assertArrayEquals(expected, solution.resultArray(nums));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

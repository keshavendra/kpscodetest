package com.testds.leetcode.problems.subarraySumEqualsK;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
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
    public int k;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1}, 2, 2},
                {new int[]{1, 2, 3}, 3, 2},
                {new int[]{1}, 0, 0},
                {new int[]{-1, -1, 1}, 0, 1},
                {new int[]{4, -4, 4, -1, -3, 7, 3}, 3, 5}
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
    public void testSubarraySum() {
        assertEquals(expectedResult, solution.subarraySum(nums, k));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

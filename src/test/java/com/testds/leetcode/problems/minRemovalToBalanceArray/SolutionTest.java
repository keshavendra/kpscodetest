package com.testds.leetcode.problems.minRemovalToBalanceArray;

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
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 1, 5}, 2, 1},
                {new int[]{1, 6, 2, 9}, 3, 2},
                {new int[]{10, 10}, 2, 0}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testMinRemoval() {
        assertEquals(expected, solution.minRemoval(nums, k));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.houseRobber4;

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
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 3, 5, 9}, 2, 5},
                        {new int[]{2, 7, 9, 3, 1}, 2, 2},
                        {new int[]{1, 2, 9, 3, 2}, 2, 2},
                        {new int[]{2, 2}, 1, 2}
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
    public void testMinCapability() {
        int actualResult = solution.minCapability(nums, k);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

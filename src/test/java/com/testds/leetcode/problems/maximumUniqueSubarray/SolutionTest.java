package com.testds.leetcode.problems.maximumUniqueSubarray;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 2, 4, 5, 6}, 17},
                        {new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5}, 8}
                }
        );
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testMaxUniqueSubarray() {
        int actualResult = solution.maximumUniqueSubarray(nums);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

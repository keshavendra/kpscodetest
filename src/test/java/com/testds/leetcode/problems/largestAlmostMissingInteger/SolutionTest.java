package com.testds.leetcode.problems.largestAlmostMissingInteger;

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
        return Arrays.asList(new Object[][]{
                {new int[]{3, 9, 2, 1, 7}, 3, 7},
                {new int[]{3, 9, 7, 2, 1, 7}, 4, 3},
                {new int[]{0, 0}, 1, -1},
                {new int[]{0, 0}, 2, 0},
                {new int[]{8, 1, 8}, 3, 8},
                {new int[]{3, 0, 12, 7, 1, 11}, 6, 12}
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
    public void testLargestInteger(){
        assertEquals(expectedResult, solution.largestInteger(nums, k));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

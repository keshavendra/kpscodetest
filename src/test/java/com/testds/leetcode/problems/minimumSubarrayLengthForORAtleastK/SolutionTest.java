package com.testds.leetcode.problems.minimumSubarrayLengthForORAtleastK;

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

    @Before
    public void setUp() {
        solution = new Solution();
    }

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
                        {new int[]{1, 2, 3}, 2, 1},
                        {new int[]{2, 1, 8}, 10, 3},
                        {new int[]{1, 2}, 0, 1},
                        {new int[]{1, 2, 32, 21}, 55, 3}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinimumSubarrayLengthForORAtleastK() {
        int actualResult = solution.minimumSubarrayLength(nums, k);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

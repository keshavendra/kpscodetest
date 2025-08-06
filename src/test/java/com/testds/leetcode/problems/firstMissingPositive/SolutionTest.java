package com.testds.leetcode.problems.firstMissingPositive;

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
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 0}, 3},
                        {new int[]{3, 4, -1, 1}, 2},
                        {new int[]{7, 8, 9, 11, 12}, 1},
                        {new int[]{1}, 2},
                        {new int[]{1, 1}, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testFirstMissingPositive() {
        assertEquals(expected, solution.firstMissingPositive(nums));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

package com.testds.leetcode.problems.longestConsecutive;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{100, 4, 200, 1, 3, 2}, 4},
                        {new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9},
                        {new int[]{1, 0, 1, 2}, 3}
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
    public void testLongestConsecutive() {
        assertEquals(expectedResult, solution.longestConsecutive(nums));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

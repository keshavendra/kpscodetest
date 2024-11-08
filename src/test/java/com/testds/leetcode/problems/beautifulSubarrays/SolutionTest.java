package com.testds.leetcode.problems.beautifulSubarrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 3, 1, 2, 4}, 2},
                        {new int[]{1, 10, 4}, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void test() {
        long actualResult = solution.beautifulSubarrays(nums);
        assertEquals(expectedResult, actualResult);
    }

}

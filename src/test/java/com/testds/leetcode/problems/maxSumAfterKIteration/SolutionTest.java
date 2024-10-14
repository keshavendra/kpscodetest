package com.testds.leetcode.problems.maxSumAfterKIteration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 10, 3, 3, 3}, 3, 17}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxSumAfterKIteration() {
        long actualResult = solution.maxKelements(nums, k);
        assertEquals(expectedResult, actualResult);
    }
}

package com.testds.leetcode.problems.zeroFilledSubarray;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 0, 0, 2, 0, 0, 4}, 6L},
                {new int[]{0, 0, 0, 2, 0, 0}, 9L},
                {new int[]{2, 10, 2019}, 0L}
        });
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testZeroFilledSubarray() {
        long actualResult = solution.zeroFilledSubarray(nums);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

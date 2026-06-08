package com.testds.leetcode.problems.arrangeTheArrayForPivot;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
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
    public int pivot;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{9, 12, 5, 10, 14, 3, 10}, 10, new int[]{9, 5, 3, 10, 10, 12, 14}},
                {new int[]{-3, 4, 3, 2}, 2, new int[]{-3, 2, 4, 3}}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testPivotArray() {
        int[] actualResult = solution.pivotArray(nums, pivot);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.transformedArray;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
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
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, -2, 1, 1}, new int[]{1, 1, 1, 3}},
                {new int[]{-1, 4, -1}, new int[]{-1, -1, 4}}
        });
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testConstructTransformedArray() {
        int[] actualResult = solution.constructTransformedArray(nums);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

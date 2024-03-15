package com.testds.leetcode.problems.productExceptSelf;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
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
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}},
                        {new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0}},
                        {new int[]{0, 1, 0}, new int[]{0, 0, 0}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testProductExceptSelf() {
        int[] actualResult = solution.productExceptSelf(nums);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

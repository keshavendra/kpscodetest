package com.testds.leetcode.problems.rearrangeArrayElementsBySign;

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
                        {new int[]{3, 1, -2, -5, 2, -4}, new int[]{3, -2, 1, -5, 2, -4}},
                        {new int[]{-1, 1}, new int[]{1, -1}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRearrangeArrayElementsBySign() {
        int[] actualResult = solution.rearrangeArray(nums);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

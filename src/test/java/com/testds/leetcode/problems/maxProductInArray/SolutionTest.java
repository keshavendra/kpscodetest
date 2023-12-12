package com.testds.leetcode.problems.maxProductInArray;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{3, 4, 5, 2}, 12},
                        {new int[]{1, 5, 4, 5}, 16},
                        {new int[]{3, 7}, 12}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxProductInArray() {
        int actualResult = solution.maxProduct(nums);
        assertEquals(expectedResult, actualResult);
    }

}

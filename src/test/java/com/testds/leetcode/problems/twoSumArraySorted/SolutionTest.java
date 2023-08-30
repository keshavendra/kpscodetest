package com.testds.leetcode.problems.twoSumArraySorted;

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
    public int[] inputArray;
    @Parameterized.Parameter(1)
    public int target;
    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}},
                {new int[]{2, 3, 4}, 6, new int[]{1, 3}},
                {new int[]{-1, 0}, -1, new int[]{1, 2}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testTwoSum() {
        Assert.assertArrayEquals(expectedResult, solution.twoSum(inputArray, target));
    }
}

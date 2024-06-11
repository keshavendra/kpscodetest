package com.testds.leetcode.problems.relativeSortArray;

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
    public int[] arr1;

    @Parameterized.Parameter(1)
    public int[] arr2;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6}, new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}},
                        {new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6}, new int[]{22, 28, 8, 6, 17, 44}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRelativeSortArray() {
        int[] actualResult = solution.relativeSortArray(arr1, arr2);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

package com.testds.leetcode.problems.sortByBits;

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
    public int[] arr;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}},
                {new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}, new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSortByBits() {
        int[] actualResult = solution.sortByBits(arr);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}

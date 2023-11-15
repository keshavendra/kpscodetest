package com.testds.leetcode.problems.maximumElementAfterDecrementingAndRearranging;

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
    public int[] arr;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 2, 2, 1}, 2},
                        {new int[]{100, 1, 1000}, 3},
                        {new int[]{1, 2, 3, 4, 5}, 5}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaximumElementAfterDecrementingAndRearranging() {
        int actualResult = solution.maximumElementAfterDecrementingAndRearranging(arr);
        assert expectedResult == actualResult;
    }
}

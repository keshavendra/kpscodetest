package com.testds.leetcode.problems.largestPerimeterPolygon;

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
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{5, 5, 5}, 15},
                        {new int[]{1, 12, 1, 2, 5, 50, 3}, 12},
                        {new int[]{5, 5, 50}, -1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLargestPerimeterPolygon() {
        long actualResult = solution.largestPerimeter(nums);
        assertEquals(expectedResult, actualResult);
    }

}

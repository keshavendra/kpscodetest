package com.testds.leetcode.problems.minTimeToVisitAllPoints;

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
    public int[][] points;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{new int[]{1, 1}, new int[]{3, 4}, new int[]{-1, 0}}, 7},
                {new int[][]{new int[]{3, 2}, new int[]{-2, 2}}, 5}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinTimeToVisitAllPoints() {
        int actualResult = solution.minTimeToVisitAllPoints(points);
        assert expectedResult == actualResult;
    }
}

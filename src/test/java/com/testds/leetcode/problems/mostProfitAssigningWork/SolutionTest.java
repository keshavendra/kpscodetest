package com.testds.leetcode.problems.mostProfitAssigningWork;

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
    public int[] difficulty;

    @Parameterized.Parameter(1)
    public int[] profit;

    @Parameterized.Parameter(2)
    public int[] workers;

    @Parameterized.Parameter(3)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}, 100},
                        {new int[]{85, 47, 57}, new int[]{24, 66, 99}, new int[]{40, 25, 25}, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMostProfitAssigningWork() {
        int actualResult = solution.maxProfitAssignment(difficulty, profit, workers);
        assertEquals(expected, actualResult);
    }
}

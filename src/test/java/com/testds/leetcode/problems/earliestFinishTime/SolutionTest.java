package com.testds.leetcode.problems.earliestFinishTime;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] landStartTime;
    @Parameterized.Parameter(1)
    public int[] landDuration;
    @Parameterized.Parameter(2)
    public int[] waterStartTime;
    @Parameterized.Parameter(3)
    public int[] waterDuration;
    @Parameterized.Parameter(4)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 8}, new int[]{4, 1}, new int[]{6}, new int[]{3}, 9},
                {new int[]{5}, new int[]{3}, new int[]{1}, new int[]{10}, 14}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testEarliestFinishTime() {
        int actualResult = solution.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.dailyTemperatures;

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
    public int[] temperatures;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0}},
                        {new int[]{30, 40, 50, 60}, new int[]{1, 1, 1, 0}},
                        {new int[]{30, 60, 90}, new int[]{1, 1, 0}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDailyTemperatures() {
        int[] actualResult = solution.dailyTemperatures(temperatures);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

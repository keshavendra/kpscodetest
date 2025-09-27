package com.testds.leetcode.problems.numberOfValidTriangles;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 2, 3, 4}, 3},
                {new int[]{4, 2, 3, 4}, 4},
                {new int[]{24, 3, 82, 22, 35, 84, 19}, 10}
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
    public void testTriangleNumber() {
        Assert.assertEquals(expectedResult, solution.triangleNumber(nums));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

package com.testds.leetcode.problems.totalWaviness;

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
    public int num1;

    @Parameterized.Parameter(1)
    public int num2;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters(name = "Testing data with {0}, {1} and expecting result {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {120, 130, 3},
                {198, 202, 3},
                {4848, 4848, 2},
                {175, 3887, 3807}
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
    public void testTotalWaviness() {
        assertEquals(expectedResult, solution.totalWaviness(num1, num2));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

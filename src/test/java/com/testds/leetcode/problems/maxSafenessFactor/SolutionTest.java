package com.testds.leetcode.problems.maxSafenessFactor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public List<List<Integer>> grid;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {List.of(List.of(1, 0, 0), List.of(0, 0, 0), List.of(0, 0, 1)), 0},
                {List.of(List.of(0, 0, 1), List.of(0, 0, 0), List.of(0, 0, 0)), 2},
                {List.of(List.of(0, 0, 0, 1), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0), List.of(1, 0, 0, 0)), 2}
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
    public void testMaximumSafenessFactor() {
        assertEquals(expectedResult, solution.maximumSafenessFactor(grid));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

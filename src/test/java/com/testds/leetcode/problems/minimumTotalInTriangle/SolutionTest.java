package com.testds.leetcode.problems.minimumTotalInTriangle;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameter
    public List<List<Integer>> triangle;

    @Parameter(1)
    public int expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Test case 1: Example from LeetCode - minimum path sum 11
                {
                        Arrays.asList(
                                Collections.singletonList(2),
                                Arrays.asList(3, 4),
                                Arrays.asList(6, 5, 7),
                                Arrays.asList(4, 1, 8, 3)),
                        11},
                // Test case 2: Single element triangle
                {
                        Collections.singletonList(
                                Collections.singletonList(-10)),
                        -10},
                // Test case 3: Another example - minimum path sum -1
                {
                        Arrays.asList(
                                Collections.singletonList(-1),
                                Arrays.asList(2, 3),
                                Arrays.asList(1, -1, -3)),
                        -1},
                // Add more test cases as needed
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setup() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testMinimumTotal() {
        assertEquals(expected, solution.minimumTotal(triangle));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

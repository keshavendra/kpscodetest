package com.testds.leetcode.problems.rearrangeFruits;

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
    public int[] basket1;

    @Parameterized.Parameter(1)
    public int[] basket2;

    @Parameterized.Parameter(2)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 2, 2, 2}, new int[]{1, 4, 1, 2}, 1},
                        {new int[]{2, 3, 4, 1}, new int[]{3, 2, 5, 1}, -1},
                        {new int[]{4, 4, 4, 4, 3}, new int[]{5, 5, 5, 5, 3}, 8},
                        {new int[]{84, 80, 43, 8, 80, 88, 43, 14, 100, 88}, new int[]{32, 32, 42, 68, 68, 100, 42, 84, 14, 8}, 48}
                }
        );
    }

    public static Test suite(){
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testMinCost() {
        long actualResult = solution.minCost(basket1, basket2);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

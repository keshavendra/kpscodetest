package com.testds.leetcode.problems.numOfUnplacedFruits;

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
    public int[] fruits;

    @Parameterized.Parameter(1)
    public int[] baskets;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 2, 5}, new int[]{3, 5, 4}, 1},
                        {new int[]{3, 6, 1}, new int[]{6, 4, 7}, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testNumOfUnplacedFruits() {
        assertEquals(expectedResult, solution.numOfUnplacedFruits(fruits, baskets));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

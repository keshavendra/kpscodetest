package com.testds.leetcode.problems.minTimeToRepairCars;

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
    public int[] ranks;

    @Parameterized.Parameter(1)
    public int cars;

    @Parameterized.Parameter(2)
    public long minTime;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 2, 3, 1}, 10, 16},
                        {new int[]{5, 1, 8}, 6, 16}
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
    public void testMinTimeToRepairCars() {
        long actualResult = solution.repairCars(ranks, cars);
        assertEquals(minTime, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

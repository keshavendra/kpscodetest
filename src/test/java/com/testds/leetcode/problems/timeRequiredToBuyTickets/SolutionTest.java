package com.testds.leetcode.problems.timeRequiredToBuyTickets;

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
    public int[] tickets;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 3, 2}, 2, 6},
                        {new int[]{5, 1, 1, 1}, 0, 8}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testTimeRequiredToBuyTickets() {
        int actualResult = solution.timeRequiredToBuy(tickets, k);
        assertEquals(expectedResult, actualResult);
    }

}

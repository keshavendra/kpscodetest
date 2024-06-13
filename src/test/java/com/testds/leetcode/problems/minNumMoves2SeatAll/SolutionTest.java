package com.testds.leetcode.problems.minNumMoves2SeatAll;

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
    public int[] seats;

    @Parameterized.Parameter(1)
    public int[] students;

    @Parameterized.Parameter(2)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{3, 1, 5}, new int[]{2, 7, 4}, 4},
                        {new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6}, 7},
                        {new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6}, 4},
                        {new int[]{3, 20, 17, 2, 12, 15, 17, 4, 15, 20}, new int[]{10, 13, 14, 15, 5, 2, 3, 14, 3, 18}, 28}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinMovesToSeat() {
        int actual = solution.minMovesToSeat(students, seats);
        assertEquals(expected, actual);
    }

}

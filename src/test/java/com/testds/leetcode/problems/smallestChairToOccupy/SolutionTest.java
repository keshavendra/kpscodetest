package com.testds.leetcode.problems.smallestChairToOccupy;

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
    public int[][] times;

    @Parameterized.Parameter(1)
    public int targetFriend;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{1, 4}, {2, 3}, {4, 6}}, 1, 1},
                        {new int[][]{{3, 10}, {1, 5}, {2, 6}}, 0, 2},
                        {new int[][]{{33889, 98676}, {80071, 89737}, {44118, 52565}, {52992, 84310}, {78492, 88209}, {21695, 67063}, {84622, 95452}, {98048, 98856}, {98411, 99433}, {55333, 56548}, {65375, 88566}, {55011, 62821}, {48548, 48656}, {87396, 94825}, {55273, 81868}, {75629, 91467}}, 6, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSmallestChairToOccupy() {
        int actualResult = solution.smallestChair(times, targetFriend);
        assertEquals(expectedResult, actualResult);
    }

}

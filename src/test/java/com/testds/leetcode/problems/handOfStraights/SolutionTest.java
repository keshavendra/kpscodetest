package com.testds.leetcode.problems.handOfStraights;

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
    public int[] hand;

    @Parameterized.Parameter(1)
    public int groupSize;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3, true},
                        {new int[]{1, 2, 3, 4, 5}, 4, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testHandOfStraights() {
        boolean actualResult = solution.isNStraightHand(hand, groupSize);
        assertEquals(expectedResult, actualResult);
    }

}

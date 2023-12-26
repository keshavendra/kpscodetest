package com.testds.leetcode.problems.numOfDiceRollWithTargetSum;

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
    public int dices;

    @Parameterized.Parameter(1)
    public int faces;

    @Parameterized.Parameter(2)
    public int target;

    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {1, 6, 3, 1},
                        {2, 6, 7, 6},
                        {30, 30, 500, 222616187},
                        {1, 2, 3, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testNumOfDiceRollWithTargetSum() {
        int actualResult = solution.numRollsToTarget(dices, faces, target);
        assertEquals(expectedResult, actualResult);
    }

}

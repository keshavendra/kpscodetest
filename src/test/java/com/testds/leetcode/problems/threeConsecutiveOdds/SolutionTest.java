package com.testds.leetcode.problems.threeConsecutiveOdds;

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
    public int[] arr;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 6, 4, 1}, false},
                        {new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}, true},
                        {new int[]{1, 1, 1}, true}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testThreeConsecutiveOdds() {
        boolean actualResult = solution.threeConsecutiveOdds(arr);
        assertEquals(expectedResult, actualResult);
    }

}

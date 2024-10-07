package com.testds.leetcode.problems.ifPairsCanBeMadeForK;

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
    public int k;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5, true},
                        {new int[]{-1, 1, -2, 2, -3, 3, -4, 4}, 3, true},
                        {new int[]{-4, -7, 5, 2, 9, 1, 10, 4, -8, -3}, 3, true}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIfPairsCanBeMadeForK() {
        boolean actualResult = solution.canArrange(arr, k);
        assertEquals(expectedResult, actualResult);
    }
}

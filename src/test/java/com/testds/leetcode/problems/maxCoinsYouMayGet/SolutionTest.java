package com.testds.leetcode.problems.maxCoinsYouMayGet;

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
    public int[] piles;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 4, 1, 2, 7, 8}, 9},
                        {new int[]{2, 4, 5}, 4},
                        {new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}, 18}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxCoins() {
        int actualResult = solution.maxCoins(piles);
        assert expectedResult == actualResult;
    }

}

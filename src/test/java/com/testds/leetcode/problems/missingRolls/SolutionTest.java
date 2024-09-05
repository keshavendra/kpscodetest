package com.testds.leetcode.problems.missingRolls;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] rolls;

    @Parameterized.Parameter(1)
    public int mean;

    @Parameterized.Parameter(2)
    public int n;

    @Parameterized.Parameter(3)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{

                        {new int[]{3, 2, 4, 3}, 4, 2, new int[]{6, 6}},
                        {new int[]{1, 5, 6}, 3, 4, new int[]{3, 2, 2, 2}},
                        {new int[]{1, 2, 3, 4}, 6, 4, new int[]{}},
                        {new int[]{6, 3, 4, 3, 5, 3}, 1, 6, new int[]{}},
                        {new int[]{4, 2, 2, 5, 4, 5, 4, 5, 3, 3, 6, 1, 2, 4, 2, 1, 6, 5, 4, 2, 3, 4, 2, 3, 3, 5, 4, 1, 4, 4, 5, 3, 6, 1, 5, 2, 3, 3, 6, 1, 6, 4, 1, 3}, 2, 53, new int[]{}}

                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMissingRolls() {
        int[] actualResult = solution.missingRolls(rolls, mean, n);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}

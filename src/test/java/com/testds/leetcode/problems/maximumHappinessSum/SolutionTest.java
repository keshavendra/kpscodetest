package com.testds.leetcode.problems.maximumHappinessSum;

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
    public int[] happiness;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3}, 2, 4},
                        {new int[]{1, 1, 1, 1}, 2, 1},
                        {new int[]{2, 3, 4, 5}, 1, 5},
                        {new int[]{12, 1, 42}, 3, 53}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaximumHappinessSum() {
        long actualResult = solution.maximumHappinessSum(happiness, k);
        assertEquals(expectedResult, actualResult);
    }

}

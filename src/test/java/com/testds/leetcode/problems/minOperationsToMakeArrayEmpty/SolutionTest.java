package com.testds.leetcode.problems.minOperationsToMakeArrayEmpty;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    public final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}, 4},
                        {new int[]{2, 1, 2, 2, 3, 3}, -1},
                        {new int[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}, 5},
                        {new int[]{13, 7, 13, 7, 13, 7, 13, 13, 7}, 4}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinOperationsToMakeArrayEmpty() {
        int actualResult = solution.minOperations(nums);
        assertEquals(expectedResult, actualResult);
    }

}

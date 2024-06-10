package com.testds.leetcode.problems.heightChecker;

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
    public int[] height;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 1, 4, 2, 1, 3}, 3},
                        {new int[]{5, 1, 2, 3, 4}, 5},
                        {new int[]{1, 2, 3, 4, 5}, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testHeightChecker() {
        int actualResult = solution.heightChecker(height);
        assertEquals(expectedResult, actualResult);
    }

}

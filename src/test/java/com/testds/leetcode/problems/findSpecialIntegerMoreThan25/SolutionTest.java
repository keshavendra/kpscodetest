package com.testds.leetcode.problems.findSpecialIntegerMoreThan25;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}, 6},
                        {new int[]{1, 1}, 1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindSpecialIntegerMoreThan25() {
        int actualResult = solution.findSpecialInteger(arr);
        assertEquals(expectedResult, actualResult);
    }

}

package com.testds.leetcode.problems.findLeastNumOfUniqueInts;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{5, 5, 4}, 1, 1},
                        {new int[]{4, 3, 1, 1, 3, 3, 2}, 3, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindLeastNumOfUniqueInts() {
        int actualResult = solution.findLeastNumOfUniqueInts(arr, k);
        assertEquals(expectedResult, actualResult);
    }

}

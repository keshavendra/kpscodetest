package com.testds.leetcode.problems.uniqueOccurrences;

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
                        {new int[]{1, 2, 2, 1, 1, 3}, true},
                        {new int[]{1, 2}, false},
                        {new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}, true}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testUniqueOccurrences() {
        boolean actualResult = solution.uniqueOccurrences(arr);
        assertEquals(expectedResult, actualResult);
    }

}

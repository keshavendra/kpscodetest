package com.testds.leetcode.problems.findTheDuplicate;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 3, 4, 2, 2}, 2},
                        {new int[]{3, 1, 3, 4, 2}, 3},
                        {new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1}, 9}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindTheDuplicate() {
        int actualResult = solution.findDuplicate(nums);
        assertEquals(expectedResult, actualResult);
    }

}

package com.testds.leetcode.problems.findIfArrayCanBeSortedWithAdjacentSwaps;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{8, 4, 2, 30, 15}, true},
                        {new int[]{1, 2, 3, 4, 5}, true},
                        {new int[]{3, 16, 8, 4, 2}, false},
                        {new int[]{136, 256, 10}, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindIfArrayCanBeSortedWithAdjacentSwaps() {
        boolean actualResult = solution.canSortArray(nums);
        assertEquals(expectedResult, actualResult);
    }

}

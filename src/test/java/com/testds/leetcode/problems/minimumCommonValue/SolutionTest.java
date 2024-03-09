package com.testds.leetcode.problems.minimumCommonValue;

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
    public int[] nums1;

    @Parameterized.Parameter(1)
    public int[] nums2;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3}, new int[]{2, 4}, 2},
                        {new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinimumCommonValue() {
        int actualResult = solution.getCommon(nums1, nums2);
        assertEquals(expectedResult, actualResult);
    }

}

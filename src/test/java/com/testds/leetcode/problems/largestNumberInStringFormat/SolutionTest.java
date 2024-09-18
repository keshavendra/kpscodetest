package com.testds.leetcode.problems.largestNumberInStringFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private static final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{10, 2}, "210"},
                        {new int[]{3, 30, 34, 5, 9}, "9534330"},
                        {new int[]{34, 30}, "3430"},
                        {new int[]{34323, 3432}, "343234323"},
                        {new int[]{8308, 8308, 830}, "83088308830"},
                        {new int[]{0, 0}, "0"},
                        {new int[]{3, 43, 48, 94, 85, 33, 64, 32, 63, 66}, "9485666463484333332"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @org.junit.Test
    public void testLargestNumberInStringFormat() {
        String actualResult = solution.largestNumber(nums);
        assertEquals(expectedResult, actualResult);
    }

}

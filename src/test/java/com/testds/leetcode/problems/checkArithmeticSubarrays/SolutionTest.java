package com.testds.leetcode.problems.checkArithmeticSubarrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[] l;

    @Parameterized.Parameter(2)
    public int[] r;

    @Parameterized.Parameter(3)
    public List<Boolean> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new int[]{4, 6, 5, 9, 3, 7},
                        new int[]{0, 0, 2},
                        new int[]{2, 3, 5},
                        Arrays.asList(true, false, true)
                },
                {
                        new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10},
                        new int[]{0, 1, 6, 4, 8, 7},
                        new int[]{4, 4, 9, 7, 9, 10},
                        Arrays.asList(false, true, false, false, true, true)
                }
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCheckArithmeticSubarrays() {
        List<Boolean> actualResult = solution.checkArithmeticSubarrays(nums, l, r);
        Assert.assertEquals(expectedResult, actualResult);
    }

}

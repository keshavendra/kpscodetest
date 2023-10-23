package com.testds.leetcode.problems.minMaxPairSumInArray;

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
                        {new int[]{3, 5, 2, 3}, 7},
                        {new int[]{3, 5, 4, 2, 4, 6}, 8}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinMaxPairSumInArray() {
        int actualResult = solution.minPairSum(nums);
        assert expectedResult == actualResult;
    }

    @org.junit.Test
    public void testMinMaxPairSumInArray1() {
        int actualResult = solution.minPairSum1(nums);
        assert expectedResult == actualResult;
    }

}

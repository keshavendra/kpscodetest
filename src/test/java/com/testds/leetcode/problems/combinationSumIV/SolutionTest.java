package com.testds.leetcode.problems.combinationSumIV;

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
    public int target;
    @Parameterized.Parameter(2)
    public int combinations;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3}, 4, 7},
                {new int[]{9}, 3, 0},
                {new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25}, 10, 9}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCombinationOfNumsForATarget() {
        int actualResult = solution.combinationSum4(nums, target);
        assert combinations == actualResult;
    }

}

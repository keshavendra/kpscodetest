package com.testds.leetcode.problems.generatedMaxFrequency;

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
    public int k;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4}, 5, 3},
                {new int[]{1, 4, 8, 13}, 5, 2},
                {new int[]{3, 9, 6}, 2, 1},
                {new int[]{4, 4, 4, 4}, 5, 4}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testGeneratedMaxFrequency() {
        int actualResult = solution.maxFrequency(nums, k);
        assert expectedResult == actualResult;
    }

}

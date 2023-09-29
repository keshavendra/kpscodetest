package com.testds.leetcode.problems.monotonicArray;

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
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 2, 3}, true},
                        {new int[]{6, 5, 4, 4}, true},
                        {new int[]{1, 3, 2}, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMonotonicArray() {
        boolean actualResult = solution.isMonotonic(nums);
        assert expectedResult == actualResult;
    }
}

package com.testds.leetcode.problems.largestDivisibleSubset;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3}, Arrays.asList(1, 2)},
                        {new int[]{1, 2, 4, 8}, Arrays.asList(1, 2, 3, 4)},
                        {new int[]{5, 9, 18, 54, 108, 540, 90, 180, 360, 720}, Arrays.asList(9, 18, 90, 180, 360, 720)}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLargestDivisibleSubset() {
        List<Integer> actualResult = solution.largestDivisibleSubset(nums);
        assertEquals(expectedResult.size(), actualResult.size());
    }

}

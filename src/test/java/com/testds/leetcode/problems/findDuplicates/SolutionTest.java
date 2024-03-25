package com.testds.leetcode.problems.findDuplicates;

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
    public Integer[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 3, 2, 7, 8, 2, 3, 1}, new Integer[]{2, 3}},
                        {new int[]{1, 1, 2}, new Integer[]{1}},
                        {new int[]{1}, new Integer[]{}},
                        {new int[]{2, 2}, new Integer[]{2}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindDuplicates() {
        List<Integer> actualResult = solution.findDuplicates(nums);
        assert actualResult.containsAll(Arrays.asList(expectedResult));
        assert Arrays.asList(expectedResult).containsAll(actualResult);
    }

}

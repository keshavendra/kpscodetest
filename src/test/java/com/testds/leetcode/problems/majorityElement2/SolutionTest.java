package com.testds.leetcode.problems.majorityElement2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
                        {new int[]{3, 2, 3}, Collections.singletonList(3)},
                        {new int[]{1}, Collections.singletonList(1)},
                        {new int[]{1, 2}, Arrays.asList(1, 2)},
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMajorityElement2() {
        List<Integer> actualResult = solution.majorityElement(nums);
        assertEquals(expectedResult,actualResult);
    }
}

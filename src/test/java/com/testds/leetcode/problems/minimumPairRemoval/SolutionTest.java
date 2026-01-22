package com.testds.leetcode.problems.minimumPairRemoval;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{5, 2, 3, 1}, 2},
                {new int[]{1, 2, 2}, 0}
        });
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testMinPairRemoval() {
        int actualResult = solution.minimumPairRemoval(nums);
        assertEquals(expected, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

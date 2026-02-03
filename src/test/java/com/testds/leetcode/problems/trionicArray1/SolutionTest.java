package com.testds.leetcode.problems.trionicArray1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
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
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 5, 4, 2, 6}, true},
                {new int[]{2, 1, 3}, false},
                {new int[]{0, 2, 1, 3}, true},
                {new int[]{2, 4, 3, 3}, false},
                {new int[]{6, 8, 2, 5, 9}, true}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void isTrionic() {
        assertEquals(expected, solution.isTrionic(nums));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
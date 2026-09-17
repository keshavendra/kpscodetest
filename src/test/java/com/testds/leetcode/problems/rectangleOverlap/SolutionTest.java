package com.testds.leetcode.problems.rectangleOverlap;

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
    public int[] rec1;

    @Parameterized.Parameter(1)
    public int[] rec2;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}, true},
                {new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}, false},
                {new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3}, false}
        });
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testIsRectangleOverlap() {
        assertEquals(expectedResult, solution.isRectangleOverlap(rec1, rec2));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

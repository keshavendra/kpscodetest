package com.testds.leetcode.problems.isReachableAtTime;

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
    public int sx;

    @Parameterized.Parameter(1)
    public int sy;

    @Parameterized.Parameter(2)
    public int fx;

    @Parameterized.Parameter(3)
    public int fy;

    @Parameterized.Parameter(4)
    public int t;

    @Parameterized.Parameter(5)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 4, 7, 7, 6, true},
                {3, 1, 7, 3, 3, false},
                {1, 1, 1, 1, 3, true}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIsReachableAtTime() {
        boolean actualResult = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertEquals(expectedResult, actualResult);
    }

}

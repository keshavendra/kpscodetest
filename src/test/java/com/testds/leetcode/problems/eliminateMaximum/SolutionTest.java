package com.testds.leetcode.problems.eliminateMaximum;

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
    public int[] dist;

    @Parameterized.Parameter(1)
    public int[] speed;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 4}, new int[]{1, 1, 1}, 3},
                {new int[]{1, 1, 2, 3}, new int[]{1, 1, 1, 1}, 1},
                {new int[]{3, 2, 4}, new int[]{5, 3, 2}, 1}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testEliminateMaximum() {
        int actualResult = solution.eliminateMaximum(dist,speed);
        assert expectedResult == actualResult;
    }
}

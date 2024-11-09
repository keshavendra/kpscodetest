package com.testds.leetcode.problems.minArrayEnd;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public int n;

    @Parameterized.Parameter(1)
    public int x;

    @Parameterized.Parameter(2)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {3, 4, 6},
                        {2, 7, 15}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinArrayEnd() {
        long actualResult = solution.minEnd(n, x);
        assertEquals(expectedResult, actualResult);
    }

}

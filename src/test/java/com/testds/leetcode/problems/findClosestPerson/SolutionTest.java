package com.testds.leetcode.problems.findClosestPerson;

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
    public int x;
    @Parameterized.Parameter(1)
    public int y;
    @Parameterized.Parameter(2)
    public int z;
    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {2, 7, 4, 1},
                        {2, 5, 6, 2},
                        {1, 5, 3, 0}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testFindClosest() {
        assertEquals(expectedResult, solution.findClosest(x, y, z));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}

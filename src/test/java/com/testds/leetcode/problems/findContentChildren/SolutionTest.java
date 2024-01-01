package com.testds.leetcode.problems.findContentChildren;

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
    public int[] g;

    @Parameterized.Parameter(1)
    public int[] s;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3}, new int[]{1, 1}, 1},
                        {new int[]{1, 2}, new int[]{1, 2, 3}, 2}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindContentChildren() {
        int actualResult = solution.findContentChildren(g, s);
        assertEquals(expectedResult, actualResult);
    }

}

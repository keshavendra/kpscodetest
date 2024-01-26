package com.testds.leetcode.problems.calculatePaths;

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
    public int m;

    @Parameterized.Parameter(1)
    public int n;

    @Parameterized.Parameter(2)
    public int maxMove;

    @Parameterized.Parameter(3)
    public int startRow;

    @Parameterized.Parameter(4)
    public int startColumn;

    @Parameterized.Parameter(5)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {2, 2, 2, 0, 0, 6},
                        {1, 3, 3, 0, 1, 12},
                        {8, 7, 16, 1, 5, 102984580},
                        {8, 50, 23, 5, 26, 914783380}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindPaths() {
        int actualResult = solution.findPaths(m, n, maxMove, startRow, startColumn);
        assertEquals(expectedResult, actualResult);
    }
}

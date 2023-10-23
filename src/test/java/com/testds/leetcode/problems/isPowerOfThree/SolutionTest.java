package com.testds.leetcode.problems.isPowerOfThree;

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
    public int n;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {0, false},
                        {1, true},
                        {2, false},
                        {3, true},
                        {8, false},
                        {-1, false},
                        {9, true}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIsPowerOfThree() {
        boolean actualResult = solution.isPowerOfThree(n);
        assert expectedResult == actualResult;
    }

}

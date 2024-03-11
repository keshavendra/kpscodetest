package com.testds.leetcode.problems.customSortString;

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
    public String order;

    @Parameterized.Parameter(1)
    public String s;

    @Parameterized.Parameter(2)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"cba", "abcd", "cbad"},
                        {"bcafg", "abcd", "bcad"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCustomSortString() {
        String actualResult = solution.customSortString(order, s);
        assertEquals(expectedResult, actualResult);
    }

}

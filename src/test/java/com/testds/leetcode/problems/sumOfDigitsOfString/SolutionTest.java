package com.testds.leetcode.problems.sumOfDigitsOfString;

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
    public String s;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"vbyytoijnbgtyrjlsc", 2, 15},
                        {"iiii", 1, 36},
                        {"leetcode", 2, 6},
                        {"zbax", 2, 8}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSumOfDigitsOfString() {
        int actualResult = solution.getLucky(s, k);
        assertEquals(expectedResult, actualResult);
    }

}

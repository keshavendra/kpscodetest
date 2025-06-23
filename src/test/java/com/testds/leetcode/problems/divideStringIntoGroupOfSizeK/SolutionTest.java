package com.testds.leetcode.problems.divideStringIntoGroupOfSizeK;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public String s;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public char fill;

    @Parameterized.Parameter(3)
    public String[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"abcdefghi", 3, 'x', new String[]{"abc", "def", "ghi"}},
                        {"abcdefghij", 3, 'x', new String[]{"abc", "def", "ghi", "jxx"}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testDivideString() {
        String[] actualResult = solution.divideString(s, k, fill);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

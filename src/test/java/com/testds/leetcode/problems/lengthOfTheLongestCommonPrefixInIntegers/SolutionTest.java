package com.testds.leetcode.problems.lengthOfTheLongestCommonPrefixInIntegers;

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
    public int[] arr1;

    @Parameterized.Parameter(1)
    public int[] arr2;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 10, 100}, new int[]{1000}, 3},
                {new int[]{1, 2, 3}, new int[]{4, 4, 4}, 0}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void test() {
        assertEquals(expectedResult, solution.longestCommonPrefix(arr1, arr2));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

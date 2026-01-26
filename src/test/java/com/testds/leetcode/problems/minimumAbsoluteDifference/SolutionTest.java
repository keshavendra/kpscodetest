package com.testds.leetcode.problems.minimumAbsoluteDifference;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] arr;

    @Parameterized.Parameter(1)
    public List<List<Integer>> expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 2, 1, 3}, Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 4))},
                {new int[]{1, 3, 6, 10, 15}, Collections.singletonList(Arrays.asList(1, 3))},
                {new int[]{3, 8, -10, 23, 19, -4, -14, 27}, Arrays.asList(Arrays.asList(-14, -10), Arrays.asList(19, 23), Arrays.asList(23, 27))}
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
    public void testMinimumAbsoluteDifference() {
        List<List<Integer>> actualResult = solution.minimumAbsDifference(arr);
        assertEquals(expected, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}

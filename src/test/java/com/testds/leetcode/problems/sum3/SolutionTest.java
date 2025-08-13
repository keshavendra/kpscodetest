package com.testds.leetcode.problems.sum3;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SolutionTest {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public List<List<Integer>> expectedResult;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testThreeSum() {
        List<List<Integer>> actualResult = solution.threeSum(nums);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Parameters(name = "{index}: Test Three Sum with nums {0} and expectedResult {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new int[]{-1, 0, 1, 2, -1, -4},
                                Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))
                        },
                        {
                                new int[]{0, 1, 1}, Collections.emptyList()
                        },
                        {
                                new int[]{0, 0, 0}, Collections.singletonList(Arrays.asList(0, 0, 0))
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }
}